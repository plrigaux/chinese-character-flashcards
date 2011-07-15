package com.plr.cvstojson;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;

import org.apache.sling.commons.json.io.JSONWriter;

import au.com.bytecode.opencsv.CSVParser;
import au.com.bytecode.opencsv.CSVReader;

import com.plr.cvstojson.Data.Def;

public class Main {
	public static void main(String[] args) {

		System.out.println("asdfj");

		Main m = new Main();

		CSVParser p = new CSVParser();

		FileInputStream fstream;
		try {
			m.doAction();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void doAction() throws Exception {

		InputStream u = this.getClass().getResourceAsStream("charset.csv");

		if (u == null) {
			System.err.println("snif");
		}

		// fstream = new FileInputStream("charset.csv");

		DataInputStream in = new DataInputStream(u);
		BufferedReader br = new BufferedReader(new InputStreamReader(in, "UTF-8"));

		CSVReader r = new CSVReader(br);

		List<String[]> l = r.readAll();

		File f = new File("out.json");

		f.createNewFile();

		FileOutputStream fo = new FileOutputStream(f);

		OutputStreamWriter ow = new OutputStreamWriter(fo, "UTF-8");

		JSONWriter jw = new JSONWriter(ow);
		// jw.object();
		// jw.key("data");
		jw.array();
		Data d = null;
		for (int i = 1; i < l.size(); i++) {

			String[] row = l.get(i);

			String id = row[0];

			if (!id.isEmpty()) {
				doOutput(d, jw);
				d = new Data();
				d.setId(id);
				d.setCharaters(row[1]);

			}

			d.setExplanation(row[2]);
		}
		doOutput(d, jw);
		jw.endArray();
		// jw.endObject();

		ow.flush();
		ow.close();
	}

	private void doOutput(Data d, JSONWriter jw) throws Exception {
		if (d == null) {
			return;
		}

		jw.object();
		jw.key("id");
		jw.value(d.getId());
		jw.key("simpl");
		jw.value(d.getS());

		if (d.getT() != null) {
			jw.key("trad");
			jw.value(d.getT());
		}
		
		if (d.getT() != null) {
			jw.key("alt");
			jw.value(d.getA());
		}
		
		jw.key("def");

		jw.array();

		for (Def def : d.getDefs()) {
			jw.object();
			jw.key("py");
			jw.value(def.getPy());

			jw.key("def");
			jw.array();
			for (String defin : def.getDefs()) {
				jw.value(defin);
			}
			jw.endArray();
			jw.endObject();
		}

		jw.endArray();

		jw.endObject();
	}
}
