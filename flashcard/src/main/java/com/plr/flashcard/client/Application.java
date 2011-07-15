package com.plr.flashcard.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONParser;
import com.google.gwt.regexp.shared.RegExp;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.plr.flashcard.client.CardData.Definition;
import com.plr.flashcard.client.tools.JSONWrapper;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Application implements EntryPoint {

	// final private static Logger logger =
	// Logger.getLogger(Application.class.getName());
	@Override
	public void onModuleLoad() {

		final VerticalPanel vp = new VerticalPanel();
		RootLayoutPanel rootPanel = RootLayoutPanel.get();
		ScrollPanel sp = new ScrollPanel();
		sp.add(vp);
		rootPanel.add(sp);

		RequestBuilder rb = new RequestBuilder(RequestBuilder.GET, "out.json");

		rb.setCallback(new RequestCallback() {

			@Override
			public void onResponseReceived(Request request, Response response) {

				String jsonString = response.getText();

				JSONArray p = (JSONArray) JSONParser.parseLenient(jsonString);

				for (int i = 0; i < p.size() && i < 10; i++) {
					JSONWrapper w = new JSONWrapper(p.get(i));

					CardData cd = buildCustomer(w.toString());

					Label l = new Label(cd.getSimplifiedCharacter());
					l.addStyleName("chararter");
					vp.add(l);

					vp.add(new Label(""));
					JsArray<Definition> jsArray = cd.getDefinitions();
					FlexTable ft = new FlexTable();
					int row = 0;
					for (int j = 0; j < jsArray.length(); j++) {
						Definition d = cd.getDefinitions().get(j);
						
						Label lp = new Label(d.getPinyin());
						lp.addStyleName("pinyin");
						ft.setWidget(row, 0, lp);
						
						
						for (int k = 0; k < d.getDefinition().length(); k++) {
							ft.setText(row++, 1, d.getDefinition().get(k));
						}
						
					}
					
					vp.add(ft);
					vp.add(new Label(""));
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static final native CardData buildCustomer(String json) /*-{
		return eval('(' + json + ')');
	}-*/;
}
