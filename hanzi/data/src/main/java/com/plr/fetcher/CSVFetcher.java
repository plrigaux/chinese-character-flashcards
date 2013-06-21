package com.plr.fetcher;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;

import com.plr.database.CCDIC;

public class CSVFetcher {

	static Yellowbridgefetcher ybf = new Yellowbridgefetcher(
			"__qca=P0-230016418-1369578078023; __atuvc=2%7C22; PHPSESSID=8qfnpi2d27eba4cmdgnrcqf5m3; maxWordLength=6; characterMode=s; dialect=M; __utmz=152973489.1371493481.14.2.utmccn=(referral)|utmcsr=google.ca|utmcct=/|utmcmd=referral; __utma=152973489.194228962.1369578078.1371493481.1371498877.15; __utmc=152973489; PGSHIT=50");

	public static void main(String[] args) {

		String fn = "pizza4.csv";
		String minid = "1";

//		try (BufferedReader br = new BufferedReader(new FileReader(fn));) {
//
//			CSVReader cvsReader = new CSVReader(br);
//
//			List<String[]> csvRows = cvsReader.readAll();
//
//			cvsReader.close();
//
//			if (!csvRows.isEmpty()) {
//				String[] ss = csvRows.get(csvRows.size() - 1);
//
//				minid = ss[0];
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.exit(0);
//		}

		System.out.println(minid);
		try (FileWriter writer = new FileWriter(new File(fn), true);) {

			CSVWriter csv = new CSVWriter(writer);
//			gogo(writer, csv, 1, "倒");

			CCDIC.createConnection();
			
			
//			String q = "select ID, SIMPLIFIED from HSK_CLASSIFIER where id > " + minid;
			String q = "Select * from HSK_MAIN where LENGTH(TRADITIONAL) = 0 order by HSK_LEVEL, SIMPLIFIED";
			
			try (Statement stmt = CCDIC.conn.createStatement();
					ResultSet results = stmt.executeQuery(q);) {

				int i = 0;
				while (results.next()) {

					int dbId = results.getInt(1);
					String word = results.getString(2);
					gogo(writer, csv, dbId, word);
					// }
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void gogo(FileWriter writer, CSVWriter csv, int dbId, String word) throws Exception, IOException {
		System.out.println(dbId + " " + word);

		toCSV(csv, word, dbId);
		writer.flush();

		// if (++i % 10 == 0) {
		try {
			int delay = 4000;
			System.err.println("Sleep " + delay);
			Thread.sleep(delay);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

	private static void toCSV(CSVWriter csv, String word, int dbId) throws Exception {

		List<YBDefinition> list = ybf.getDataFromYB(word);

		for (YBDefinition yd : list) {

			String[] ss = yd.toStrArray();

			String[] ssout = new String[10];

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
