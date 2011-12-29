package com.plr.hanzi.client.system.stattable;

import java.util.List;

import com.google.gwt.view.client.HasData;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.Range;
import com.plr.hanzi.client.supermemo.RecordInfo;
import com.plr.hanzi.client.supermemo.Revision;

public class StatDataControler {

	private static final int LIMIT = 2400;

	private final Revision revision;

	/**
	 * The provider that holds the list of contacts in the database.
	 */
	private Beta dataProvider = new Beta();

	StatDataControler(Revision revision) {
		this.revision = revision;
	}

	private boolean hasData(Range visibleRange) {
		return visibleRange.getStart() + visibleRange.getLength() < LIMIT;
	}

	public void addDataDisplay(HasData<RecordInfo> display) {
		dataProvider.addDataDisplay(display);
		dataProvider.updateRowCount(LIMIT, true);
	}

	/**
	 * Refresh all displays.
	 */
	public void refreshDisplays() {
		dataProvider.refresh();
	}

	RecordInfo getCharaterByRank(int rank) {
		return dataProvider.getList().get(rank);
	}

	class Beta extends ListDataProvider<RecordInfo> {
		@Override
		protected void onRangeChanged(final HasData<RecordInfo> display) {

			Range visibleRange = display.getVisibleRange();

			// System.out.println("visibleRange " + visibleRange);
			List<RecordInfo> zhongWenCharacters = dataProvider.getList();

			// no need to load data
			if (zhongWenCharacters.size() > visibleRange.getStart() + visibleRange.getLength()) {
				// System.out.println("onRangeChangedSuper(display); ");
				onRangeChangedSuper(display);
			} else {

				if (!hasData(visibleRange)) {
					System.out.println("!hasData(visibleRange)");
					onRangeChangedSuper(display);
					return;
				}

				List<RecordInfo> recordsList = revision.getRecordsList(visibleRange.getStart(), visibleRange.getLength());

				zhongWenCharacters.addAll(recordsList);
			}
		}

		private void onRangeChangedSuper(HasData<RecordInfo> display) {
			super.onRangeChanged(display);
		}

		@Override
		public void updateRowCount(int size, boolean exact) {
			super.updateRowCount(size, exact);
		}
	}

}
