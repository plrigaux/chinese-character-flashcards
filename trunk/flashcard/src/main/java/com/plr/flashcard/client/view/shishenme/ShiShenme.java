package com.plr.flashcard.client.view.shishenme;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.plr.flashcard.client.CardData.CharDefinition;
import com.plr.flashcard.client.DataControler;
import com.plr.flashcard.client.DataDependant;
import com.plr.flashcard.client.Tone;
import com.plr.flashcard.client.ZhongWenCharacter;
import com.plr.flashcard.client.view.definition.DefinitionPanel;

public class ShiShenme extends Composite implements DataDependant {

	private static Binder uiBinder = GWT.create(Binder.class);

	@UiField
	Button answerValidate;
	@UiField
	Label character;
	@UiField
	DefinitionPanel definitionPanel;

	@UiField
	TextBox answer;

	@UiField
	DivElement result;

	@UiField
	Style style;

	ZhongWenCharacter zwChar = null;

	interface Binder extends UiBinder<Widget, ShiShenme> {
	}

	public ShiShenme() {
		initWidget(uiBinder.createAndBindUi(this));

		character.addStyleName("chararter");

		DataControler.get().register(this);
	}

	@UiHandler("answerValidate")
	void onAnswerValidateClick(ClickEvent event) {
		doValidate();
	}

	@UiHandler("answer")
	void onAnswerKeyPress(KeyPressEvent event) {
		int keyCode = event.getUnicodeCharCode();
		if (KeyCodes.KEY_ENTER == keyCode) {
			doValidate();
		}
	}

	private void doValidate() {
		String input = answer.getText();

		input.toLowerCase();

		boolean ok = false;
		for (int i = 0; i < zwChar.definitionCount(); i++) {
			CharDefinition charDef = zwChar.getDefinition(i);
			String pn = charDef.getPinyinNum().toLowerCase();
			if (pn.toLowerCase().equals(input.toLowerCase())) {
				ok = true;
				break;
			}
		}

		StringBuilder displayAnswer = new StringBuilder();
		displayAnswer.append("<p>Previous: ");
		if (ok) {
			displayAnswer.append("<span class='").append(style.ok()).append("'>对</span>");
		} else {
			displayAnswer.append("<span class='").append(style.wrong()).append("'>错</span>");
		}

		displayAnswer.append("<br/>");
		displayAnswer.append("<span class='" + style.askedChar() + "'>");
		displayAnswer.append(zwChar.getSimplifiedCharacter());
		displayAnswer.append("</span> is ");

		int count = zwChar.definitionCount();
		for (int i = 0; i < count; i++) {

			if (i != 0) {
				if (i + 1 == count) {
					displayAnswer.append(" or ");
				} else {
					displayAnswer.append(", ");
				}
			}

			CharDefinition charDefinition = zwChar.getDefinition(i);

			String pinyin = charDefinition.getPinyin();
			int tone = charDefinition.getTone();
			String toneStyle = Tone.getTone(tone).getCssClass();

			displayAnswer.append("<span class='").append(toneStyle).append("'>").append(pinyin).append("</span>");
		}

		displayAnswer.append(".</p>");
		result.setInnerHTML(displayAnswer.toString());

		nextChar();
	}

	@Override
	public void dataReady() {

		zwChar = DataControler.get().current();

		character.setText(zwChar.getSimplifiedCharacter());
	}

	public void nextChar() {
		answer.setText("");

		zwChar = DataControler.get().next();

		character.setText(zwChar.getSimplifiedCharacter());
	}
}
