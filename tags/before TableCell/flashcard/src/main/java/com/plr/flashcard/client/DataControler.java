package com.plr.flashcard.client;

import java.util.List;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.Window;
import com.google.gwt.view.client.HasData;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.Range;

public class DataControler {
	private static DataControler instance = null;

	/**
	 * The provider that holds the list of contacts in the database.
	 */
	private ListDataProvider<ZhongWenCharacter> dataProvider = new ListDataProvider<ZhongWenCharacter>() {
		@Override
		protected void onRangeChanged(HasData<ZhongWenCharacter> display) {

			Range visibleRange = display.getVisibleRange();

			List<ZhongWenCharacter> zhongWenCharacters = dataProvider.getList();

			if (zhongWenCharacters.size() > visibleRange.getStart() + visibleRange.getLength()) {
				super.onRangeChanged(display);
			} else {

				if (!hasData(visibleRange)) {
					super.onRangeChanged(display);
					return;
				}
				
				int lastRangeIndex = (visibleRange.getStart() + visibleRange.getLength() / 200) + 1;
				final String resource = "data/out-" + lastRangeIndex + ".json";

				RequestBuilder rb = new RequestBuilder(RequestBuilder.GET, resource);

				rb.setCallback(new RequestCallback() {

					@Override
					public void onResponseReceived(Request request, Response response) {

						int code = response.getStatusCode();

						if (code < 200 && code >= 400) {
							Window.alert(resource + " code http : " + code);
							return;
						}

						String jsonString = response.getText();

						JsArray<CardData> cardDatas = buildCardData(jsonString);

						List<ZhongWenCharacter> zhongWenCharacters = dataProvider.getList();

						for (int i = 0; i < cardDatas.length(); i++) {
							zhongWenCharacters.add(cardDatas.get(i));
						}

					}

					@Override
					public void onError(Request request, Throwable exception) {
						// TODO Auto-generated method stub

					}
				});

				try {
					rb.send();
				} catch (RequestException e) {
					e.printStackTrace();
				}
			}
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
		return visibleRange.getStart() + visibleRange.getLength() < 2600;
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


	
}