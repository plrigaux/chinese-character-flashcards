package com.plr.toastmasters.client;

import java.util.Iterator;

import com.google.common.base.Splitter;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.plr.toastmasters.client.timer.TMTimer;
import com.plr.toastmasters.client.timer.TMWelcome;

public class HistoryManager implements ValueChangeHandler<String>, ApplicationConst {

	private final RootLayoutPanel rootPanel;

	public HistoryManager() {

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

	Splitter splitter = Splitter.on("/");

	@Override
	public void onValueChange(ValueChangeEvent<String> event) {

		String value = event.getValue();

		Iterator<String> it = splitter.split(value).iterator();

		String item = "";

		if (it.hasNext()) {
			item = it.next();
		}

		if (TIMER.equals(item)) {

			rootPanel.clear();
			TMTimer mc = new TMTimer();

			if (it.hasNext()) {
				String triggers = it.next();
				mc.setTriggers(triggers);
			}

			rootPanel.add(mc);

		} else if (TIMER_CHOOSER.equals(item)) {
			History.newItem("", false);
			rootPanel.clear();
			TMWelcome welcome = new TMWelcome();
			rootPanel.add(welcome);

		} else {
			History.newItem("", false);
			rootPanel.clear();
			TMWelcome welcome = new TMWelcome();
			rootPanel.add(welcome);
		}
	}
}
