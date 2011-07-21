package com.plr.flashcard.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.plr.flashcard.client.view.MyCard;
import com.plr.flashcard.client.view.dictionnary.CwCellList;
import com.plr.flashcard.client.view.shishenme.ShiShenme;
import com.plr.flashcard.client.view.welcome.Welcome;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Application implements EntryPoint, ValueChangeHandler<String> {

	// final private static Logger logger =
	// Logger.getLogger(Application.class.getName());

	final VerticalPanel vp = new VerticalPanel();
	
	@Override
	public void onModuleLoad() {

		History.addValueChangeHandler(this);

		FlowPanel sp = new FlowPanel();
		sp.addStyleName("center");

		sp.add(vp);
		RootLayoutPanel rootPanel = RootLayoutPanel.get();
		// ScrollPanel sp = new ScrollPanel();

		sp.add(vp);
		// vp.add(new Label("Test"));
		
		sp.add(new ShiShenme());
		
		rootPanel.add(sp);

		// final MyCard mc = new MyCard(dataControler);

		History.newItem("");
	}

	@Override
	public void onValueChange(ValueChangeEvent<String> event) {

		String value = event.getValue();

		if ("flash".equals(value)) {
			vp.clear();
			 MyCard mc = new MyCard();
			vp.add(mc);
		} else if ("dictionnary".equals(value)) {
			vp.clear();
			CwCellList charDictionnary = new CwCellList();
			vp.add(charDictionnary);
		} else if ("shiShenme".equals(value)) {
			vp.clear();
			ShiShenme charDictionnary = new ShiShenme();
			vp.add(charDictionnary);
		} else {
			vp.clear();
			Welcome welcome = new Welcome();
			vp.add(welcome);
		}

	}
}
