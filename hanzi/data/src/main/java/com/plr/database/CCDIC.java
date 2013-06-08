package com.plr.database;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;

import com.google.common.base.Splitter;
import com.plr.cvstojson.Pinyin;

public class CCDIC {
	private static String tableName = "restaurants";
	final public static String driver = "org.apache.derby.jdbc.EmbeddedDriver";

	final public static String protocol = "jdbc:derby:";

	// private static String dbURL =
	// "jdbc:derby://localhost:1527/myDB;create=true;user=me;password=mine";

	private static String dir = "CCDIC";

	private static String dbURL = "jdbc:derby:" + dir + ";create=true";

	// jdbc Connection
	private static Connection conn = null;

	public static void main(String[] args) {

		try {

			FileUtils.deleteDirectory(new File(dir));
			createConnection();

			createTable();

			pushData();

			getHanzi();
		} catch (Exception e) {
			e.printStackTrace();
		}

		shutdown();
	}

	private static void getHanzi() throws SQLException {

		try (Statement stmt = conn.createStatement();
				ResultSet results = stmt.executeQuery("select * from BASE where  length(MODERN) = 1 ");) {
int i = 0;
			while (results.next()) {

				String restName = results.getString(3);
				String cityName = results.getString(4);
				System.out.println(i++ + " " + restName + "\t\t" + cityName  + "\t\t" + results.getString(5));
			}
		}

	}

	private static void pushData() throws Exception {

		String fn = "src/main/resources/com/plr/cvstojson/cedict_ts.u8";

		Splitter s = Splitter.on(" ").limit(3);

		int maxmod = 0;
		int maxp = 0;
		int maxd = 0;

		try (BufferedReader br = new BufferedReader(new FileReader(fn));
				PreparedStatement updateemp = conn.prepareStatement("insert into Base ("
						+ "TRAD, MODERN , PINYIN , PINYIN2, DEF ) values(?,?,?,?,?)");) {
			String line = br.readLine();

			String trad;
			String mod;
			String pinyin;
			String def;

			while (line != null) {

				line = br.readLine();

				if (line == null)
					continue;

				if (!line.isEmpty() && line.charAt(0) == '#')
					continue;

				Iterator<String> it = s.split(line).iterator();

				trad = it.next();
				mod = it.next();
				String temp = it.next();

				int lastp = temp.indexOf(']');
				pinyin = temp.substring(temp.indexOf('[') + 1, lastp);
				def = temp.substring(lastp + 1);

				// System.out.println(mod + " " + pinyin );
				// System.out.println(def );

				String pinyin2 = Pinyin.convertToAccent(pinyin);
				
				updateemp.setString(1, trad);
				updateemp.setString(2, mod);
				updateemp.setString(3, pinyin);
				updateemp.setString(4, pinyin2);
				updateemp.setString(5, def);

				updateemp.executeUpdate();

				maxmod = Math.max(maxmod, mod.length());
				maxp = Math.max(maxp, pinyin.length());
				maxd = Math.max(maxd, def.length());

			}
			System.out.println(maxmod);
			System.out.println(maxp);
			System.out.println(maxd);
		}
	}

	private static void createTable() throws SQLException {

		try (Statement stmt = conn.createStatement();) {

			String createTable = "Create Table BASE ("
					+ "ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
					+ "TRAD VARCHAR(45) not null, " + "MODERN VARCHAR(45) not null, " + "PINYIN VARCHAR(150) not null, "
					+ "PINYIN2 VARCHAR(150) not null, "
					+ "DEF VARCHAR(1500) not null)";
			System.out.println(createTable);
			stmt.execute(createTable);
		} catch (SQLException e) {
			if (!e.getSQLState().equals("X0Y32"))
				throw e;
		}

	}

	private static void createConnection() {
		try {
			Class.forName(driver).newInstance();
			// Get a connection
			conn = DriverManager.getConnection(dbURL);
		} catch (Exception except) {
			except.printStackTrace();
		}
	}

	private static void shutdown() {
		try {

			if (conn != null) {
				DriverManager.getConnection(dbURL + ";shutdown=true");
				conn.close();
			}
		} catch (SQLException sqlExcept) {

		}

	}
}