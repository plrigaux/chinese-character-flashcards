package com.plr.flashcard.client.view.flashcard;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.user.cellview.client.HasKeyboardPagingPolicy.KeyboardPagingPolicy;
import com.google.gwt.user.client.Random;
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
import com.plr.flashcard.client.AppResources;
import com.plr.flashcard.client.CardData;
import com.plr.flashcard.client.DataControler;
import com.plr.flashcard.client.ZhongWenCharacter;
import com.plr.flashcard.client.view.definition.DefinitionPanel;

public class FlashCard extends Composite {

	private static Binder uiBinder = GWT.create(Binder.class);

	@UiField
	Button show;
	@UiField
	Button again;
	@UiField
	Button hard;
	@UiField
	Button good;
	@UiField
	Button easy;
	@UiField
	Label character;
	@UiField
	DefinitionPanel definitionPanel;

	@UiField
	DivElement showDiv;

	@UiField
	DivElement buttonsDiv;

	@UiField
	FlashCardStyle style;

	ZhongWenCharacter zwChar = null;

	interface Binder extends UiBinder<Widget, FlashCard> {
	}

	private CellList<ZhongWenCharacter> cellList;

	List<ZhongWenCharacter> theList = new ArrayList<ZhongWenCharacter>();

	public FlashCard() {
		initWidget(uiBinder.createAndBindUi(this));

		// Create a CellList.
		CharacterCell contactCell = new CharacterCell();

		cellList = new CellList<ZhongWenCharacter>(contactCell, CardData.KEY_PROVIDER) {

			@Override
			protected void renderRowValues(SafeHtmlBuilder sb, List<ZhongWenCharacter> values, int start,
					SelectionModel<? super ZhongWenCharacter> selectionModel) {

				shuffle(values);


			}

		};
		cellList.setPageSize(15);
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
				FlashCard.this.onRangeChange(event.getNewRange());
			}
		});

		cellList.addRowCountChangeHandler(new RowCountChangeEvent.Handler() {
			@Override
			public void onRowCountChange(RowCountChangeEvent event) {
				onRangeOrRowCountChanged();
			}
		});

		again.addStyleName(style.button());
		hard.addStyleName(style.button());
		good.addStyleName(style.button());
		easy.addStyleName(style.button());

		show.addStyleName(style.showButton());

		character.addStyleName(AppResources.INSTANCE.style().character());
	}

	private static class CharacterCell extends AbstractCell<ZhongWenCharacter> {

		@Override
		public void render(Context context, ZhongWenCharacter value, SafeHtmlBuilder sb) {
		}
	}

	@UiHandler("show")
	void onShowClick(ClickEvent event) {
		definitionPanel.setVisible(true);
		definitionPanel.setCharater(zwChar);
		buttonsDiv.setClassName(style.enabled());
		showDiv.setClassName(style.disabled());
	}

	private int idx = 0;

	private void onRangeOrRowCountChanged() {

	}

	private void onRangeChange(Range range) {

	}

	@UiHandler("again")
	void onAgainClick(ClickEvent event) {
		nextZwChar();

	}

	private void nextZwChar() {
		showDiv.setClassName(style.enabled());
		buttonsDiv.setClassName(style.disabled());
		definitionPanel.setVisible(false);

		// idx++;
		// cellList.setVisibleRange(idx, 1);

		if (idx >= theList.size()) {
			cellList.setVisibleRange(idx, 15);
		} else {
			zwChar = theList.get(idx++);
			character.setText(zwChar.getSimplifiedCharacter());
		}
	}

	@UiHandler("hard")
	void onHardClick(ClickEvent event) {
		nextZwChar();
	}

	@UiHandler("good")
	void onGoodClick(ClickEvent event) {
		nextZwChar();
	}

	@UiHandler("easy")
	void onEasyClick(ClickEvent event) {
		nextZwChar();
	}

	private void shuffle(List<ZhongWenCharacter> values) {
		idx = 0;

		theList.clear();
		theList.addAll(values);

		for (int i = 0; i < theList.size(); i++) {
			int index = Random.nextInt(theList.size());

			ZhongWenCharacter c1 = theList.get(i);
			ZhongWenCharacter c2 = theList.get(index);
			theList.set(index, c1);
			theList.set(i, c2);
		}
		
		zwChar = theList.get(idx++);
		character.setText(zwChar.getSimplifiedCharacter());

	}
}
