package com.plr.fetcher;

import java.io.File;
import java.io.FileWriter;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.Box.Filler;

import com.plr.database.CCDIC;

import au.com.bytecode.opencsv.CSVWriter;

public class CSVFetcher {
	public static void main(String[] args) {

		try (FileWriter writer = new FileWriter(new File("pizza.csv"), true);) {

			CSVWriter csv = new CSVWriter(writer);

						
			List<Data> list = new ArrayList<>();
			
			list.add(new Data(8, "一切"));
			list.add(new Data(15, "一律"));
			list.add(new Data(16, "一流"));
			list.add(new Data(17, "一目了然"));
			
			
//			for (Data d : list) {
//				
//				
//				String word = d.word;
//				int dbId = d.dbId;
//
//				toCSV(csv, word, dbId);
//				writer.flush();
//			}
			
			CCDIC.createConnection();
			
			int minid = 71;

			try (Statement stmt = CCDIC.conn.createStatement();
					ResultSet results = stmt.executeQuery("select * from HSK_S2 where id > " + minid);) {
				
				while (results.next()) {

					int dbId =  results.getInt(1);
					String word = results.getString(2);
					System.out.println(dbId + " " + word);
					
					toCSV(csv, word, dbId);
					writer.flush();
				}
			} 

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void toCSV(CSVWriter csv, String word, int dbId) throws Exception {
		List<YBDefinition> list = Yellowbridgefetcher.getDataFromYB(word);

		for (YBDefinition yd : list) {

			String[] ss = yd.toStrArray();

			String[] ssout = new String[9];

			ssout[0] = "" + dbId;

			for (int i = 0; i < ss.length; i++) {
				ssout[i + 1] = ss[i];
			}

			csv.writeNext(ssout);
		}
	}
	
	static class Data {
		final int dbId;
		final String word;
		
		public Data(int dbId, String word) {
			this.dbId = dbId;
			this.word = word;
		}
	}
}
