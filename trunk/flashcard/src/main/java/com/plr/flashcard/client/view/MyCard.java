package com.plr.flashcard.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.plr.flashcard.client.CardData;
import com.plr.flashcard.client.CardData.CharDefinition;
import com.plr.flashcard.client.DataControler;

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
	VerticalPanel answer;

	private final DataControler dataControler;

	interface MyCardUiBinder extends UiBinder<Widget, MyCard> {
	}

	public MyCard(DataControler dataControler) {
		initWidget(uiBinder.createAndBindUi(this));

		character.addStyleName("chararter");
		this.dataControler = dataControler;
	}

	public void setText(String text) {
		show.setText(text);
	}

	public String getText() {
		return show.getText();
	}

	@UiHandler("show")
	void onShowClick(ClickEvent event) {

		CardData cardData = dataControler.current();
		answer.clear();
		
		JsArray<CharDefinition> jsArray = cardData.getDefinitions();
		FlexTable ft = new FlexTable();
		int row = 0;
		for (int j = 0; j < jsArray.length(); j++) {
			CharDefinition charDefinition = cardData.getDefinitions().get(j);

			Label lp = new Label(charDefinition.getPinyin());
			lp.addStyleName("pinyin");

			int tone = charDefinition.getTone();

			String toneStyle;
			switch (tone) {
			case 1:
				toneStyle = "tone1";
				break;
			case 2:
				toneStyle = "tone2";
				break;
			case 3:
				toneStyle = "tone3";
				break;
			case 4:
				toneStyle = "tone4";
				break;
			default:
				toneStyle = "tone5";

			}

			lp.addStyleName(toneStyle);

			ft.setWidget(row, 0, lp);

			for (int k = 0; k < charDefinition.getDefinition().length(); k++) {
				ft.setText(row++, 1, charDefinition.getDefinition().get(k));
			}

		}

		answer.add(ft);
	}

	@UiHandler("previous")
	void onPreviousClick(ClickEvent event) {
		answer.clear();
		character.setText(dataControler.previous().getSimplifiedCharacter());
	}

	@UiHandler("next")
	void onNextClick(ClickEvent event) {
		answer.clear();
		character.setText(dataControler.next().getSimplifiedCharacter());
	}

}
