package com.plr.iso29110.localisation.maven.plugin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.JarURLConnection;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Pattern;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

import com.google.common.base.Splitter;

/**
 * Says "Hi" to the user.
 * 
 * @goal doit
 */
public class GenarateLocalisedSource extends AbstractMojo {

	private static final String PROPERTIES = ".properties";

	private static final String BASIC_TOOL_CLASS = "_BaseLocalTool";

	/**
	 * 
	 * @parameter expression="${basedir}" default-value="."
	 */
	private String basedir;

	/**
	 * 
	 * @parameter expression="${packageName}" default-value="nios.gen"
	 */
	private String packageName;

	/**
	 * 
	 * @parameter expression="${propertiesFileDirectory}"
	 *            default-value="src/main/resources"
	 */
	private String propertiesFileDirectory;

	/**
	 * 
	 * @parameter expression="${targetDirectory}" default-value="src/main/java"
	 */
	private String targetDirectory;

	static Splitter split = Splitter.on('_');

	private TreeSet<PropFile> propFileSet = new TreeSet<>();

	File dir = null;

	@Override
	public void execute() throws MojoExecutionException {
		getLog().info("Basedir " + basedir);

		try {
			createTargetDirectory();

			copyBaseClass();

			extractProperties();

		} catch (Exception e) {
			throw new MojoExecutionException(e.getMessage(), e);
		}
	}

	private void createTargetDirectory() throws IOException {

		dir = new File(basedir, targetDirectory);

		dir = new File(dir, packageName.replace('.', '/'));

		// delete directory tree
		if (dir.exists()) {

			Path dirPath = Paths.get(dir.getCanonicalPath());

			Files.walkFileTree(dirPath, new SimpleFileVisitor<Path>() {

				@Override
				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
					Files.delete(file);
					return FileVisitResult.CONTINUE;
				}

				@Override
				public FileVisitResult postVisitDirectory(Path dir, IOException e) throws IOException {
					if (e == null) {
						Files.delete(dir);
						return FileVisitResult.CONTINUE;
					}
					throw e;
				}
			});

		}

		dir.mkdirs();

	}

	private void copyBaseClass() throws Exception {
		URL url = this.getClass().getResource("/" + BASIC_TOOL_CLASS + ".java");

		if (url == null) {
			throw new MojoExecutionException("Resource " + "/" + BASIC_TOOL_CLASS + ".java" + " NOT FOUND!");
		}

		URI uri = url.toURI();

		JarURLConnection jarConnection = (JarURLConnection) url.openConnection();

		getLog().warn("" + uri);

		StringBuilder fileData = new StringBuilder();
		try (InputStream in = jarConnection.getInputStream();
				BufferedReader reader = new BufferedReader(new InputStreamReader(in, Charset.forName("UTF-8")))) {

			char[] buf = new char[1024];
			int numRead = 0;

			while ((numRead = reader.read(buf)) != -1) {

				String readData = String.valueOf(buf, 0, numRead);

				fileData.append(readData);
			}

			in.close();
		}

		Pattern packageNamePattern = Pattern.compile("\\$\\{packageName\\}");
		Pattern classNamePattern = Pattern.compile("\\$\\{className\\}");

		String clean = packageNamePattern.matcher(fileData).replaceAll(packageName);

		clean = classNamePattern.matcher(clean).replaceAll(BASIC_TOOL_CLASS);

		File targetFile = new File(dir, "" + BASIC_TOOL_CLASS + ".java");

		// if file doesnt exists, then create it
		if (!targetFile.exists()) {
			targetFile.createNewFile();
		}

		getLog().info(targetFile.getAbsolutePath());

		try (FileWriter fw = new FileWriter(targetFile); BufferedWriter bw = new BufferedWriter(fw);) {
			bw.write(clean);
		}

	}

	private void extractProperties() {

		File resourcesdir = new File(basedir, propertiesFileDirectory);

		File[] files = resourcesdir.listFiles(new FileFilter() {

			@Override
			public boolean accept(File pathname) {
				return pathname.getName().endsWith(PROPERTIES);
			}
		});

		for (File propertyFile : files) {
			getLog().info("f - " + propertyFile.getPath());

			String fName = propertyFile.getName();

			fName = fName.substring(0, fName.length() - PROPERTIES.length());

			Iterator<String> it = split.split(fName).iterator();

			String name = it.hasNext() ? it.next() : null;
			String lang = it.hasNext() ? it.next() : null;
			String country = it.hasNext() ? it.next() : null;

			Properties prop = new Properties();

			try (FileInputStream inStream = new FileInputStream(propertyFile);) {
				prop.load(inStream);
			} catch (Exception e) {
				getLog().warn(e);
			}

			PropFile pf = new PropFile(name, lang, country, prop);

			propFileSet.add(pf);
		}

		getLog().info("" + propFileSet);

		TreeMap<String, Properties> map = new TreeMap<String, Properties>();

		for (PropFile propFile : propFileSet) {

			Properties prop = map.get(propFile.getName());
			if (prop == null) {
				prop = new Properties();
				map.put(propFile.getName(), prop);
			}

			prop.putAll(propFile.getProperties());
		}

		HumanComparator comp = new HumanComparator();

		for (Map.Entry<String, Properties> en : map.entrySet()) {

			String name = en.getKey();

			Set<String> keys = new TreeSet<>(comp);

			keys.addAll(en.getValue().stringPropertyNames());

			try {
				createFile(name, keys);
			} catch (Exception e) {
				getLog().warn(e);
			}
		}
	}

	Pattern func = Pattern.compile("[\\s\\.\\\\//]");

	private void createFile(String name, Set<String> keys) throws Exception {

		File f = new File(dir, name + ".java");
		if (!f.exists()) {
			f.createNewFile();
		}

		PrintWriter pw = null;
		try {
			pw = new PrintWriter(f);
			pw.println("package " + packageName.replace('/', '.') + ";");
			pw.println();

			pw.println("import java.util.Locale;");
			pw.println();

			pw.println("public class " + name + " {");
			pw.println("final public static String BASENAME = \"" + name + "\";");
			for (String param : keys) {

				pw.println();
				
				String funcName = func.matcher(param).replaceAll("_");
				
				//funcName = funcName.toLowerCase();
				
				pw.println("static public String " + funcName + "(Locale webUserLocale) {");
				pw.println("\treturn " + BASIC_TOOL_CLASS + ".getValue(BASENAME, webUserLocale, \"" + param + "\");");
				pw.println("}");

			}

			pw.println("}");
		} finally {
			if (pw != null) {
				pw.flush();
				pw.close();
			}
		}
	}

	public String getPackageName() {
		return packageName;
	}

	public String getPropertiesFileDirectory() {
		return propertiesFileDirectory;
	}

	public String getTargetDirectory() {
		return targetDirectory;
	}

	public String getBaseDir() {
		return basedir;
	}

	public void setBasedir(String basedir2) {
		basedir = basedir2;
	}

}