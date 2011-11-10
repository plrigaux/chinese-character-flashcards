package com.plr.flashcard.client.view.main;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.plr.flashcard.client.view.dictionnary.ZwCharBrowser;
import com.plr.flashcard.client.view.flashcard.FlashCardSystem;
import com.plr.flashcard.client.view.shishenme.ShiShenmeSystem;
import com.plr.flashcard.client.view.welcome.Welcome;

public class MainPanel implements ValueChangeHandler<String>, PanelConst {



	private final RootLayoutPanel rootPanel;

	
	public MainPanel() {
		
		rootPanel = RootLayoutPanel.get();
		
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
			
			rootPanel.clear();
			FlashCardSystem mc = new FlashCardSystem();
			rootPanel.add(mc);
		} else if (DICTIONNARY.equals(value)) {
			rootPanel.clear();
			ZwCharBrowser charDictionnary = new ZwCharBrowser();
			rootPanel.add(charDictionnary);
		} else if (SHI_SHENME.equals(value)) {
			rootPanel.clear();
			ShiShenmeSystem charDictionnary = new ShiShenmeSystem();
			rootPanel.add(charDictionnary);
		} else {
			rootPanel.clear();
			Welcome welcome = new Welcome();
			rootPanel.add(welcome);
		}

	}
}
