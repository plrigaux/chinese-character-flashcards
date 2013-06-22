package com.plr.database;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;

import com.plr.cvstojson.Pinyin;

public class HSK extends CCDIC {

	public static void main(String[] args) {

		new HSK().doit();

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

		String fn = "src/main/resources/com/plr/cvstojson/HSK_Level_6_(New_HSK)2.csv";

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

		try (PreparedStatement updateemp = CCDIC.conn.prepareStatement("insert into HSK_VOCABULARY ("
				+ "SIMPLIFIED, PINYIN_NUM , PINYIN , LEVEL, DEFINITION ) values(?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);

		) {
			int listIndex = 1;
			while (listIndex < csvRows.size()) {

				String[] row = csvRows.get(listIndex++);

				String cat = row[0];
				String cihui = row[1];
				String pinNum = row[2];
				String definition = row[3];

				String pin = Pinyin.convertToAccent(pinNum);

				updateemp.setString(1, cihui);
				updateemp.setString(2, pinNum);
				updateemp.setString(3, pin);
				updateemp.setInt(4, Integer.valueOf(cat));
				updateemp.setString(5, definition);

				updateemp.executeUpdate();
			}
		}

	}

	private void createTable() throws Exception {

		StringBuffer bf = new StringBuffer();

		try (InputStream u = this.getClass().getResourceAsStream("HSK.ddl"); DataInputStream in = new DataInputStream(u);

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