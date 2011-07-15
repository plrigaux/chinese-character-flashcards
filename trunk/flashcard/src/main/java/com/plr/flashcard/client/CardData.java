package com.plr.flashcard.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;

public class CardData extends JavaScriptObject {

	protected CardData() {

	}

	public final native String getSimplifiedCharacter() /*-{
		return this.simpl;
	}-*/;

	public final native JsArray<Definition> getDefinitions() /*-{
		return this.def;
	}-*/;

	static class Definition extends JavaScriptObject {
		protected Definition() {

		}

		public final native String getPinyin() /*-{
			return this.py;
		}-*/;

		public final native JsArrayString getDefinition() /*-{
			return this.def;
		}-*/;
	}
}
