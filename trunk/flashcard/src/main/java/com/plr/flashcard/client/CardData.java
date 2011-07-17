package com.plr.flashcard.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;

public class CardData extends JavaScriptObject {

	protected CardData() {

	}

	public final native String getSimplifiedCharacter() /*-{
		return this.s;
	}-*/;

	public final native JsArray<CharDefinition> getDefinitions() /*-{
		return this.d;
	}-*/;

	static public class  CharDefinition extends JavaScriptObject {
		protected CharDefinition() {

		}

		public final native String getPinyin() /*-{
			return this.p;
		}-*/;

		public final native JsArrayString getDefinition() /*-{
			return this.d;
		}-*/;

		public final native String getPinyinNum() /*-{
			return this.n;
		}-*/;

		public final int getTone() {
			String pinyinNum = getPinyinNum();

			char c = pinyinNum.charAt(pinyinNum.length() - 1);

			switch (c) {
			case '1':
				return 1;
			case '2':
				return 2;
			case '3':
				return 3;
			case '4':
				return 4;
			}

			return 5;
		}
	}
}
