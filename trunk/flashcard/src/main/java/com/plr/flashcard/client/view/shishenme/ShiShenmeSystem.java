package com.plr.flashcard.client.view.shishenme;

import com.google.gwt.user.client.ui.Widget;
import com.plr.flashcard.client.system.controler.ControlerSystem;

public class ShiShenmeSystem extends ControlerSystem {

	@Override
	public Widget getWidget() {
		
		return new ShiShenme(this);
	}
	

}
