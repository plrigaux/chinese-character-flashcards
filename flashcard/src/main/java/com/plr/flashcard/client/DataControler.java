package com.plr.flashcard.client;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.view.client.HasData;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.Range;

public class DataControler {
	private static final int CHAR_BY_FILE = 200;

	private static final int LIMIT = 2400;

	private static DataControler instance = null;

	static private Logger LOGGER = Logger.getLogger(DataControler.class.getName());

	private int lastLoadedIndex = 0;
	/**
	 * The provider that holds the list of contacts in the database.
	 */
	private ListDataProvider<ZhongWenCharacter> dataProvider = new ListDataProvider<ZhongWenCharacter>() {
		@Override
		protected void onRangeChanged(final HasData<ZhongWenCharacter> display) {

			Range visibleRange = display.getVisibleRange();

			List<ZhongWenCharacter> zhongWenCharacters = dataProvider.getList();

			if (zhongWenCharacters.size() > visibleRange.getStart() + visibleRange.getLength()) {
				onRangeChangedSuper(display);
			} else {

				if (!hasData(visibleRange)) {
					onRangeChangedSuper(display);
					return;
				}

				final int lastRangeIndex = ((visibleRange.getStart() + visibleRange.getLength()) / CHAR_BY_FILE) + 1;

				loadData(display, lastRangeIndex);
			}
		}

		private void loadData(final HasData<ZhongWenCharacter> display, final int lastRangeIndex) {
			final int indexToLoad = lastLoadedIndex + 1;
			final String resource = "data/out-" + indexToLoad + ".json";
			LOGGER.info(resource);
			RequestBuilder rb = new RequestBuilder(RequestBuilder.GET, resource);

			rb.setCallback(new RequestCallback() {

				@Override
				public void onResponseReceived(Request request, Response response) {

					int code = response.getStatusCode();

					if (code < 200 && code >= 400) {
						LOGGER.log(Level.SEVERE, resource + " code http : " + code);
						return;
					}

					String jsonString = response.getText();

					JsArray<CardData> cardDatas = buildCardData(jsonString);

					List<ZhongWenCharacter> zhongWenCharacters = dataProvider.getList();

					for (int i = 0; i < cardDatas.length(); i++) {
						zhongWenCharacters.add(cardDatas.get(i));
					}
					onRangeChangedSuper(display);

					lastLoadedIndex = indexToLoad;

					if (lastLoadedIndex < lastRangeIndex) {
						loadData(display, lastRangeIndex);
					}
				}

				@Override
				public void onError(Request request, Throwable exception) {
					LOGGER.log(Level.SEVERE, exception.getMessage());
				}
			});

			try {
				rb.send();
			} catch (RequestException e) {
				LOGGER.log(Level.SEVERE, e.getMessage());
			}
		}

		private void onRangeChangedSuper(HasData<ZhongWenCharacter> display) {
			super.onRangeChanged(display);
		}
	};

	private boolean dataReady = false;

	private DataControler() {

	}

	public static DataControler get() {
		if (instance == null) {
			instance = new DataControler();
		}
		return instance;

	}

	private boolean hasData(Range visibleRange) {
		return visibleRange.getStart() + visibleRange.getLength() < LIMIT;
	}

	public static final native JsArray<CardData> buildCardData(String json) /*-{
																			return eval('(' + json + ')');
																			}-*/;

	public void addDataDisplay(HasData<ZhongWenCharacter> display) {
		dataProvider.addDataDisplay(display);
	}

	/**
	 * Refresh all displays.
	 */
	public void refreshDisplays() {
		dataProvider.refresh();
	}

	ZhongWenCharacter getCharaterByRank(int rank) {
		return dataProvider.getList().get(rank);
	}

}
