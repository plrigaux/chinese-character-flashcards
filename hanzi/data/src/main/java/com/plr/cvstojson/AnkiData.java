package com.plr.cvstojson;

public class AnkiData implements Comparable<AnkiData> {
	final int id;
	final int HSKLevel;
	String pinyin;
	String cihui;
	String definission;

	private static int idgen;

	public AnkiData(String hSKLevel, String pinyin, String cihui, String definission) {

		this.id = idgen++;
		
		Integer i = Integer.valueOf(hSKLevel);
		HSKLevel = i;
		this.pinyin = pinyin;
		this.cihui = cihui;
		this.definission = definission;
	}

	@Override
	public int compareTo(AnkiData o) {
		int v = HSKLevel - o.HSKLevel;
		if (v == 0) {
			return id - o.id;
		}

		return v;
	}

}
