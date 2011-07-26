package com.plr.flashcard.client.view;

import java.util.List;

import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.user.cellview.client.HasKeyboardPagingPolicy.KeyboardPagingPolicy;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.NoSelectionModel;
import com.google.gwt.view.client.Range;
import com.google.gwt.view.client.RangeChangeEvent;
import com.google.gwt.view.client.RowCountChangeEvent;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SelectionModel;
import com.plr.flashcard.client.CardData;
import com.plr.flashcard.client.DataControler;
import com.plr.flashcard.client.ZhongWenCharacter;
import com.plr.flashcard.client.view.definition.DefinitionPanel;

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
	DefinitionPanel definitionPanel;

	ZhongWenCharacter zwChar = null;

	interface MyCardUiBinder extends UiBinder<Widget, MyCard> {
	}

	private CellList<ZhongWenCharacter> cellList;

	public MyCard() {
		initWidget(uiBinder.createAndBindUi(this));

		// Create a CellList.
		CharacterCell contactCell = new CharacterCell();

		cellList = new CellList<ZhongWenCharacter>(contactCell, CardData.KEY_PROVIDER) {

			@Override
			protected void renderRowValues(SafeHtmlBuilder sb, List<ZhongWenCharacter> values, int start,
					SelectionModel<? super ZhongWenCharacter> selectionModel) {

				zwChar = values.get(0);
				character.setText(zwChar.getSimplifiedCharacter());
			}

		};
		cellList.setPageSize(1);
		cellList.setKeyboardPagingPolicy(KeyboardPagingPolicy.INCREASE_RANGE);
		// cellList.setKeyboardSelectionPolicy(KeyboardSelectionPolicy.BOUND_TO_SELECTION);

		DataControler.get().addDataDisplay(cellList);

		// Add a selection model so we can select cells.
		final NoSelectionModel<ZhongWenCharacter> selectionModel = new NoSelectionModel<ZhongWenCharacter>(CardData.KEY_PROVIDER);
		selectionModel.addSelectionChangeHandler(new SelectionChangeEvent.Handler() {

			@Override
			public void onSelectionChange(SelectionChangeEvent event) {
			}

		});

		cellList.setSelectionModel(selectionModel);

		cellList.addRangeChangeHandler(new RangeChangeEvent.Handler() {
			@Override
			public void onRangeChange(RangeChangeEvent event) {
				MyCard.this.onRangeChange(event.getNewRange());
			}
		});

		cellList.addRowCountChangeHandler(new RowCountChangeEvent.Handler() {
			@Override
			public void onRowCountChange(RowCountChangeEvent event) {
				onRangeOrRowCountChanged();
			}
		});

	}

	private static class CharacterCell extends AbstractCell<ZhongWenCharacter> {

		@Override
		public void render(Context context, ZhongWenCharacter value, SafeHtmlBuilder sb) {
		}
	}

	@UiHandler("show")
	void onShowClick(ClickEvent event) {
		definitionPanel.setCharater(zwChar);
	}

	private int idx = 0;

	@UiHandler("previous")
	void onPreviousClick(ClickEvent event) {
		definitionPanel.clear();

		idx = idx == 0 ? 0 : idx - 1;
		cellList.setVisibleRange(idx, 1);

		// ZhongWenCharacter zwChar = DataControler.get().previous();
		// character.setText(zwChar.getSimplifiedCharacter());
	}

	@UiHandler("next")
	void onNextClick(ClickEvent event) {
		definitionPanel.clear();

		idx++;
		cellList.setVisibleRange(idx, 1);

	}

	private void onRangeOrRowCountChanged() {

	}

	private void onRangeChange(Range range) {

	}
}
