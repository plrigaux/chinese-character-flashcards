package com.plr.fetcher;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.plr.cvstojson.Pinyin;
import com.plr.database.CCDIC;

public class HSK_Anki {

	public static void main(String[] args) {
		HSK_Anki m = new HSK_Anki();

		try {
			m.doAction();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void doAction() throws Exception {

		CCDIC.createConnection();

		Map<String, String> classifier = new HashMap<>();

		try (Statement stmt = CCDIC.conn.createStatement();) {

			ResultSet resultSet = stmt.executeQuery("SELECT Simplified, PINYIN_NUM  FROM hsk_classifier");

			while (resultSet.next()) {

				classifier.put(resultSet.getString(1), resultSet.getString(2));
			}

		}

		List<AnkiDataHSK> list = new ArrayList<>();

		try (Statement stmt = CCDIC.conn.createStatement();) {

			ResultSet resultSet = stmt
					.executeQuery("SELECT ID, HSK_LEVEL, PINYIN_NUM, Simplified, Description, TYPE, Mesure_word, traditional FROM hsk_main order by hsk_level, pinyin_num");

			while (resultSet.next()) {

				AnkiDataHSK data = new AnkiDataHSK(resultSet.getInt(1), resultSet.getInt(2), resultSet.getString(3),
						resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7),
						resultSet.getString(8));

				list.add(data);
			}

		}

		int i = 0;
		try (PreparedStatement ps = CCDIC.conn.prepareStatement("select s2.* from SENTENCES20000 s2 join Word_in_Sentence ws on ws.word_id = s2.id and ws.word_id = ? limit 5")) {

			for (AnkiDataHSK ad : list) {
				i++;

				if (i % 100 == 0) {
					System.out.println(i);
				}

				ps.setInt(1, ad.id );
				ResultSet resultSet = ps.executeQuery();

				StringBuilder sb = new StringBuilder(5000);
				
				while (resultSet.next()) {

					String expression = resultSet.getString(2);
					String meaning = resultSet.getString(3);
					String pinyinNum = resultSet.getString(5);

					expression = expression.replace(ad.cihui, "<span class='cihui_hl'>" + ad.cihui + "</span>");
					
					sb.append("<div class='sentense'>");
					
					sb.append("<p class='expression'>");
					sb.append(expression);
					sb.append("</p>");

					String pinyinHtML = Pinyin.convertToAccentHtml(pinyinNum);
					sb.append("<p class='expressionPinyin'>");
					sb.append(pinyinHtML);
					sb.append("</p>");

					sb.append("<p class='meaning'>");
					sb.append(meaning);
					sb.append("</p>");

					sb.append("</div>");
				}
				
				
				ad.sentenses = sb.toString();
			}
		}

		File f = new File("ankihsk.txt");

		if (!f.exists()) {
			f.createNewFile();
		}

		try (Statement stmt = CCDIC.conn.createStatement();
				FileOutputStream fo = new FileOutputStream(f);
				OutputStreamWriter ow = new OutputStreamWriter(fo, "UTF-8");) {

			for (AnkiDataHSK ad : list) {

				String line = ad.id + "\t" + ad.cihui + "\t" + ad.getPinHTML() + "\t" + ad.getHTMLDef() + "\t" + ad.HSKLevel
						+ "\t" + ad.getType() + "\t" + AnkiDataHSK.getHTMLMW(classifier, ad) + "\t" + ad.getTrad() + "\t"
						+ ad.sentenses + "\t" + ad.HSKLevel + "\n";

				ow.write(line);

			}
		}
	}

}
