package com.plr.flashcard.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.plr.flashcard.client.view.MyCard;
import com.plr.flashcard.client.view.dictionnary.CharDictionnary;
import com.plr.flashcard.client.view.welcome.Welcome;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Application implements EntryPoint, ValueChangeHandler<String> {

	// final private static Logger logger =
	// Logger.getLogger(Application.class.getName());

	final VerticalPanel vp = new VerticalPanel();
	final DataControler dataControler = new DataControler();

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

		rootPanel.add(sp);

		

		// final MyCard mc = new MyCard(dataControler);

		Welcome w = new Welcome();

		vp.add(w);
	}

	@Override
	public void onValueChange(ValueChangeEvent<String> event) {

		String value = event.getValue();

		if ("flash".equals(value)) {
			vp.clear();
			 MyCard mc = new MyCard(dataControler);
			vp.add(mc);
		} else if ("dictionnary".equals(value)) {
			vp.clear();
			CharDictionnary w = new CharDictionnary();
			vp.add(w);
		} else {
			vp.clear();
			Welcome w = new Welcome();
			vp.add(w);
		}

	}
}
