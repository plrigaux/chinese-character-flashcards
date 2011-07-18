package com.plr.flashcard.client.view.welcome;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.Widget;

public class Welcome extends Composite {

	private static WelcomeUiBinder uiBinder = GWT.create(WelcomeUiBinder.class);

	interface WelcomeUiBinder extends UiBinder<Widget, Welcome> {
	}

	public Welcome() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField
	Hyperlink dictionnaryLink;
	
	@UiField
	Hyperlink flashLink;


}
