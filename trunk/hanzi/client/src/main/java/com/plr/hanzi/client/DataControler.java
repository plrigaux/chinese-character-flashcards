package com.plr.hanzi.client;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
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

	private Set<String> resources = new HashSet<String>();
	/**
	 * The provider that holds the list of contacts in the database.
	 */
	private ListDataProvider<ZhongWenCharacter> dataProvider = new ListDataProvider<ZhongWenCharacter>() {
		@Override
		protected void onRangeChanged(final HasData<ZhongWenCharacter> display) {

			Range visibleRange = display.getVisibleRange();

			// System.out.println("visibleRange " + visibleRange);
			List<ZhongWenCharacter> zhongWenCharacters = dataProvider.getList();

			// System.out.println("zhongWenCharacters.size() " +
			// zhongWenCharacters.size());
			// System.out.println("visibleRange.getStart() + visibleRange.getLength() "
			// + visibleRange.getStart() + visibleRange.getLength());

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

				final int lastRangeIndex = ((visibleRange.getStart() + visibleRange.getLength()) / CHAR_BY_FILE) + 1;

				// System.out.println("lastRangeIndex " + lastRangeIndex);

				// System.out.println("call loadData form change" );
				loadData(display, lastRangeIndex);
			}
		}

		private void loadData(final HasData<ZhongWenCharacter> display, final int lastRangeIndex) {
			final int indexToLoad = lastLoadedIndex + 1;
			final String resource = "data/chineseChar-" + indexToLoad + ".json";
			// System.out.println(resource);

			LOGGER.info(resource);
			RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, resource);

			requestBuilder.setCallback(new RequestCallback() {

				@Override
				public void onResponseReceived(Request request, Response response) {

					int code = response.getStatusCode();

					System.out.println("code " + code);
					if (code < 200 && code >= 400) {
						LOGGER.log(Level.SEVERE, resource + " code http : " + code);
						return;
					}
					
					// System.out.println("jsonString " + jsonString);

					// Load only one time the resource
					if (resources.add(resource)) {
						// System.out.println("Already loaded " + resource + " "
						// + resources);
						String jsonString = response.getText();
						
						JsArray<CardData> cardDatas = buildCardData(jsonString);

						List<ZhongWenCharacter> zhongWenCharacters = dataProvider.getList();

						for (int i = 0; i < cardDatas.length(); i++) {

							zhongWenCharacters.add(cardDatas.get(i));
						}
						
						lastLoadedIndex = indexToLoad;
					}

					// System.out.println(" " + resource + " "
					// +zhongWenCharacters.size());
					//
					// System.out.println("lastLoadedIndex " + lastLoadedIndex);
					// System.out.println("indexToLoad " + indexToLoad);
					// System.out.println("lastRangeIndex " + lastRangeIndex);
				

					//We going to get the next range
					if (indexToLoad < lastRangeIndex) {
						// System.out.println("call loadData form load" );
						loadData(display, lastRangeIndex);
					} else {
						onRangeChangedSuper(display);
					}
				}

				@Override
				public void onError(Request request, Throwable exception) {
					LOGGER.log(Level.SEVERE, exception.getMessage());
				}
			});

			try {

				System.out.println("URL " + requestBuilder.getUrl());
				requestBuilder.send();
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
