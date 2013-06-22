package com.plr.sentence20000;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.google.common.base.Splitter;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.TreeMultimap;
import com.plr.database.CCDIC;

public class HanziPinyin extends CCDIC {

	Multimap<Character, String> myMultimap = TreeMultimap.create();

	// public HanziPinyin() {
	// myMultimap = TreeMultimap.create();
	//
	//
	// Multimap<String,Object> xxx = ArrayListMultimap<String, Object>.create();
	// }

	public static void main(String[] args) {

		new HanziPinyin().doit();

	}

	private void doit() {
		try {

			CCDIC.createConnection();

			createTable("pinyin.ddl");

			fetchData();

			pushdata();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			CCDIC.shutdown();
		}
	}

	private void pushdata() throws Exception {

		Map<Character, Integer> mapHanzi = new TreeMap<>();
		Map<String, Integer> mapPinyin = new TreeMap<>();

		try (

		PreparedStatement stmtHanziInsert = conn.prepareStatement("insert into HANZI (HANZI ) values(?)",
				Statement.RETURN_GENERATED_KEYS);

				PreparedStatement stmtPinyinInsert = conn.prepareStatement("insert into PINYIN (PINYIN ) values(?)",
						Statement.RETURN_GENERATED_KEYS);
				
				PreparedStatement stmtHanziPinyinInsert = conn.prepareStatement("insert into HANZI_PINYIN  values(?, ?)");
				
				) {

			// for (Map.Entry<Character, Set<string>> iterable_element :
			// map.entrySet()) {
			//
			// }

			for (Entry<Character, String> en : myMultimap.entries()) {
				Character hanzi = en.getKey();
				String pinyin = en.getValue();

				Integer hanziVal = mapHanzi.get(hanzi);

				if (hanziVal == null) {
					stmtHanziInsert.setString(1, hanzi.toString());
					stmtHanziInsert.executeUpdate();
					ResultSet rs = stmtHanziInsert.getGeneratedKeys();
					if (rs.next()) {
						hanziVal = rs.getInt(1);
						mapHanzi.put(hanzi, hanziVal);
					}
				}

				Integer pinyinVal = mapPinyin.get(pinyin);

				if (pinyinVal == null) {
					stmtPinyinInsert.setString(1, pinyin);
					stmtPinyinInsert.executeUpdate();
					ResultSet rs = stmtHanziInsert.getGeneratedKeys();
					if (rs.next()) {
						pinyinVal = rs.getInt(1);
						mapPinyin.put(pinyin, pinyinVal);
					}
				}

				stmtHanziPinyinInsert.setInt(1, hanziVal);
				stmtHanziPinyinInsert.setInt(2, pinyinVal);
				stmtHanziPinyinInsert.executeUpdate();
				
			}
		}
	}

	static Splitter space = Splitter.on(' ').omitEmptyStrings();

	private void fetchData() throws Exception {
		String simplified = null;
		String pinyin_num = null;

		ArrayList<Character> simplifiedList = new ArrayList<>();
		ArrayList<String> pinyinList = new ArrayList<>();
		int failed = 0;
		int ok = 0;
		try (Statement stmt = conn.createStatement();) {
			ResultSet resultSet = stmt.executeQuery("Select Simplified, pinyin_num from base ");

			while (resultSet.next()) {
				++ok;
				simplified = resultSet.getString(1);
				pinyin_num = resultSet.getString(2);

				simplifiedList.clear();
				pinyinList.clear();

				for (int i = 0; i < simplified.length(); i++) {
					simplifiedList.add(simplified.charAt(i));
				}

				for (String pinyin : space.split(pinyin_num)) {
					pinyinList.add(pinyin);
				}

				if (pinyinList.size() != simplifiedList.size()) {
					++failed;
					continue;
				}

				for (int i = 0; i < simplifiedList.size(); i++) {
					Character c = simplifiedList.get(i);
					String pinyin = pinyinList.get(i);

					if (!Character.isAlphabetic(c)) {
						continue;
					}

					if (c < 255) {
						continue;
					}

					myMultimap.put(c, pinyin.toLowerCase());
				}
			}
		}
		System.out.println("Ok: " + ok);
		System.out.println("Failed: " + failed);
		System.out.println(myMultimap.size());
		System.out.println(myMultimap.keySet().size());
		System.out.println(myMultimap.keySet());
	}

}