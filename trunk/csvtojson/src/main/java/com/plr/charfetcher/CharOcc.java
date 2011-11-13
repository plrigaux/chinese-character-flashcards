package com.plr.charfetcher;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.google.common.base.Splitter;
import com.plr.cvstojson.Data;

public class CharOcc {

	
	Map<Character, Data> charMap = new HashMap<>();
	
	public static void main(String[] args) {

		CharOcc m = new CharOcc();

		try {
			m.doAction();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void doAction() throws Exception {

		InputStream u = this.getClass().getResourceAsStream("../cvstojson/Modern Chinese Character Frequency List.txt");

		if (u == null) {
			System.err.println("snif");
		}

		// fstream = new FileInputStream("charset.csv");

		Splitter splitter = Splitter.on('\t');
		DataInputStream in = new DataInputStream(u);
		
		int i = 0;
		try (BufferedReader br = new BufferedReader(new InputStreamReader(in, "UTF-8"))) {

			String line;
			while ((line = br.readLine()) != null) {
				if (line.startsWith("#")) {
					continue;
				}
				
				i++;
				Iterable<String> ite = splitter.split(line);
				Iterator<String> it = ite.iterator();
				
				Character c = null;
				
				it.next();
				c = it.next().charAt(0);
				
				Data d = new Data();
				d.setId(i);
				d.setSimpleCharacter(c);
				
				charMap.put(c, d);
				
				
				if (i > 100) {
					break;
				}
			}

		} catch (Exception e) {

		}

		
		System.out.println(charMap);
		// CSVReader cvsReader = new CSVReader(br);
		//
		// List<String[]> listRows = cvsReader.readAll();
		//
		// cvsReader.close();

		

		// Writer writer = new Writer();
		//
		// writer.write(listRows);
		//

	}
}
