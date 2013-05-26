package com.plr.cvstojson;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.common.base.Splitter;

public class AnkiWriter {

	void write(List<String[]> csvRows) throws Exception {

		File file = new File("outputAnki");

		if (file.isDirectory()) {
			file.delete();
		}

		file.mkdir();

		doABatch(csvRows);

	}

	private void doABatch(List<String[]> csvRows) throws Exception {

		TreeSet<AnkiData> set = new TreeSet<AnkiData>();

		int listIndex = 1;
		while (listIndex < csvRows.size()) {

			String[] row = csvRows.get(listIndex++);

			String cat = row[0];
			String cihui = row[1];
			String pin = row[2];
			String definission = row[3];

			definission = setExplanation(definission);

			pin = Pinyin.convertToAccentHtml(pin);

			AnkiData ad = new AnkiData(cat, pin, cihui, definission);

			set.add(ad);

		}

		File f = new File("outputAnki/anki.txt");

		f.createNewFile();

		try (FileOutputStream fo = new FileOutputStream(f);

		OutputStreamWriter ow = new OutputStreamWriter(fo, "UTF-8");) {

			int i = 1;
			for (AnkiData ad : set) {

				String line = i++ + "\t" + ad.cihui + "\t" + ad.pinyin + "\t" + ad.definission + "\t" + ad.HSKLevel + "\t"
						+ ad.HSKLevel + "\n";

				ow.write(line);

				listIndex++;
			}

		}

	}

	final static Splitter sp = Splitter.on(';').trimResults().omitEmptyStrings();

	final static Pattern p = Pattern.compile("\\[([\\s\\w]+?)\\]");

	public String setExplanation(String def) {

		Matcher m = p.matcher(def);
		StringBuilder sb = new StringBuilder();

		int start = 0;
		while (m.find()) {

			String py = m.group(1);

			py = Pinyin.convertToAccentHtml(py);

			sb.append(def.substring(start, m.start(1)));
			sb.append(py);

			start = m.end(1);

		}

		sb.append(def.substring(start, def.length()));

		String out = "";

		boolean f = true;
		for (String s : sp.split(sb)) {

			if (f) {
				f = false;
				out += "<li>" + s;
			} else {
				out += "<br><li>" + s;
			}
		}

		return out;
	}

}
