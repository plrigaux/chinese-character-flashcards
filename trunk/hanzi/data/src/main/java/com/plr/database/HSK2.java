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

public class HSK2 extends CCDIC {

	public static void main(String[] args) {

		new HSK2().doit();

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
		
		for (int i = 1; i <= 6; i ++) {
			pushData(i);
		}
	}
	
	private void pushData(int index) throws Exception {

		String fn = "src/main/resources/com/plr/hsk/NewHSKLevel" + index +
				".csv";

		System.out.println(fn);
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

		try (PreparedStatement updateemp = CCDIC.conn.prepareStatement("insert into HSK_VOCABULARY2 (LEVEL,"
				+ "TRADITIONAL, SIMPLIFIED, PINYIN_NUM , PINYIN ,  WORD_CLASS, DEFINITION ) values(?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);

		) {
			int listIndex = 2;
			while (listIndex < csvRows.size()) {

				String[] row = csvRows.get(listIndex++);

//				String id = row[0];
				String simpl = row[1];
				String trad = row[2];
				String pinNum = row[3];
				String definition = row[4];
				String type = row[5];

				pinNum = Pinyin.spitSyllable(pinNum);
				String pin = Pinyin.convertToAccent(pinNum);

				updateemp.setInt(1, index);
				updateemp.setString(2, trad);
				updateemp.setString(3, simpl);
				updateemp.setString(4, pinNum);
				updateemp.setString(5, pin);
				updateemp.setString(6, type);
				updateemp.setString(7, definition);

				updateemp.executeUpdate();
			}
		}

	}

	private void createTable() throws Exception {

		StringBuffer bf = new StringBuffer();

		try (InputStream u = this.getClass().getResourceAsStream("HSK2.ddl"); DataInputStream in = new DataInputStream(u);

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