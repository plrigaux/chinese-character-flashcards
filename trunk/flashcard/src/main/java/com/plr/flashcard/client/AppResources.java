package com.plr.flashcard.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;

public interface AppResources extends ClientBundle {
	 public static final AppResources INSTANCE =  GWT.create(AppResources.class);
	
	@Source("../flashcard.css")
	Style style();

	public interface Style extends CssResource {
		String tone1();

		String tone2();

		String tone3();

		String tone4();

		String tone5();
		
		String character();

		String pinyin();
		

	}
}
