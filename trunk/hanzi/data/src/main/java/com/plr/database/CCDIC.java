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
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;

import com.google.common.base.Splitter;
import com.plr.cvstojson.Pinyin;

public class CCDIC {

	final public static String driver = "org.apache.derby.jdbc.EmbeddedDriver";

	final public static String protocol = "jdbc:derby:";

	private static String dir = "CCDIC";

	private static String dbURL = protocol + dir + ";create=true";

	// jdbc Connection
	private static Connection conn = null;

	public static void main(String[] args) {

		new CCDIC().doit();

	}

	private void doit() {
		try {

			FileUtils.deleteDirectory(new File(dir));
			createConnection();

			createTable();

			pushData();

			getHanzi();
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

	private void pushData() throws Exception {

		String fn = "src/main/resources/com/plr/cvstojson/cedict_ts.u8";

		Splitter s = Splitter.on(' ').limit(3);
		Splitter sdef = Splitter.on('/').omitEmptyStrings().trimResults();
		Splitter sdefv = Splitter.on(',').omitEmptyStrings().trimResults();

		int baseID = -1;
		String line = null;
		int defId = -1;

		try (BufferedReader br = new BufferedReader(new FileReader(fn));
				PreparedStatement updateemp = conn.prepareStatement("insert into Base ("
						+ "TRAD, MODERN , PINYIN , PINYIN2 ) values(?,?,?,?)", Statement.RETURN_GENERATED_KEYS);

				PreparedStatement stmtDef = conn.prepareStatement("insert into DEFINITION (" + "DEF ) values(?)",
						Statement.RETURN_GENERATED_KEYS);

				PreparedStatement stmtClf = conn.prepareStatement(
						"insert into CLASSIFIER (CLFT,CLFM,PINYIN,PINYIN2) values(?,?,?,?)", Statement.RETURN_GENERATED_KEYS);

				// return "Create Table CLASSIFIER ("
				// +
				// "ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
				// + "CLFT CHAR(1),"
				// + "CLFM CHAR(1) not null UNIQUE,"
				// + "PINYIN VARCHAR(6),"
				// + "PINYIN2 VARCHAR(6),"
				// + "PRIMARY KEY (ID))";

				PreparedStatement stmtClfs = conn.prepareStatement("select ID from CLASSIFIER where CLFM = ?");

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

						String tr;
						String md;

						if (sd.indexOf('|') != -1) {
							tr = sd.substring(0, 1);
							md = sd.substring(2, 3);
						} else {
							tr = sd.substring(0, 1);
							md = tr;
						}
						
						String pinyinc = sd.substring(sd.indexOf('[') + 1,  sd.indexOf(']'));

						String pinyinc2 = Pinyin.convertToAccent(pinyinc);

						for (String classifier : sdefv.split(sd)) {
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

	private void createTable() throws SQLException {

		new CCDIC.CreateTable() {

			@Override
			String getStatemeent() {
				return "Create Table BASE (" + "ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
						+ "TRAD VARCHAR(45) not null, " + "MODERN VARCHAR(45) not null, " + "PINYIN VARCHAR(150) not null, "
						+ "PINYIN2 VARCHAR(150) not null, " + "PRIMARY KEY (ID))";
			}
		}.execute();

		new CCDIC.CreateTable() {

			@Override
			String getStatemeent() {
				return "Create Table DEFINITION ("
						+ "ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
						+ "DEF VARCHAR(1500) not null UNIQUE," + "PRIMARY KEY (ID))";
			}
		}.execute();

		new CCDIC.CreateTable() {

			@Override
			String getStatemeent() {
				return "Create Table BASE_DEF (" + "ID_BASE INTEGER, " + "ID_DEF INTEGER, " + "PRIMARY KEY (ID_BASE, ID_DEF))";
			}
		}.execute();

		new CCDIC.CreateTable() {

			@Override
			String getStatemeent() {
				return "Create Table CLASSIFIER ("
						+ "ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1)," + "CLFT CHAR(1),"
						+ "CLFM CHAR(1) not null UNIQUE," + "PINYIN VARCHAR(7)," + "PINYIN2 VARCHAR(7)," + "PRIMARY KEY (ID))";
			}
		}.execute();

		new CCDIC.CreateTable() {

			@Override
			String getStatemeent() {
				return "Create Table BASE_CLASS (" + "ID_BASE INTEGER, " + "ID_CLF INTEGER, " + "PRIMARY KEY (ID_BASE, ID_CLF))";
			}
		}.execute();

		new CCDIC.CreateIndex() {

			@Override
			String getStatemeent() {
				return "CREATE INDEX DEFIDX ON DEFINITION (DEF)";
			}
		}.execute();

		new CCDIC.CreateIndex() {

			@Override
			String getStatemeent() {
				return "CREATE INDEX CLFIDX ON CLASSIFIER (CLFM)";
			}
		}.execute();
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

	abstract class CreateTable {

		public void execute() throws SQLException {

			try (Statement stmt = conn.createStatement();) {

				String createTable = getStatemeent();
				System.out.println(createTable);
				stmt.execute(createTable);
			} catch (SQLException e) {
				if (!e.getSQLState().equals("X0Y32"))
					throw e;
			}
		}

		abstract String getStatemeent();
	}

	abstract class CreateIndex {

		public void execute() throws SQLException {

			try (Statement stmt = conn.createStatement();) {

				String createTable = getStatemeent();
				System.out.println(createTable);
				stmt.execute(createTable);
			}
		}

		abstract String getStatemeent();
	}
}