package com.plr.flashcard.client.view.flashcard;

import com.google.gwt.user.client.ui.Widget;
import com.plr.flashcard.client.system.controler.ControlerSystem;

public class FlashCardSystem extends ControlerSystem {

	@Override
	public Widget getWidget() {
		return new FlashCard(this);
	}

	@Override
	protected String getSaverKey() {
		return "chinese.character.trainer.flashcard.leitner";
	}

	
	
}
