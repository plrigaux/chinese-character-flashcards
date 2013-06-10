package com.plr.database;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;

import com.google.common.base.Splitter;
import com.plr.cvstojson.Pinyin;

public class CCDIC {

	final public static String driver = "org.apache.derby.jdbc.EmbeddedDriver";

	final public static String protocol = "jdbc:derby:";

	final public static String dir = "CCDIC";

	private static String dbURL = protocol + dir + ";create=true";

	// jdbc Connection
	static Connection conn = null;

	public static void main(String[] args) {

		new CCDIC().doit();

	}

	private void doit() {
		try {

			FileUtils.deleteDirectory(new File(dir));
			createConnection();

			createTable();

			pushData();

			//getHanzi();
		} catch (Exception e) {
			e.printStackTrace();
		}

		shutdown();// TODO Auto-generated method stub

	}

	private static void getHanzi() throws SQLException {

		try (Statement stmt = conn.createStatement();
				ResultSet results = stmt.executeQuery("select * from BASE where  length(MODERN) = 1 ");) {
			int i = 0;
			while (results.next()) {

				String restName = results.getString(3);
				String cityName = results.getString(4);
				System.out.println(i++ + " " + restName + "\t\t" + cityName + "\t\t" + results.getString(5));
			}
		}

	}

	static Splitter s = Splitter.on(' ').limit(3);
	static Splitter sdef = Splitter.on('/').omitEmptyStrings().trimResults();
	static Splitter sdefv = Splitter.on(',').omitEmptyStrings().trimResults();

	private void pushData() throws Exception {

		String fn = "src/main/resources/com/plr/cvstojson/cedict_ts.u8";

		int baseID = -1;
		String line = null;
		int defId = -1;

		try (BufferedReader br = new BufferedReader(new FileReader(fn));
				PreparedStatement updateemp = conn.prepareStatement("insert into Base ("
						+ "TRADITIONAL, SIMPLIFIED , PINYIN_NUM , PINYIN ) values(?,?,?,?)", Statement.RETURN_GENERATED_KEYS);

				PreparedStatement stmtDef = conn.prepareStatement("insert into DEFINITION (" + "DEF ) values(?)",
						Statement.RETURN_GENERATED_KEYS);

				PreparedStatement stmtClf = conn.prepareStatement(
						"insert into CLASSIFIER (TRADITIONAL,SIMPLIFIED,PINYIN_NUM,PINYIN) values(?,?,?,?)", Statement.RETURN_GENERATED_KEYS);

				// return "Create Table CLASSIFIER ("
				// +
				// "ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
				// + "CLFT CHAR(1),"
				// + "CLFM CHAR(1) not null UNIQUE,"
				// + "PINYIN VARCHAR(6),"
				// + "PINYIN2 VARCHAR(6),"
				// + "PRIMARY KEY (ID))";

				PreparedStatement stmtClfs = conn.prepareStatement("select ID from CLASSIFIER where SIMPLIFIED = ?");

				PreparedStatement stmtDefs = conn.prepareStatement("select ID from DEFINITION where DEF = ?");

				PreparedStatement stmtBase_Def = conn.prepareStatement("insert into BASE_DEF values(?, ?)");

				PreparedStatement stmtBase_Clf = conn.prepareStatement("insert into BASE_CLASS  values(?, ?)");

		) {
			line = br.readLine();

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

				updateemp.executeUpdate();
				baseID = -1;
				ResultSet rs = updateemp.getGeneratedKeys();
				if (rs.next()) {
					baseID = rs.getInt(1);
				}
				for (String sd : sdef.split(def)) {

					if (sd.startsWith("CL:")) {

						sd = sd.substring("CL:".length());

						classifier(baseID, stmtClf, stmtClfs, stmtBase_Clf, sd);
					} else {
						defId = -1;
						stmtDefs.setString(1, sd);

						ResultSet rs1 = stmtDefs.executeQuery();

						if (rs1.next()) {
							defId = rs1.getInt(1);
						} else {
							stmtDef.setString(1, sd);
							stmtDef.executeUpdate();

							rs1 = stmtDef.getGeneratedKeys();

							if (rs1.next()) {
								defId = rs1.getInt(1);
							}

						}

						if (defId != 1) {
							stmtBase_Def.setInt(1, baseID);
							stmtBase_Def.setInt(2, defId);
							try {
								stmtBase_Def.executeUpdate();
							} catch (SQLIntegrityConstraintViolationException e) {

							}
						}
					}
				}

			}

		} catch (Exception e) {
			System.out.println(line);
			System.out.println(baseID);
			System.out.println(defId);
			throw e;

		}
	}

	private void classifier(int baseID, PreparedStatement stmtClf, PreparedStatement stmtClfs, PreparedStatement stmtBase_Clf,
			String sd) throws SQLException {
		String tr;
		String md;

		for (String classifier : sdefv.split(sd)) {
			if (classifier.indexOf('|') != -1) {
				tr = classifier.substring(0, 1);
				md = classifier.substring(2, 3);
			} else {
				tr = classifier.substring(0, 1);
				md = tr;
			}

			String pinyinc = classifier.substring(classifier.indexOf('[') + 1, classifier.indexOf(']'));

			String pinyinc2 = Pinyin.convertToAccent(pinyinc);

			stmtClfs.setString(1, md);

			ResultSet rs1 = stmtClfs.executeQuery();
			int claId = -1;
			if (rs1.next()) {
				claId = rs1.getInt(1);
			} else {
				stmtClf.setString(1, tr);
				stmtClf.setString(2, md);
				stmtClf.setString(3, pinyinc);
				stmtClf.setString(4, pinyinc2);
				stmtClf.executeUpdate();

				rs1 = stmtClf.getGeneratedKeys();

				if (rs1.next()) {
					claId = rs1.getInt(1);
				}
			}

			if (claId != 1) {
				stmtBase_Clf.setInt(1, baseID);
				stmtBase_Clf.setInt(2, claId);

				try {
					stmtBase_Clf.executeUpdate();
				} catch (SQLIntegrityConstraintViolationException e) {

				}
			}
		}
	}

	static Splitter semicol = Splitter.on(';').trimResults().omitEmptyStrings();

	private void createTable() throws Exception {

		StringBuffer bf = new StringBuffer();

		try (InputStream u = this.getClass().getResourceAsStream("CCDIC.ddl"); DataInputStream in = new DataInputStream(u);

		BufferedReader br = new BufferedReader(new InputStreamReader(in));) {

			if (u == null) {
				System.err.println("snif");
			}

			String line = br.readLine();

			while (line != null) {
				bf.append(line);
				bf.append('\n');
				line = br.readLine();
			}
		}

		for (final String sql : semicol.split(bf)) {

			new Excutor() {

				@Override
				String getStatemeent() {
					return sql;
				}
			}.execute();
		}

	}

	static void createConnection() {
		try {
			Class.forName(driver).newInstance();
			// Get a connection
			conn = DriverManager.getConnection(dbURL);
		} catch (Exception except) {
			except.printStackTrace();
		}
	}

	static void shutdown() {
		try {

			if (conn != null) {
				DriverManager.getConnection(dbURL + ";shutdown=true");
				conn.close();
			}
		} catch (SQLException sqlExcept) {

		}

	}

	abstract class CreateTable {

		public void execute() throws SQLException {

			try (Statement stmt = conn.createStatement();) {
				String createTable = getStatemeent();
				System.out.println(createTable);
				stmt.execute(createTable);
			} catch (SQLException e) {
				if (!e.getSQLState().equals("X0Y32")) {
					
				} else if (!e.getSQLState().equals("42Y55")) {
					
				} else {
					throw e;
				}
					
			}
		}

		abstract String getStatemeent();
	}

	abstract class Excutor {

		public void execute() throws SQLException {

			try (Statement stmt = conn.createStatement();) {

				String createTable = getStatemeent();
				System.out.println(createTable);
				System.out.println();
				stmt.execute(createTable);
			}
		}

		abstract String getStatemeent();
	}
}