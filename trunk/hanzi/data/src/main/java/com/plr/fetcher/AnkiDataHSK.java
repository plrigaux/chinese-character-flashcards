package com.plr.fetcher;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.common.base.Splitter;
import com.plr.cvstojson.Pinyin;

public class AnkiDataHSK {
	final int id;
	final int HSKLevel;
	private String pinyin;
	String cihui;
	private String definition;
	private String type;
	private String mw;
	private String traditional;
	public String sentenses;

	public AnkiDataHSK(int id, int hSKLevel, String pinyin, String cihui, String definission, String type, String mw,
			String traditional) {

		this.id = id;
		this.HSKLevel = hSKLevel;
		this.pinyin = pinyin;
		this.cihui = cihui;
		this.definition = definission;
		this.type = type;
		this.mw = mw;
		this.traditional = traditional;
	}

	final static Splitter sp = Splitter.on(';').trimResults().omitEmptyStrings();
	final static Splitter spComma = Splitter.on(',').trimResults().omitEmptyStrings();
	final static Pattern simpleD = Pattern.compile("\\((.+?)\\)\\s+(.+)");
	
	public String getHTMLDef() {
		StringBuilder out = new StringBuilder();

		boolean f = true;
		for (String s : sp.split(definition)) {

			if (f) {
				f = false;
			} else {
				out.append("<br>");
			}
			out.append("<li>").append(s);
		}

		return out.toString();

	}

	public String getPinHTML() {
		return Pinyin.convertToAccentHtml(pinyin);
	}

	public String getType() {
		String s = "";

		if (type != null) {
			boolean first = true;
			for (String ty : spComma.split(type)) {
				Matcher m = simpleD.matcher(ty);

				String engl = "";
				if (m.find()) {
					engl = m.group(2);
				} else {
					engl = ty;
				}
				
				if (first) {
					first = false;
				} else {
					s += ", ";
				} 
				
				s += engl;
			}
		}

		return s;
	}

	public String getMW() {
		return mw == null ? "" : mw;
	}

	public String getTrad() {
		return traditional.equals(cihui) ? "" : traditional;
	}

	static String getHTMLMW(Map<String, String> mwMap, AnkiDataHSK data) {
		String s = "";

		if (data.mw != null) {
			boolean first = true;
			for (String mw : spComma.split(data.mw)) {
				String pin = mwMap.get(mw);
				if (first) {
					first = false;
				} else {
					s += ", ";
				}
				s += mw;
				if (pin != null) {
					s += " " + Pinyin.convertToAccentHtml(pin);
				}
			}
		}

		return s;
	}
}
