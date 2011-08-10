package com.plr.flashcard.client.system.controler;

import java.util.List;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Panel;
import com.plr.flashcard.client.system.LeitnerSystem;

public abstract class ControlerSystemWidget extends Composite {

	protected final List<Integer> trainingList;

	protected final ControlerSystem controlerSystem;

	protected ControlerSystemWidget(ControlerSystem controlerSystem) {
		this.controlerSystem = controlerSystem;
		trainingList = controlerSystem.getTrainingList();
		getLeitnerSystem().setNew(controlerSystem.getNewItemNb());
	}

	protected LeitnerSystem getLeitnerSystem() {
		return controlerSystem.getLeitnerSystem();
	}

	protected int nextChar() {
		if (trainingList.isEmpty()) {
			Panel panel = (Panel) this.getParent();
			this.removeFromParent();
			controlerSystem.init();
			panel.add(controlerSystem);
			return -1;
		}
		
		int charRank = trainingList.remove(trainingList.size() - 1);
		return charRank;
	}
}
