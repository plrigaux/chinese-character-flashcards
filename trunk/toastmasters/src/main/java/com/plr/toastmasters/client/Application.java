package com.plr.toastmasters.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.plr.toastmasters.client.timer.TMTimer;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Application implements EntryPoint {

	@SuppressWarnings("unused")
	private HistoryManager historyManager = null;
	
	@Override
	public void onModuleLoad() {
		//init the pinyin converter

		
		historyManager = new HistoryManager();
		
		
		RootLayoutPanel.get().add(new TMTimer());	
	}

}
