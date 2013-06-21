package com.plr.fetcher;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;

import com.plr.cvstojson.Pinyin;
import com.plr.database.CCDIC;

public class HSK3_ extends CCDIC {

	public static void main(String[] args) {

		new HSK3_().doit();

	}

	private void doit() {
		try {

			CCDIC.createConnection();

			createTable();

			pushData();

			// getHanzi();
		} catch (Exception e) {
			e.printStackTrace();
		}

		CCDIC.shutdown();// TODO Auto-generated method stub

	}

	private void pushData() throws Exception {

		String fn = "pizza2.csv";

		int baseID = -1;
		String line = null;
		int defId = -1;
		List<String[]> csvRows = null;
		try (BufferedReader br = new BufferedReader(new FileReader(fn));

		) {

			CSVReader cvsReader = new CSVReader(br);

			csvRows = cvsReader.readAll();

			cvsReader.close();

		} catch (Exception e) {
			System.out.println(line);
			System.out.println(baseID);
			System.out.println(defId);
			throw e;

		}
		int listIndex = 1;
		String idCode = null;
		try (PreparedStatement updateemp = CCDIC.conn.prepareStatement("insert into HSK_YBVOC_fix ("
				+ "ID_CODE, SIMPLIFIED, TRADITIONAL, PINYIN, TYPE, DESCRIPTION, HSK_LEVEL, MESURE_WORD,"
				+ "SYNONYME, SEE_ALSO) values(?,?,?,?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);) {
			
			while (listIndex < csvRows.size()) {

				String[] row = csvRows.get(listIndex++);

				idCode = row[0];
				String simplified = row[1];
				String traditional = row[2];
				
				if ("Same".equals(traditional)) {
					traditional= simplified;
				}
				
				
				String pinyin = row[3];
				
				if (pinyin.isEmpty()) {
					System.err.println((listIndex-1) + " code " + idCode + " " + simplified);
					continue;
				}
				
				String type = row[4];
				String description = row[5];
				Integer hsk_level = null;
				try {
					
					hsk_level = !row[6].isEmpty() ? Integer.valueOf(row[6]) : null;
				} catch (NumberFormatException e) {
					System.err.println("numfE: " + row[6]);
				}

				String mesure_word = row[7];
				String synonyme = row[8];
				String see_also = row[9];

				// String pin = Pinyin.convertToAccent(pinNum);

				updateemp.setInt(1, Integer.valueOf(idCode));
				updateemp.setString(2, simplified);
				updateemp.setString(3, traditional);
				
				setString(updateemp, 4, pinyin);
				setString(updateemp, 5, type);
				updateemp.setString(6, description);
				if(hsk_level != null){
					updateemp.setInt(7, hsk_level);
				} else {
					updateemp.setNull(7,java.sql.Types.INTEGER );
				}
				setString(updateemp, 8, mesure_word);
				setString(updateemp, 9, synonyme);
				setString(updateemp, 10, see_also);

				updateemp.executeUpdate();
			}
		} catch (SQLException e) {
			System.err.println((listIndex-1) + " code " + idCode);
			throw e;
		}

	}

	private void setString(PreparedStatement stmt, int idx, String data) throws SQLException {
		if (data == null || data.isEmpty()) {
			stmt.setNull(idx, Types.VARCHAR);
		} else {
			stmt.setString(idx, data);
		}
			
		
	}

	private void createTable() throws Exception {

		StringBuffer bf = new StringBuffer();

		try (InputStream u = this.getClass().getResourceAsStream("../database/HSK3_.ddl");
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