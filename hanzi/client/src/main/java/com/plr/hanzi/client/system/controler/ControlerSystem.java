package com.plr.hanzi.client.system.controler;

import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.plr.hanzi.client.supermemo.Record;
import com.plr.hanzi.client.supermemo.RecordInfo;
import com.plr.hanzi.client.supermemo.Revision;
import com.plr.hanzi.client.system.LeitnerSystem.LEVEL;
import com.plr.hanzi.client.view.welcome.CustomButton;

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
	CustomButton start;

	interface Binder extends UiBinder<Widget, ControlerSystem> {
	}

	private static Binder uiBinder = GWT.create(Binder.class);

	private Revision leitnerSystem = null;

	private int training = SESSION_NUMBER;

	private int newItem = 0;

	protected abstract String getSaverKey();

	public ControlerSystem() {
		initWidget(uiBinder.createAndBindUi(this));

		leitnerSystem = Revision.load(getSaverKey());

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

	@Override
	public abstract Widget getWidget();

	public int getTrainingNb() {
		return training;
	}

	public int getNewItemNb() {
		return newItem;
	}

	public List<RecordInfo> getTrainingList() {
		int nb = getTrainingNb();
		return leitnerSystem.getRecordsBatch();
	}

	public void init() {
		results.clear();
	
		newCharacters.setText("" + getNewItemNb());
		trainingNb.setText("" + getTrainingNb());
		leitnerSystem.save();
	}

	public void answerWrong(RecordInfo charInfo) {
		// TODO Auto-generated method stub
		
	}

	public void answerOk(RecordInfo charInfo) {
		// TODO Auto-generated method stub
		
	}

	public void answerCard(LEVEL level3, RecordInfo charInfo) {
		// TODO Auto-generated method stub
		
	}

//	public LeitnerSystem getLeitnerSystem() {
//		return leitnerSystem;
//	}

	
}