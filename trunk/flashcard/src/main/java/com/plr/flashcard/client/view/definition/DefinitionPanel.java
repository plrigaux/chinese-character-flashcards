/*
 * Copyright 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.plr.flashcard.client.view.definition;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.plr.flashcard.client.AppResources;
import com.plr.flashcard.client.CardData.CharDefinition;
import com.plr.flashcard.client.Tone;
import com.plr.flashcard.client.ZhongWenCharacter;

/**
 * A form used for editing contacts.
 */
public class DefinitionPanel extends Composite {

	private static Binder uiBinder = GWT.create(Binder.class);

	interface Binder extends UiBinder<Widget, DefinitionPanel> {
	}

	@UiField
	SimplePanel simplePanel;

//	private ZhongWenCharacter contactInfo;

	public DefinitionPanel() {
		initWidget(uiBinder.createAndBindUi(this));

		// Add the categories to the category box.

		// Initialize the contact to null.
		setCharater(null);

	}

	public void setCharater(ZhongWenCharacter zwChar) {
//		this.contactInfo = contact;
		// updateButton.setEnabled(contact != null);
		if (zwChar != null) {
					
			FlexTable definitionTable = new FlexTable();
			int row = 0;
			for (int j = 0; j < zwChar.definitionCount(); j++) {
				CharDefinition charDefinition = zwChar.getDefinition(j);

				Label lp = new Label(charDefinition.getPinyin());
				lp.addStyleName(AppResources.INSTANCE.style().pinyin());

				int tone = charDefinition.getTone();
				
				String toneStyle = Tone.getTone(tone).getCssClass();
				
				lp.addStyleName(toneStyle);

				definitionTable.setWidget(row, 0, lp);

				for (int k = 0; k < charDefinition.getDefinition().length(); k++) {
					definitionTable.setText(row++, 1, charDefinition.getDefinition().get(k));
				}
				
				simplePanel.clear();
				simplePanel.add(definitionTable);
			}
		}
	}

	public void clear() {
		simplePanel.clear();
		
	}
	
//	public void setVisible(boolean visible) {
//		simplePanel.setVisible(visible);		
//	}
}
