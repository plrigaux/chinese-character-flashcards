package com.plr.flashcard.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.plr.flashcard.client.view.main.MainPanel;
import com.plr.flashcard.client.view.welcome.Welcome;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Application implements EntryPoint {

	@Override
	public void onModuleLoad() {

		AppResources.INSTANCE.style().ensureInjected();

		RootLayoutPanel rootPanel = RootLayoutPanel.get();
		
		rootPanel.clear();
		Welcome welcome = new Welcome();
		rootPanel.add(welcome);
		
		new MainPanel();
	}

}
