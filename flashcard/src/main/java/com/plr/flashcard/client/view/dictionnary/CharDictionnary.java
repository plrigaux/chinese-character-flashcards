package com.plr.flashcard.client.view.dictionnary;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;

public class CharDictionnary extends Widget {

	private static CharDictionnaryUiBinder uiBinder = GWT.create(CharDictionnaryUiBinder.class);

	interface CharDictionnaryUiBinder extends UiBinder<Element, CharDictionnary> {
	}

	public CharDictionnary() {
		setElement(uiBinder.createAndBindUi(this));
		
	}

}
