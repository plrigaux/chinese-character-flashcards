package com.plr.hanzi.client.system.stattable;

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
import com.google.gwt.view.client.ProvidesKey;
import com.google.gwt.view.client.Range;
import com.google.gwt.view.client.RangeChangeEvent;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SingleSelectionModel;
import com.plr.hanzi.client.ApplicationConst;
import com.plr.hanzi.client.supermemo.RecordInfo;
import com.plr.hanzi.client.supermemo.Revision;

public class StatTable extends Composite {

	interface Binder extends UiBinder<Widget, StatTable> {
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
	CellTable<RecordInfo> cellTable;

	private static Range lastAccessedRange = null;



	public StatTable(Revision revision) {
				
		ProvidesKey<RecordInfo> providesKey = new ProvidesKey<RecordInfo>() {

			@Override
			public Object getKey(RecordInfo item) {
				return item == null ? null : item.getId();
			}
		};
		
		cellTable = new CellTable<RecordInfo>(providesKey);

		// Create rank column.
		TextColumn<RecordInfo> rankColumn = new TextColumn<RecordInfo>() {
			@Override
			public String getValue(RecordInfo zwChar) {
				return "" + zwChar.getId();
			}
		};

		TextColumn<RecordInfo> zhCharColumn = new TextColumn<RecordInfo>() {
			@Override
			public String getValue(RecordInfo zwChar) {
				return "" + zwChar.getOrder();
			}
		};
		
		TextColumn<RecordInfo> efColumn = new TextColumn<RecordInfo>() {
			@Override
			public String getValue(RecordInfo zwChar) {
				return "" + zwChar.getEf();
			}
		};

		cellTable.addColumn(rankColumn, "Rank");
		cellTable.addColumn(zhCharColumn, "Order");
		cellTable.addColumn(efColumn, "EF");
		
		cellTable.setPageSize(getPageSize());
		cellTable.setKeyboardPagingPolicy(KeyboardPagingPolicy.CHANGE_PAGE);
		cellTable.setKeyboardSelectionPolicy(KeyboardSelectionPolicy.BOUND_TO_SELECTION);

		// // Create a Pager to control the table.
		SimplePager.Resources pagerResources = GWT.create(SimplePager.Resources.class);
		pager = new SimplePager(TextLocation.CENTER, pagerResources, false, 0, true);
		pager.setDisplay(cellTable);

		// Add a selection model so we can select cells.
		final SingleSelectionModel<RecordInfo> selectionModel = new SingleSelectionModel<RecordInfo>(
				providesKey);
		cellTable.setSelectionModel(selectionModel);
		selectionModel.addSelectionChangeHandler(new SelectionChangeEvent.Handler() {

			@Override
			public void onSelectionChange(SelectionChangeEvent event) {
				RecordInfo zwChar = selectionModel.getSelectedObject();
				History.newItem(ApplicationConst.CHARARCTER + "/" + zwChar.getId());
			}
		});

		StatDataControler statDataControler = new StatDataControler(revision);
		// Add the CellList to the data provider in the database.
		statDataControler.addDataDisplay(cellTable);
		
		cellTable.addRangeChangeHandler(new RangeChangeEvent.Handler() {
			@Override
			public void onRangeChange(RangeChangeEvent event) {
				lastAccessedRange = event.getNewRange();
			}
		});

		if (lastAccessedRange != null) {
			cellTable.setVisibleRange(lastAccessedRange);
		}
				
		initWidget(uiBinder.createAndBindUi(this));
	}

	private int getPageSize() {
		return 15;
	}

}
