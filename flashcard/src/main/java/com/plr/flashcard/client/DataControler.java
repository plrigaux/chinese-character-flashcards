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

public class DataControler {
	private static DataControler instance = null;
	private int index = 0;

	/**
	 * The provider that holds the list of contacts in the database.
	 */
	private ListDataProvider<ZhongWenCharacter> dataProvider = new ListDataProvider<ZhongWenCharacter>();
	
	private DataControler() {
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

				JsArray<CardData> cardDatas = buildCardData(jsonString);

				List<ZhongWenCharacter> zhongWenCharacters = dataProvider.getList();
				
				for(int i = 0; i < cardDatas.length(); i++) {
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
	
	public static DataControler get() {
		if (instance  == null) {
			instance = new DataControler();
		}
		return instance;
		
		
		
	}


	public static final native JsArray<CardData> buildCardData(String json) /*-{
																			return eval('(' + json + ')');
																			}-*/;

	public ZhongWenCharacter next() {
		index = index <= (dataProvider.getList().size() - 2) ? index + 1 : dataProvider.getList().size() - 1;
		return dataProvider.getList().get(index);
	}

	public ZhongWenCharacter previous() {
		index = index <= 0 ? 0 : index - 1;
		return  dataProvider.getList().get(index);
	}

	public ZhongWenCharacter current() {
		return dataProvider.getList().get(index);
	}

	public void generateContacts(int i) {
		// TODO Auto-generated method stub
		
	}

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
