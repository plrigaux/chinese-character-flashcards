package com.plr.flashcard.client.view.flashcard;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.plr.flashcard.client.system.LeitnerSystem;

public class FlashCardSystem extends Composite {
	@UiField
	TextBox newCharacters;
	@UiField
	TextBox trainingNb;

	@UiField
	FlexTable results;
	@UiField
	Button start;

	interface Binder extends UiBinder<Widget, FlashCardSystem> {
	}

	private static Binder uiBinder = GWT.create(Binder.class);

	private LeitnerSystem leitnerSystem = null;

	public FlashCardSystem() {
		initWidget(uiBinder.createAndBindUi(this));

		leitnerSystem =  LeitnerSystem.load();

		init();
	}

	@UiHandler("start")
	void onStartClick(ClickEvent event) {

		String value = newCharacters.getText();

		int v;
		try {
			v = Integer.valueOf(value);
		} catch (Exception e) {
			Window.alert("Not int");
			return;
		}

		value = trainingNb.getText();
		int t;
		try {
			t = Integer.valueOf(value);
		} catch (Exception e) {
			Window.alert("Not int");
			return;
		}

		FlashCard fc = new FlashCard(this, v, t);
		Panel panel = (Panel) this.getParent();
		this.removeFromParent();
		panel.add(fc);
	}

	void init() {
		results.clear();
		int row = 0;
		for (LeitnerSystem.LEVEL l : LeitnerSystem.LEVEL.values()) {

			results.setText(row, 0, l.name());
			results.setText(row, 1, "" + leitnerSystem.size(l));
			row++;
		}
		newCharacters.setText("5");
		trainingNb.setText("20");
		leitnerSystem.save();
	}

	public LeitnerSystem getLeitnerSystem() {
		return leitnerSystem;
	}

}
