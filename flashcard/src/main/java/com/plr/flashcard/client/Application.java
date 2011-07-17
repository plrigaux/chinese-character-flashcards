package com.plr.flashcard.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Application implements EntryPoint {

	// final private static Logger logger =
	// Logger.getLogger(Application.class.getName());
	@Override
	public void onModuleLoad() {

		FlowPanel sp = new FlowPanel();
		sp.addStyleName("center");
		final VerticalPanel vp = new VerticalPanel();
		sp.add(vp);
		RootLayoutPanel rootPanel = RootLayoutPanel.get();
		// ScrollPanel sp = new ScrollPanel();

		

		sp.add(vp);
		// vp.add(new Label("Test"));
		
		rootPanel.add(sp);

		DataControler dataControler = new DataControler();
		
		final MyCard mc = new MyCard(dataControler);
		
		vp.add(mc);
	}
}
