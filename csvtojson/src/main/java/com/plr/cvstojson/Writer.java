package com.plr.cvstojson;

import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

import org.apache.sling.commons.json.io.JSONWriter;

import com.plr.cvstojson.Data.Definision;

public class Writer {

	private final int BATCH = 200;

	private int dataWrote = 0;

	private int listIndex = 1;

	void write(List<String[]> csvRows) throws Exception {

		File file = new File("");
		file = new File(file.getAbsolutePath());

		File fs[] = file.listFiles(new FileFilter() {

			@Override
			public boolean accept(File file) {
				return file.getName().startsWith("out-");
			}
		});

		for (File f : fs) {
			f.delete();
		}

		int nbBatch = csvRows.size() / BATCH;

		for (int i = 1; i < nbBatch; i++) {

			doABatch(i, csvRows);
		}

	}

	private void doABatch(int batch, List<String[]> csvRows) throws Exception {

		File f = new File("out-" + batch + ".json");

		f.createNewFile();

		FileOutputStream fo = new FileOutputStream(f);

		OutputStreamWriter ow = new OutputStreamWriter(fo, "UTF-8");

		JSONWriter jw = new JSONWriter(ow);
		try {
			jw.array();
			Data data = null;

			int end = batch * BATCH;
			dataWrote = 0;
			while (listIndex < csvRows.size()) {

				String[] row = csvRows.get(listIndex++);

				String id = row[0];

				if (!id.isEmpty()) {
					int idi = Integer.parseInt(id);
					doOutput(data, jw);
					if (idi > end) {
						System.out.println("dw " + dataWrote);
						data = null;
						listIndex--;
						break;
					}

					data = new Data();
					data.setId(idi);
					data.setCharaters(row[1]);

				}

//				if (data == null) {
//					System.out.println(Arrays.asList(row));
//					System.out.println("li " + listIndex);
//					System.out.println(batch);
//					System.out.println("dw " + dataWrote);
//				}

				data.setExplanation(row[2]);
			}

			doOutput(data, jw);

			jw.endArray();
		} finally {
			// ow.flush();
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

		for (Definision def : d.getDefs()) {
			jw.object();
			jw.key("p");
			jw.value(def.getPy());
			
			jw.key("n");
			jw.value(def.getPyNum());

			jw.key("d");
			jw.array();
			for (String defin : def.getDefs()) {
				jw.value(defin);
			}
			jw.endArray();
			jw.endObject();
		}

		jw.endArray();

		jw.endObject();

		dataWrote++;
	}
}
