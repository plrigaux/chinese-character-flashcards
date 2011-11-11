package com.plr.flashcard.client.view.main;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.plr.flashcard.client.view.dictionnary.ZwCharBrowser;
import com.plr.flashcard.client.view.dictionnary.ZwCharDetails;
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
		
		} else if (SHI_SHENME.equals(value)) {
			rootPanel.clear();
			ShiShenmeSystem charDictionnary = new ShiShenmeSystem();
			rootPanel.add(charDictionnary);
		} else if (value.startsWith(CHARARCTER)) {

			if (value.charAt(CHARARCTER.length()) == '/') {
				String charId = value.substring(CHARARCTER.length() + 1);

				rootPanel.clear();
				ZwCharDetails charDetails = new ZwCharDetails();
				rootPanel.add(charDetails);

				charDetails.setCharaterId(charId);
			}
		} else if (value.startsWith(DICTIONNARY)) {
			rootPanel.clear();
			ZwCharBrowser charDictionnary = new ZwCharBrowser();
			rootPanel.add(charDictionnary);
			
			if (value.length() > DICTIONNARY.length() && value.charAt(DICTIONNARY.length()) == '/') {
				String charId = value.substring(DICTIONNARY.length() + 1);
				charDictionnary.setCharaterId(charId);
			}

		} else {
			History.newItem("", false);
			rootPanel.clear();
			Welcome welcome = new Welcome();
			rootPanel.add(welcome);
		}

	}
}
