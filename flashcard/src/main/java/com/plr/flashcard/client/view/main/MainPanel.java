package com.plr.flashcard.client.view.main;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.Widget;
import com.plr.flashcard.client.view.dictionnary.ZwCharBrowser;
import com.plr.flashcard.client.view.flashcard.FlashCardSystem;
import com.plr.flashcard.client.view.shishenme.ShiShenmeSystem;
import com.plr.flashcard.client.view.welcome.Welcome;

public class MainPanel extends Composite implements ValueChangeHandler<String>, PanelConst {

	private static Binder uiBinder = GWT.create(Binder.class);

	@UiField
	Panel mainPanel;

	interface Binder extends UiBinder<Widget, MainPanel> {
	}

	public MainPanel() {
		initWidget(uiBinder.createAndBindUi(this));

		History.addValueChangeHandler(this);

		// When you reload, stay on the same page
		String hash = Window.Location.getHash();

		History.newItem("");

		if (hash.startsWith("#")) {
			hash = hash.substring(1);
		}

		History.newItem(hash);
	}

	@Override
	public void onValueChange(ValueChangeEvent<String> event) {

		String value = event.getValue();

		if (FLASH.equals(value)) {
			mainPanel.clear();
			FlashCardSystem mc = new FlashCardSystem();
			mainPanel.add(mc);
		} else if (DICTIONNARY.equals(value)) {
			mainPanel.clear();
			ZwCharBrowser charDictionnary = new ZwCharBrowser();
			mainPanel.add(charDictionnary);
		} else if (SHI_SHENME.equals(value)) {
			mainPanel.clear();
			ShiShenmeSystem charDictionnary = new ShiShenmeSystem();
			mainPanel.add(charDictionnary);
		} else {
			mainPanel.clear();
			Welcome welcome = new Welcome();
			mainPanel.add(welcome);
		}

	}
}
