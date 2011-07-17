package com.plr.flashcard.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

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

	private JsArray<CardData> cardDatas;
	int index = 0;

	interface MyCardUiBinder extends UiBinder<Widget, MyCard> {
	}

	public MyCard() {
		initWidget(uiBinder.createAndBindUi(this));

		character.addStyleName("chararter");
	}

	public MyCard(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
		show.setText(firstName);
	}

	public void setText(String text) {
		show.setText(text);
	}

	public String getText() {
		return show.getText();
	}

	@UiHandler("show")
	void onShowClick(ClickEvent event) {

	}

	@UiHandler("previous")
	void onPreviousClick(ClickEvent event) {
		index = index <= 0 ? 0 : index - 1;
		character.setText(cardDatas.get(index).getSimplifiedCharacter());
	}

	@UiHandler("next")
	void onNextClick(ClickEvent event) {

		index = index <= (cardDatas.length() - 2) ? index + 1 : cardDatas
				.length() - 1;
		character.setText(cardDatas.get(index).getSimplifiedCharacter());
	}

	public void setCardData(JsArray<CardData> cardDatas) {
		this.cardDatas = cardDatas;
		index = 0;

		character.setText(cardDatas.get(index).getSimplifiedCharacter());
	}
}
