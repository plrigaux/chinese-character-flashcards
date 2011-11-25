package com.plr.toastmasters.client.timer;

import java.util.Date;

import com.google.gwt.core.client.GWT;
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
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootLayoutPanel;
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

	final Trigger RED;
	final Trigger YELLOW;
	final Trigger GREEN;

	private Trigger current = null;

	public TMTimer() {
		initWidget(uiBinder.createAndBindUi(this));

		RED = new Trigger(style.overTime(), "0:15", null);
		YELLOW = new Trigger(style.warnTime(), "0:10", RED);
		GREEN = new Trigger(style.inTime(), "0:05", YELLOW);

		
	}

	private long startDate = 0;

	private Timer t = null;

	private DateTimeFormat df = DateTimeFormat.getFormat("m:ss");

	@UiHandler("actionButton")
	void onStartClick(ClickEvent event) {

		startDate = new Date().getTime();

		if (t == null) {
			
			removeAllStyle();
			current = GREEN;
			t = new Timer() {

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

			t.scheduleRepeating(100);
			actionButton.setText("Stop");
		} else {
			t.cancel();
			t = null;
			actionButton.setText("Start");

			
		}
	}

	private void removeAllStyle() {
		Trigger t = GREEN;
		
		
		do {
			RootLayoutPanel.get().removeStyleName(t.style);
			t = t.next;
		} while(t != null);
		
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
			this.trigger = getTimeFromStroing(trigger);
			this.next = next;
			if (next != null) {
				next.previous = this;
			}

			System.out.println(this.trigger + " " + trigger);
		}

		public void checkTrigger(Date curDate) {
			if (curDate.getTime() - trigger >= 0) {

				RootLayoutPanel.get().addStyleName(style);
				current = next;

				if (previous != null) {
					RootLayoutPanel.get().removeStyleName(previous.style);
				}
			}

		}
	}

}
