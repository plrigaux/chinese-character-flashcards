package com.plr.fetcher;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import au.com.bytecode.opencsv.CSVReader;

import com.google.common.base.Splitter;
import com.plr.cvstojson.Pinyin;
import com.plr.database.CCDIC;

public class HSK4 extends CCDIC {

	public static void main(String[] args) {

		new HSK4().doit();

	}

	private void doit() {
		try {

			CCDIC.createConnection();

			//createTable();
			//doPartOfSpeach();
			// classifier();
			// doPinyin();
doMW2();
			// getHanzi();
		} catch (Exception e) {
			e.printStackTrace();
		}

		CCDIC.shutdown();// TODO Auto-generated method stub

	}

	private void doPartOfSpeach() throws Exception {

		try (PreparedStatement stmtDef = conn.prepareStatement("insert into HSK_PARTOFSPEECH (PARTOFSPEECH ) values(?)",
				Statement.RETURN_GENERATED_KEYS);
				PreparedStatement stmtBase_Clf = conn.prepareStatement("insert into HSK_BASE_PARTOFSPEECH  values(?, ?)");) {

		}

		Pattern simpleD = Pattern.compile("\\((.+?)\\)\\s+(.+)");

		try (PreparedStatement stmtClf = conn.prepareStatement(
				"insert into HSK_PARTOFSPEECH (PARTOFSPEECH, SIMPLIFIED ) values(?,?)", Statement.RETURN_GENERATED_KEYS);
				PreparedStatement stmtBase_Clf = conn.prepareStatement("insert into HSK_BASE_PARTOFSPEECH  values(?, ?)");
				PreparedStatement stmtBase_ClfSelect = conn
						.prepareStatement("select * from HSK_BASE_PARTOFSPEECH  where ID_BASE = ? and ID_POs = ?");
				PreparedStatement stmtClfs = conn.prepareStatement("select ID from HSK_PARTOFSPEECH where PARTOFSPEECH = ?");
				Statement stmt = conn.createStatement();) {
			ResultSet resultSet = stmt.executeQuery("Select id, TYPE from HSK_MAIN where TYPE is not null");

			while (resultSet.next()) {
				int baseID = resultSet.getInt(1);
				String mesureWord = resultSet.getString(2);

				for (String mw : spliterComma.split(mesureWord)) {

					if ("None".equals(mw)) {
						continue;
					}

					Matcher m = simpleD.matcher(mw);

					String simple = "";
					String engl = "";
					if (m.find()) {
						engl = m.group(2);
						simple = m.group(1);
					} else {
						engl = mw;
					}

					stmtClfs.setString(1, engl);

					ResultSet rs1 = stmtClfs.executeQuery();
					int claId = -1;
					if (rs1.next()) {
						claId = rs1.getInt(1);
					} else {

						stmtClf.setString(1, engl.trim());
						stmtClf.setString(2, simple.trim());

						stmtClf.executeUpdate();

						rs1 = stmtClf.getGeneratedKeys();

						if (rs1.next()) {
							claId = rs1.getInt(1);
						}
					}

					if (claId != 1) {
						stmtBase_ClfSelect.setInt(1, baseID);
						stmtBase_ClfSelect.setInt(2, claId);
						ResultSet rs2 = stmtBase_ClfSelect.executeQuery();

						if (!rs2.next()) {
							stmtBase_Clf.setInt(1, baseID);
							stmtBase_Clf.setInt(2, claId);

							try {
								stmtBase_Clf.executeUpdate();
							} catch (SQLIntegrityConstraintViolationException e) {

							}
						}
					}
				}

			}
		}

	}

	static Splitter spliterComma = Splitter.on(',').trimResults().omitEmptyStrings();

	private void classifier() throws Exception {

		try (PreparedStatement stmtClf = conn.prepareStatement("insert into HSK_CLASSIFIER (SIMPLIFIED ) values(?)",
				Statement.RETURN_GENERATED_KEYS);
				PreparedStatement stmtBase_Clf = conn.prepareStatement("insert into HSK_BASE_CLASS  values(?, ?)");
				PreparedStatement stmtBase_ClfSelect = conn
						.prepareStatement("select * from HSK_BASE_CLASS where ID_BASE = ? and ID_CLF = ?");
				PreparedStatement stmtClfs = conn.prepareStatement("select ID from HSK_CLASSIFIER where SIMPLIFIED = ?");
				Statement stmt = conn.createStatement();) {
			ResultSet resultSet = stmt.executeQuery("Select id, MESURE_WORD from HSK_MAIN where MESURE_WORD is not null");

			while (resultSet.next()) {
				int baseID = resultSet.getInt(1);
				String mesureWord = resultSet.getString(2);

				for (String mw : spliterComma.split(mesureWord)) {

					if ("None".equals(mw))
						continue;

					stmtClfs.setString(1, mw);

					ResultSet rs1 = stmtClfs.executeQuery();
					int claId = -1;
					if (rs1.next()) {
						claId = rs1.getInt(1);
					} else {
						stmtClf.setString(1, mw);

						stmtClf.executeUpdate();

						rs1 = stmtClf.getGeneratedKeys();

						if (rs1.next()) {
							claId = rs1.getInt(1);
						}
					}

					if (claId != 1) {
						stmtBase_ClfSelect.setInt(1, baseID);
						stmtBase_ClfSelect.setInt(2, claId);
						ResultSet rs2 = stmtBase_ClfSelect.executeQuery();

						if (!rs2.next()) {
							stmtBase_Clf.setInt(1, baseID);
							stmtBase_Clf.setInt(2, claId);

							try {
								stmtBase_Clf.executeUpdate();
							} catch (SQLIntegrityConstraintViolationException e) {

							}
						}
					}
				}

			}
		}

	}

	private void doPinyin() throws Exception {

		try (
		// Create a statement that will return updatable result sets
		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);) {
			// Primary key EmployeeID must be specified
			// so that the result set is updatable
			ResultSet resultSet = stmt.executeQuery("SELECT id, pinyin, pinyin_num FROM hsk_main");

			while (resultSet.next()) {
				String py = resultSet.getString(2);

				String py_num = Pinyin.convertToNum(py);

				resultSet.updateString(3, py_num);
				resultSet.updateRow();
			}

		} catch (SQLException e) {
		}
	}

	private void doMW2() throws Exception {
		String fn = "pizza3.csv";
		String minid = "1";
		List<String[]> csvRows = null;
		try (BufferedReader br = new BufferedReader(new FileReader(fn));) {

			CSVReader cvsReader = new CSVReader(br);

			csvRows = cvsReader.readAll();

			cvsReader.close();

		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}

		try (
		// Create a statement that will return updatable result sets
		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
				
				) {
			
			for (String[] ss : csvRows) {
				String mw = ss[1];
				String trad = ss[2];
				trad = "Same".equals(trad) ? mw : "".equals(trad) ? mw : trad;
				String pinyin = ss[3];
				
				String pinyin_Num = Pinyin.convertToNum(pinyin);
				
				String type = ss[4];
				
				String desc = ss[5];
				
//				if (!type.contains("measure word")  && !desc.contains("measure word")) {
//					continue;
//				}
				
				ResultSet resultSet = stmt.executeQuery("SELECT id, simplified, pinyin, pinyin_num, description, traditional FROM hsk_classifier where simplified = '"+ mw+"' and traditional is null");

				if (resultSet.next()) {
					String mww = resultSet.getString(2);


					resultSet.updateString(3, pinyin);
					resultSet.updateString(4, pinyin_Num);
					resultSet.updateString(5, desc);
					resultSet.updateString(6, trad);
					resultSet.updateRow();
				}
			}
			
			
			
			
			
			
			

		} catch (SQLException e) {
		}

	}

	private void createTable() throws Exception {

		StringBuffer bf = new StringBuffer();

		try (InputStream u = this.getClass().getResourceAsStream("../database/HSK4.ddl");
				DataInputStream in = new DataInputStream(u);

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

		for (final String sql : CCDIC.semicol.split(bf)) {

			new CreateTable() {

				@Override
				public String getStatemeent() {
					return sql;
				}
			}.execute();
		}

	}

}