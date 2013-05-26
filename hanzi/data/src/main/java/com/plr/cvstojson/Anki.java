package com.plr.cvstojson;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;

public class Anki {
	public static void main(String[] args) {

		Anki m = new Anki();

		try {
			m.doAction();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void doAction() throws Exception {

		try (InputStream u = this.getClass().getResourceAsStream("HSK_Level_6_(New_HSK).csv");
				DataInputStream in = new DataInputStream(u);) {

			if (u == null) {
				System.err.println("snif");
			}

			// fstream = new FileInputStream("charset.csv");

			BufferedReader br = new BufferedReader(new InputStreamReader(in, "UTF-8"));

			CSVReader cvsReader = new CSVReader(br);

			List<String[]> listRows = cvsReader.readAll();

			cvsReader.close();

			AnkiWriter writer = new AnkiWriter();

			writer.write(listRows);
		}

	}

}
