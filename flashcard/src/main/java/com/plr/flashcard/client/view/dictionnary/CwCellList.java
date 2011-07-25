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

import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.user.cellview.client.HasKeyboardPagingPolicy.KeyboardPagingPolicy;
import com.google.gwt.user.cellview.client.HasKeyboardSelectionPolicy.KeyboardSelectionPolicy;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SingleSelectionModel;
import com.plr.flashcard.client.CardData;
import com.plr.flashcard.client.DataControler;
import com.plr.flashcard.client.ZhongWenCharacter;

/**
 * Example file.
 */

public class CwCellList extends ContentWidget {

	/**
	 * The UiBinder interface used by this example.
	 */

	interface Binder extends UiBinder<Widget, CwCellList> {
	}


	/**
	 * The Cell used to render a {@link ContactInfo}.
	 */
	static class CharacterCell extends AbstractCell<ZhongWenCharacter> {

		/**
		 * The html of the image used for contacts.
		 */

		public CharacterCell() {
		}

		@Override
		public void render(Context context, ZhongWenCharacter value, SafeHtmlBuilder sb) {
			// Value can be null, so do a null check..
			if (value == null) {
				return;
			}

			sb.appendHtmlConstant("<span style=\"font-size: large;\">");
			sb.appendEscaped(value.getSimplifiedCharacter());
			sb.appendHtmlConstant("</span>");
		}
	}

	/**
	 * The contact form used to update contacts.
	 */

	@UiField
	ContactInfoForm contactForm;

	/**
	 * The pager used to change the range of data.
	 */

	@UiField
	ShowMorePagerPanel pagerPanel;

	/**
	 * The pager used to display the current range.
	 */

	@UiField
	RangeLabelPager rangeLabelPager;

	/**
	 * The CellList.
	 */

	private CellList<ZhongWenCharacter> cellList;

	/**
	 * Initialize this example.
	 */
	@Override
	public Widget onInitialize() {
		// Images images = GWT.create(Images.class);

		// Create a CellList.
		CharacterCell contactCell = new CharacterCell();

		// Set a key provider that provides a unique key for each contact. If
		// key is
		// used to identify contacts when fields (such as the name and address)
		// change.
		cellList = new CellList<ZhongWenCharacter>(contactCell, CardData.KEY_PROVIDER);
		cellList.setPageSize(30);
		cellList.setKeyboardPagingPolicy(KeyboardPagingPolicy.INCREASE_RANGE);
		cellList.setKeyboardSelectionPolicy(KeyboardSelectionPolicy.BOUND_TO_SELECTION);

		// Add a selection model so we can select cells.
		final SingleSelectionModel<ZhongWenCharacter> selectionModel = new SingleSelectionModel<ZhongWenCharacter>(
				CardData.KEY_PROVIDER);
		cellList.setSelectionModel(selectionModel);
		selectionModel.addSelectionChangeHandler(new SelectionChangeEvent.Handler() {

			public void onSelectionChange(SelectionChangeEvent event) {
				contactForm.setCharater(selectionModel.getSelectedObject());
			}

		});

		// Create the UiBinder.
		Binder uiBinder = GWT.create(Binder.class);
		Widget widget = uiBinder.createAndBindUi(this);
	
		// Add the CellList to the data provider in the database.
		DataControler.get().addDataDisplay(cellList);

		// Set the cellList as the display of the pagers. This example has two
		// pagers. pagerPanel is a scrollable pager that extends the range when
		// the
		// user scrolls to the bottom. rangeLabelPager is a pager that displays
		// the
		// current range, but does not have any controls to change the range.
		pagerPanel.setDisplay(cellList);
		rangeLabelPager.setDisplay(cellList);

		return widget;
	}

	@Override
	protected void asyncOnInitialize(final AsyncCallback<Widget> callback) {
		GWT.runAsync(CwCellList.class, new RunAsyncCallback() {

			public void onFailure(Throwable caught) {
				callback.onFailure(caught);
			}

			public void onSuccess() {
				callback.onSuccess(onInitialize());
			}
		});
	}
}
