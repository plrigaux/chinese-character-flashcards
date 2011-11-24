package com.plr.toastmasters.client.timer;

import java.util.Date;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

public class TMTimer extends Composite {

	interface Binder extends UiBinder<Widget, TMTimer> {
	}

	private static Binder uiBinder = GWT.create(Binder.class);

	@UiField
	Label timeClock;

	public TMTimer() {
		initWidget(uiBinder.createAndBindUi(this));

	}

	private long startDate = 0;

	private Timer t = null;

	DateTimeFormat df =  DateTimeFormat.getFormat("m:ss"); 
	
	@UiHandler("actionButton")
	void onStartClick(ClickEvent event) {

		startDate = new Date().getTime();

		if (t == null) {
			t = new Timer() {

				@Override
				public void run() {

					Date curDate = new Date();
					curDate.setTime(curDate.getTime() - startDate);

//					long laps = curDate.getTime();
//
//					long sec = laps / 1000;
//
//					long min = sec / 60;
//
//					long realSec = sec % 60;

					timeClock.setText(df.format(curDate));
				}
			};

			t.scheduleRepeating(100);
		} else {
			t.cancel();
			t = null;
		}
	}

}
