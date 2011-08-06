package com.plr.flashcard.client.view.flashcard;

import java.util.List;
import java.util.logging.Level;

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
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Panel;
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
import com.plr.flashcard.client.system.LeitnerSystem.LEVEL;
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

	// List<ZhongWenCharacter> theList = new ArrayList<ZhongWenCharacter>();

	
	private final List<Integer> trainingList;

	private final FlashCardSystem flashCardSystem;

	public FlashCard(FlashCardSystem flashCardSystem, int newItems, int listSize) {
		initWidget(uiBinder.createAndBindUi(this));

		this.flashCardSystem = flashCardSystem;

		flashCardSystem.getLeitnerSystem().setNew(newItems);

		trainingList = flashCardSystem.getLeitnerSystem().getTrainingList(listSize);

		// Create a CellList.
		CharacterCell contactCell = new CharacterCell();

		cellList = new CellList<ZhongWenCharacter>(contactCell, CardData.KEY_PROVIDER) {

			@Override
			protected void renderRowValues(SafeHtmlBuilder sb, List<ZhongWenCharacter> values, int start,
					SelectionModel<? super ZhongWenCharacter> selectionModel) {
				setChar(values);
				// shuffle(values);
			}
		};

		// cellList.setPageSize(PAGE_SIZE);
		cellList.setKeyboardPagingPolicy(KeyboardPagingPolicy.INCREASE_RANGE);

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

		nextZwChar();
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

	// private int idx = 0;
	// private int pageIdx = 1;

	private void onRangeOrRowCountChanged() {

	}

	private void onRangeChange(Range range) {

	}

	@UiHandler("again")
	void onAgainClick(ClickEvent event) {

		flashCardSystem.getLeitnerSystem().answerCard(LEVEL.LEVEL_1, zwChar);
		nextZwChar();
	}

	@UiHandler("hard")
	void onHardClick(ClickEvent event) {
		flashCardSystem.getLeitnerSystem().answerCard(LEVEL.LEVEL_2, zwChar);
		nextZwChar();
	}

	@UiHandler("good")
	void onGoodClick(ClickEvent event) {
		flashCardSystem.getLeitnerSystem().answerCard(LEVEL.LEVEL_3, zwChar);
		nextZwChar();
	}

	@UiHandler("easy")
	void onEasyClick(ClickEvent event) {
		flashCardSystem.getLeitnerSystem().answerCard(LEVEL.LEVEL_4, zwChar);
		nextZwChar();
	}

	private void nextZwChar() {
		showDiv.setClassName(style.enabled());
		buttonsDiv.setClassName(style.disabled());
		definitionPanel.setVisible(false);

		if (trainingList.isEmpty()) {
			Panel panel = (Panel) this.getParent();
			this.removeFromParent();
			flashCardSystem.init();
			panel.add(flashCardSystem);
			return;
		}

		int charRank = trainingList.remove(trainingList.size() - 1);

		//cause the rank start at 1 and index start at 0
		cellList.setVisibleRange(charRank - 1, 1);
	}

	private void setChar(List<ZhongWenCharacter> values) {
		if (values.isEmpty()) {
			return;
		}

		zwChar = values.get(0);
		character.setText(zwChar.getSimplifiedCharacter());
		AppResources.logger.log(Level.INFO, "Rank " + zwChar.getId() + " char: " + zwChar.getSimplifiedCharacter());
	}
}
