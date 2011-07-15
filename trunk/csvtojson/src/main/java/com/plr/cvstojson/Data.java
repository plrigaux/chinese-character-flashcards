package com.plr.cvstojson;

import java.util.ArrayList;

import com.google.common.base.Splitter;

public class Data {
	private int id;
	private Character tc;
	private Character sc;
	private Character ac;

	private ArrayList<Def> pron = new ArrayList<Def>();

	static class Def {
		private String pinyin;
		private ArrayList<String> def = new ArrayList<String>();

		Def(String pinyin, Iterable<String> it) {
			this.pinyin = pinyin;
			for (String s : it) {
				def.add(s);
			}
		}

		public String getPy() {
			return pinyin;
		}

		public ArrayList<String> getDefs() {
			
			return def;
		}
	}

	public void setId(String id) {
		Integer i = Integer.parseInt(id);

		this.id = i;
	}

	public void setCharaters(String chars) {
		sc = chars.charAt(0);


		if (chars.length() > 4 && chars.charAt(2) == 'F') {
			tc = chars.charAt(3);
		}
		
		if (chars.length() > 4 && chars.charAt(2) == 'A') {
			ac = chars.charAt(3);
		}
	}

	static Splitter s = Splitter.on(';').trimResults().omitEmptyStrings();

	public void setExplanation(String string) {

		int b = string.indexOf('[');
		int c = string.indexOf(']');

		if (c != -1 && b != -1) {
			String pinying = string.substring(b + 1, c);

			Iterable<String> it = s.split(string.substring(c + 1));
			Def d = new Def(pinying, it);

			pron.add(d);
		}
	}

	public int getId() {
		return id;
	}

	public Character getS() {
		return sc;
	}

	public Character getT() {
		return tc;
	}
	
	public Character getA() {
		return ac;
	}


	public ArrayList<Def> getDefs() {
		return pron;
	}
}
