package com.plr.flashcard.client;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.Window;

public class DataControler {
	private JsArray<CardData> cardDatas = null;
	int index = 0;

	public DataControler() {
		final String resource = "data/out-1.json";
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

				cardDatas = buildCardData(jsonString);

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

	public static final native JsArray<CardData> buildCardData(String json) /*-{
																			return eval('(' + json + ')');
																			}-*/;

	public CardData next() {
		index = index <= (cardDatas.length() - 2) ? index + 1 : cardDatas.length() - 1;
		return cardDatas.get(index);
	}

	public CardData previous() {
		index = index <= 0 ? 0 : index - 1;
		return cardDatas.get(index);
	}

	public CardData current() {

		return cardDatas.get(index);
	}
}
