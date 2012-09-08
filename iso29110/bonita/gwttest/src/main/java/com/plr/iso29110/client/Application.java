package com.plr.iso29110.client;

import org.bonitasoft.console.client.common.RpcConsoleServices;
import org.bonitasoft.console.client.processes.ProcessServiceAsync;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.plr.iso29110.client.welcome.Welcome;
import com.plr.iso29110.client.widget.AppResources;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Application implements EntryPoint {

	@SuppressWarnings("unused")
	private HistoryManager historyManager = null;

	/**
	 * This is the entry point method.
	 */

	@Override
	public void onModuleLoad() {

		AppResources.INSTANCE.style().ensureInjected();

		RootLayoutPanel rootPanel = RootLayoutPanel.get();

		rootPanel.clear();
		Welcome welcome = new Welcome();
		rootPanel.add(welcome);

		historyManager = new HistoryManager();

	}

	static public ProcessServiceAsync getInstance() {
	
   
		return RpcConsoleServices.getProcessService();
	}
}
