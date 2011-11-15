package com.plr.charfetcher;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import org.apache.sling.commons.json.JSONException;
import org.apache.sling.commons.json.io.JSONWriter;

import com.plr.cvstojson.Data;

public class CharOccWriter {

	private final int BATCH = 200;

	private Map<String, String> num2pinyin = new TreeMap<String, String>();

	private final String OUTDIR = "cedict";

	void write(Collection<Data> csvRows) throws Exception {

		File file = new File(OUTDIR);

		if (file.isDirectory()) {
			file.delete();
		}

		file.mkdir();

		int nbBatch = csvRows.size() / BATCH;

		Iterator<Data> it = csvRows.iterator();

		for (int i = 1; i <= nbBatch; i++) {

			doABatch(i, it);
		}

		doPinyinToNum();

	}

	private void doPinyinToNum() throws IOException, FileNotFoundException, UnsupportedEncodingException, JSONException {
		File f = new File(OUTDIR + "/num2pinyin.json");

		f.createNewFile();

		FileOutputStream fo = new FileOutputStream(f);

		OutputStreamWriter ow = new OutputStreamWriter(fo, "UTF-8");
		try {
			JSONWriter jw = new JSONWriter(ow);
			jw.object();
			for (Map.Entry<String, String> en : num2pinyin.entrySet()) {
				String k = en.getKey();
				String v = en.getValue();

				jw.key(k);
				jw.value(v);
				
//				System.out.println(k + " " + v);
			}
			jw.endObject();
		} finally {
			ow.close();
		}
	}

	private void doABatch(int batch, Iterator<Data> it) throws Exception {

		File f = new File(OUTDIR + "/chineseChar-" + batch + ".json");

		f.createNewFile();

		FileOutputStream fo = new FileOutputStream(f);

		OutputStreamWriter ow = new OutputStreamWriter(fo, "UTF-8");

		int dataWrote = 0;

		JSONWriter jw = new JSONWriter(ow);
		try {
			jw.array();

			while (it.hasNext()) {
				Data data = it.next();
				doOutput(data, jw);
				if (++dataWrote >= BATCH) {
					break;
				}
			}

			jw.endArray();
		} finally {
			ow.close();
		}

		if (dataWrote == 0) {
			f.delete();
		}
		// jw.endObject();

	}

	private void doOutput(Data d, JSONWriter jw) throws Exception {
		if (d == null) {
			return;
		}

		jw.object();
		jw.key("i");
		jw.value(d.getId());
		jw.key("s");
		jw.value(d.getS());

		// if (d.getT() != null) {
		// jw.key("t");
		// jw.value(d.getT());
		// }

		// if (d.getT() != null) {
		// jw.key("a");
		// jw.value(d.getA());
		// }

		jw.key("d");

		jw.array();

		for (Data.Definision def : d.getDefs()) {
			jw.object();
			// jw.key("p");
			// jw.value(def.getPy());

			jw.key("n");
			jw.value(def.getPyNum());

			jw.key("d");
			jw.array();
			for (String defin : def.getDefs()) {
				jw.value(defin);
			}
			jw.endArray();
			jw.endObject();

			num2pinyin.put(def.getPyNum().toLowerCase(), def.getPy().toLowerCase());
		}

		jw.endArray();

		jw.endObject();

	}
}
