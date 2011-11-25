package com.plr.toastmasters.client.timer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.google.common.base.Splitter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.regexp.shared.MatchResult;
import com.google.gwt.regexp.shared.RegExp;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.UIObject;
import com.google.gwt.user.client.ui.Widget;

public class TMTimer extends Composite {

	interface Binder extends UiBinder<Widget, TMTimer> {
	}

	private static Binder uiBinder = GWT.create(Binder.class);

	@UiField
	Label timeClock;

	@UiField
	Button actionButton;

	@UiField
	TMTimerStyle style;

	@UiField
	DockLayoutPanel timerPanel;
	
	@UiField
	HorizontalPanel twoButtonPanel;

	final Trigger RED;
	final Trigger YELLOW;
	final Trigger GREEN;

	private Trigger current = null;

	final List<Trigger> triggers = new ArrayList<Trigger>();

	public TMTimer() {
		initWidget(uiBinder.createAndBindUi(this));

		RED = new Trigger(style.overTime(), "0:15", null);
		YELLOW = new Trigger(style.warnTime(), "0:10", RED);
		GREEN = new Trigger(style.inTime(), "0:05", YELLOW);

		triggers.add(GREEN);
		triggers.add(YELLOW);
		triggers.add(RED);
	}

	private long startDate = 0;

	private Timer timer = null;

	private DateTimeFormat df = DateTimeFormat.getFormat("m:ss");

	private Panel getPanel() {
		return timerPanel;
	}

	private static Splitter splitterTrigger = Splitter.on('_');

	public void setTriggers(String triggers) {
		setTrigger(splitterTrigger.split(triggers));
	}

	public void setTrigger(String... triggers) {
		setTrigger(Arrays.asList(triggers));
	}

	public void setTrigger(Iterable<String> triggers) {
		int i = 0;
		Iterator<String> it = triggers.iterator();
		while (it.hasNext() && i < this.triggers.size()) {
			String timeTrigger = it.next();
			Trigger tri = this.triggers.get(i++);
			tri.setTrigger(timeTrigger);
		}
	}

	@UiHandler("actionButton")
	void onStartClick(ClickEvent event) {

		startDate = new Date().getTime();

		if (timer == null) {

			removeAllStyle();
			current = GREEN;
			timer = new Timer() {

				@Override
				public void run() {

					Date curDate = new Date();
					curDate.setTime(curDate.getTime() - startDate);

					if (current != null) {
						current.checkTrigger(curDate);
					}

					timeClock.setText(df.format(curDate));
				}
			};

			timer.scheduleRepeating(100);
			actionButton.setText("Stop");
		} else {
			timer.cancel();
			timer = null;
			actionButton.setText("Start");
			hide(actionButton);
			show(twoButtonPanel);
		}
	}

	private void hide(UIObject uiObject) {

		uiObject.addStyleName(style.disabled());
		uiObject.removeStyleName(style.enabled());

	}
	
	private void show(UIObject uiObject) {

		uiObject.addStyleName(style.enabled());
		uiObject.removeStyleName(style.disabled());

	}

	private void removeAllStyle() {
		Trigger t = GREEN;

		while (t != null) {
			getPanel().removeStyleName(t.style);
			t = t.next;
		}

	}

	static private RegExp mesureWordRegExp = RegExp.compile("(\\d+):(\\d+)");

	private static long getTimeFromStroing(String minsec) {
		long time = -1;

		MatchResult mr = mesureWordRegExp.exec(minsec);

		if (mr != null) {

			int min = Integer.parseInt(mr.getGroup(1));
			int sec = Integer.parseInt(mr.getGroup(2));

			time = (min * 60 + sec) * 1000;
		}

		return time;
	}

	private class Trigger {

		String style;
		long trigger;
		Trigger next;
		Trigger previous;

		public Trigger(String style, String trigger, Trigger next) {
			super();
			this.style = style;
			setTrigger(trigger);
			this.next = next;
			if (next != null) {
				next.previous = this;
			}

			// System.out.println(this.trigger + " " + trigger);
		}

		public void setTrigger(String trigger) {
			this.trigger = getTimeFromStroing(trigger);
		}

		public void checkTrigger(Date curDate) {
			if (curDate.getTime() - trigger >= 0) {

				getPanel().addStyleName(style);
				current = next;

				if (previous != null) {
					getPanel().removeStyleName(previous.style);
				}
			}

		}
	}

}
