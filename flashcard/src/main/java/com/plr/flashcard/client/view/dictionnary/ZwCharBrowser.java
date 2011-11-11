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
package com.plr.flashcard.client.view.dictionnary;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.HasKeyboardPagingPolicy.KeyboardPagingPolicy;
import com.google.gwt.user.cellview.client.HasKeyboardSelectionPolicy.KeyboardSelectionPolicy;
import com.google.gwt.user.cellview.client.SimplePager;
import com.google.gwt.user.cellview.client.SimplePager.TextLocation;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SingleSelectionModel;
import com.plr.flashcard.client.CardData;
import com.plr.flashcard.client.DataControler;
import com.plr.flashcard.client.ZhongWenCharacter;
import com.plr.flashcard.client.view.main.PanelConst;

/**
 * Display all the characters
 */
public class ZwCharBrowser extends Composite {

	interface Binder extends UiBinder<Widget, ZwCharBrowser> {
	}

	private static Binder uiBinder = GWT.create(Binder.class);

	/**
	 * The pager used to display the current range.
	 */
	@UiField(provided = true)
	SimplePager pager;

	/**
	 * The CellList.
	 */
	@UiField(provided = true)
	CellTable<ZhongWenCharacter> cellTable;

	/**
	 * Initialize this example.
	 */
	public ZwCharBrowser() {

		cellTable = new CellTable<ZhongWenCharacter>(CardData.KEY_PROVIDER);

		// Create rank column.
		TextColumn<ZhongWenCharacter> rankColumn = new TextColumn<ZhongWenCharacter>() {
			@Override
			public String getValue(ZhongWenCharacter zwChar) {
				return "" + zwChar.getId();
			}
		};

		TextColumn<ZhongWenCharacter> zhCharColumn = new TextColumn<ZhongWenCharacter>() {
			@Override
			public String getValue(ZhongWenCharacter zwChar) {
				return zwChar.getSimplifiedCharacter();
			}
		};

		cellTable.addColumn(rankColumn, "Rank");
		cellTable.addColumn(zhCharColumn, "Simplified");

		cellTable.setPageSize(getPageSize());
		cellTable.setKeyboardPagingPolicy(KeyboardPagingPolicy.CHANGE_PAGE);
		cellTable.setKeyboardSelectionPolicy(KeyboardSelectionPolicy.BOUND_TO_SELECTION);

		// // Create a Pager to control the table.
		SimplePager.Resources pagerResources = GWT.create(SimplePager.Resources.class);
		pager = new SimplePager(TextLocation.CENTER, pagerResources, false, 0, true);
		pager.setDisplay(cellTable);

		// Add a selection model so we can select cells.
		final SingleSelectionModel<ZhongWenCharacter> selectionModel = new SingleSelectionModel<ZhongWenCharacter>(
				CardData.KEY_PROVIDER);
		cellTable.setSelectionModel(selectionModel);
		selectionModel.addSelectionChangeHandler(new SelectionChangeEvent.Handler() {

			@Override
			public void onSelectionChange(SelectionChangeEvent event) {
				ZhongWenCharacter zwChar = selectionModel.getSelectedObject();

				//History.back();
				History.
				History.newItem(PanelConst.DICTIONNARY + "/" + zwChar.getId());
				
				
				History.newItem(PanelConst.CHARARCTER + "/" + zwChar.getId());
			}

		});

		// Add the CellList to the data provider in the database.
		DataControler.get().addDataDisplay(cellTable);

		initWidget(uiBinder.createAndBindUi(this));
	}

	public void setCharaterId(String charId) {
		try {
			int index = Integer.valueOf(charId);
			cellTable.setVisibleRange(index - 1, getPageSize());
		} catch (NumberFormatException e) {
			History.newItem(PanelConst.DICTIONNARY, false);
		}
	}

	private int getPageSize() {
		return 15;
	}

}
