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
import com.plr.flashcard.client.ZhongWenCharacter;
import com.plr.flashcard.client.view.definition.DefinitionPanel;

public class MyCard extends Composite {

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


	interface MyCardUiBinder extends UiBinder<Widget, MyCard> {
	}

	public MyCard() {
		initWidget(uiBinder.createAndBindUi(this));

		character.addStyleName("chararter");
	}

	public void setText(String text) {
		show.setText(text);
	}

	public String getText() {
		return show.getText();
	}

	@UiHandler("show")
	void onShowClick(ClickEvent event) {

		ZhongWenCharacter zwChar = DataControler.get().current();
		definitionPanel.setCharater(zwChar);
		
	}

	@UiHandler("previous")
	void onPreviousClick(ClickEvent event) {
		definitionPanel.clear();
		character.setText(DataControler.get().previous().getSimplifiedCharacter());
	}

	@UiHandler("next")
	void onNextClick(ClickEvent event) {
		definitionPanel.clear();
		character.setText(DataControler.get().next().getSimplifiedCharacter());
	}

}
