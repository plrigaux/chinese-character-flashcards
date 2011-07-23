package com.plr.flashcard.client;

public enum Tone {

	TONE1('\u0304', "tone1"), TONE2('\u0301', "tone2"), TONE3('\u030C', "tone3"), TONE4('\u0300', "tone4"), TONE5(null, "tone5");

	public Character getToneChar() {
		return toneChar;
	}

	public String getCssClass() {
		return cssClass;
	}

	private final Character toneChar;

	private final String cssClass;

	private Tone(Character toneChar, String cssClass) {
		this.toneChar = toneChar;
		this.cssClass = cssClass;
	}

	public static Tone getTone(int tone) {
		try {
			return Tone.values()[tone - 1];
		} catch (Exception e) {
			return TONE5;
		}
	}
}
