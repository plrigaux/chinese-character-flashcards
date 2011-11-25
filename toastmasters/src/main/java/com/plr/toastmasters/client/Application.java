package com.plr.toastmasters.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.plr.toastmasters.client.timer.TMTimer;
import com.plr.toastmasters.client.timer.TMWelcome;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Application implements EntryPoint {

	@SuppressWarnings("unused")
	private HistoryManager historyManager = null;
	
	@Override
	public void onModuleLoad() {
		//init the pinyin converter

		TMWelcome welcome = new TMWelcome();
		RootLayoutPanel.get().add(welcome);
		
		historyManager = new HistoryManager();
	}

}
