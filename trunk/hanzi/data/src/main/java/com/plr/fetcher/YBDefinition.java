package com.plr.fetcher;

public class YBDefinition {
	final String simplified;
	String traditional;
	String pinyin;
	Integer HSK;
	String definition;
	String measureWords;
	String partsOfSpeech;
	String seeAlso;
	String synonyms;
	
	
	
	public YBDefinition(String simplified) {
		this.simplified = simplified;
	}

	

	String[] toStrArray() {

		String[] sa = new String[9];

		sa[0] = simplified.trim();
		sa[1] = traditional == null ? "" : traditional.trim();
		sa[4] = definition == null ? "" : definition.trim();
		sa[2] = pinyin == null ? "" : pinyin.trim();
		sa[3] = partsOfSpeech == null ? "" : partsOfSpeech.trim();
		sa[5] = HSK == null ? "" : HSK.toString();
		sa[6] = measureWords == null ? "" : measureWords.toString();
		sa[7] = synonyms == null ? "" : synonyms.trim();
		sa[8] = seeAlso == null ? "" : seeAlso.trim();

		return sa;
	}



	@Override
	public String toString() {
		return "YBDefinition [simplified=" + simplified + ", traditional=" + traditional + ", pinyin=" + pinyin + ", HSK=" + HSK
				+ ", definition=" + definition + ", measureWords=" + measureWords + ", partsOfSpeech=" + partsOfSpeech
				+ ", seeAlso=" + seeAlso + ", synonyms=" + synonyms + "]";
	}




}
