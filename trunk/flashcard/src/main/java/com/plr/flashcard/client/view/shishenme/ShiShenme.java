package com.plr.flashcard.client.view.shishenme;

import com.google.gwt.core.client.GWT;
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
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.plr.flashcard.client.DataControler;
import com.plr.flashcard.client.DataDependant;
import com.plr.flashcard.client.ZhongWenCharacter;
import com.plr.flashcard.client.CardData.CharDefinition;
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
	VerticalPanel vPanel;
	

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
		
		vPanel.clear();
		if (ok) {
			vPanel.add(new Label("Good"));
		} else {
			vPanel.add(new Label("Wong"));
		}
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
