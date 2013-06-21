package com.plr.sentence20000;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;

import com.google.common.base.Splitter;
import com.plr.cvstojson.Pinyin;
import com.plr.database.CCDIC;

public class Sentence20000 extends CCDIC {

	public static void main(String[] args) {

		new Sentence20000().doit();

	}

	private void doit() {
		try {

			CCDIC.createConnection();

			createTable("HSKSentences.ddl");

			List<SentenceStruct> list = fetchData();

			transform(list);
			
			pushData(list);

			// getHanzi();
		} catch (Exception e) {
			e.printStackTrace();
		}

		CCDIC.shutdown();// TODO Auto-generated method stub

	}

	private void transform(List<SentenceStruct> list) {
		for (SentenceStruct sst : list) {

			sst.category = sst.category.replaceAll(" ", "");
			sst.category = sst.category.replaceAll("level", "");
			sst.category = sst.category.replaceAll(";", "-");

			sst.pinyin_original = sst.pinyin_original.replaceAll("。", ".");
			sst.pinyin_original = sst.pinyin_original.replaceAll("，", ",");

			sst.sentence = sst.sentence.replaceAll("\\.", "。");

			sst.pinyin_original_num = Pinyin.convertToNum(sst.pinyin_original);
		}

	}

	static Splitter pipe = Splitter.on('|').trimResults();

	private List<SentenceStruct> fetchData() throws Exception {

		String fn = "src/main/resources/com/plr/sentence20000/zh-en_sentences_mod.txt";

		int baseID = -1;
		String line = null;
		int defId = -1;
		List<SentenceStruct> list = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(fn));) {
			
			while ((line = br.readLine()) != null) {
				defId++;
				Iterator<String> it = pipe.split(line).iterator();
				SentenceStruct sst = new SentenceStruct();
			
				sst.category = it.next();
				sst.sentence = it.next();
				sst.pinyin_original = it.next();
				sst.meaning = it.next();

				list.add(sst);

			} // end while

		} catch (Exception e) {
			System.out.println(line);
			System.out.println(baseID);
			System.out.println(defId);
			throw e;

		}
		return list;
	}

	private void pushData(List<SentenceStruct> list) throws Exception {

		
		int listIndex = 1;
		String idCode = null;
		try (PreparedStatement updateemp = CCDIC.conn.prepareStatement("insert into SENTENCES20000 (" + "EXPRESSION," + "MEANING,"
				+ "PINYIN_ORIGINAL," + "PINYIN_NUM_ORIGINAL," + "CATEGORY) values(?,?,?,?,?)");) {

			for (SentenceStruct sst : list) {
				updateemp.setString(1, sst.sentence);
				updateemp.setString(2, sst.meaning);
				updateemp.setString(3, sst.pinyin_original);
				updateemp.setString(4, sst.pinyin_original_num);
				updateemp.setString(5, sst.category);
				
				updateemp.execute();
			}
		} catch (SQLException e) {
			System.err.println((listIndex - 1) + " code " + idCode);
			throw e;
		}

	}


}