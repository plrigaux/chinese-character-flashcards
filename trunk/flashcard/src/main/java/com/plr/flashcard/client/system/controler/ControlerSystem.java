package com.plr.flashcard.client.system.controler;

import java.util.List;

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
import com.plr.flashcard.client.system.CharInfo;
import com.plr.flashcard.client.system.LeitnerSystem;
import com.plr.flashcard.client.system.LeitnerSystem.LEVEL;

public abstract class ControlerSystem extends Composite {
	private static final int DEFAULT_NEW = 5;
	
	private static final int SESSION_NUMBER = 20;
	@UiField
	TextBox newCharacters;
	@UiField
	TextBox trainingNb;

	@UiField
	FlexTable results;
	@UiField
	Button start;

	interface Binder extends UiBinder<Widget, ControlerSystem> {
	}

	private static Binder uiBinder = GWT.create(Binder.class);

	private LeitnerSystem leitnerSystem = null;

	private int training = SESSION_NUMBER;

	private int newItem = 0;

	protected abstract String getSaverKey();

	public ControlerSystem() {
		initWidget(uiBinder.createAndBindUi(this));

		leitnerSystem = LeitnerSystem.load(getSaverKey());

		init();
	}

	@UiHandler("start")
	void onStartClick(ClickEvent event) {

		String value = newCharacters.getText();

		try {
			newItem = Integer.valueOf(value);
		} catch (Exception e) {
			Window.alert("Not int");
			return;
		}

		value = trainingNb.getText();

		try {
			training = Integer.valueOf(value);
		} catch (Exception e) {
			Window.alert("Not int");
			return;
		}

		Widget widget = getWidget();
		Panel panel = (Panel) this.getParent();

		this.removeFromParent();
		panel.add(widget);

	}

	public abstract Widget getWidget();

	public int getTrainingNb() {
		return training;
	}

	public int getNewItemNb() {
		return newItem;
	}

	public List<CharInfo> getTrainingList() {
		int nb = getTrainingNb();
		return leitnerSystem.getTrainingList(nb);
	}

	public void init() {
		results.clear();
		int row = 0;

		for (LeitnerSystem.LEVEL l : LeitnerSystem.LEVEL.values()) {

			results.setText(row, 0, l.name());
			results.setText(row, 1, "" + leitnerSystem.size(l));
			row++;
		}

		setNewSize();
		newCharacters.setText("" + getNewItemNb());
		trainingNb.setText("" + getTrainingNb());
		leitnerSystem.save(getSaverKey());
	}

	public LeitnerSystem getLeitnerSystem() {
		return leitnerSystem;
	}

	private void setNewSize() {
		int newSize = leitnerSystem.size(LEVEL.NEW);
		newItem = DEFAULT_NEW - newSize;
		newItem = Math.max(0, newItem);
	}
}
