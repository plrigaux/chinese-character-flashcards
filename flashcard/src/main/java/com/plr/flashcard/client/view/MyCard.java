package com.plr.flashcard.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.plr.flashcard.client.DataControler;
import com.plr.flashcard.client.DataDependant;
import com.plr.flashcard.client.ZhongWenCharacter;
import com.plr.flashcard.client.view.definition.DefinitionPanel;

public class MyCard extends Composite implements DataDependant {

	private static MyCardUiBinder uiBinder = GWT.create(MyCardUiBinder.class);

	@UiField
	Button show;
	@UiField
	Button next;
	@UiField
	Button previous;
	@UiField
	Label character;
	@UiField
	DefinitionPanel definitionPanel;

	ZhongWenCharacter zwChar = null;

	interface MyCardUiBinder extends UiBinder<Widget, MyCard> {
	}

	public MyCard() {
		initWidget(uiBinder.createAndBindUi(this));
		DataControler.get().register(this);
	}

	@UiHandler("show")
	void onShowClick(ClickEvent event) {

		ZhongWenCharacter zwChar = DataControler.get().current();
		definitionPanel.setCharater(zwChar);

	}

	@UiHandler("previous")
	void onPreviousClick(ClickEvent event) {
		definitionPanel.clear();
		ZhongWenCharacter zwChar = DataControler.get().previous();
		character.setText(zwChar.getSimplifiedCharacter());
	}

	@UiHandler("next")
	void onNextClick(ClickEvent event) {
		definitionPanel.clear();
		ZhongWenCharacter zwChar = DataControler.get().next();
		character.setText(zwChar.getSimplifiedCharacter());
	}

	@Override
	public void dataReady() {
		zwChar = DataControler.get().current();
		character.setText(zwChar.getSimplifiedCharacter());
	}

}
