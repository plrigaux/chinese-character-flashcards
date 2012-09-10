package com.plr.iso29110.client.welcome;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.plr.iso29110.client.ApplicationConst;

public class Welcome extends Composite implements ApplicationConst {

	private static WelcomeUiBinder uiBinder = GWT.create(WelcomeUiBinder.class);

	interface WelcomeUiBinder extends UiBinder<Widget, Welcome> {
	}


	public Welcome() {
		initWidget(uiBinder.createAndBindUi(this));

		// browser.setText(HanziConstants.INSTANCE.charBrowser());
	}

	
}
