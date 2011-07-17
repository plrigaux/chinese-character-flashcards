package com.plr.flashcard.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Application implements EntryPoint {
	
	 
	// final private static Logger logger =
	// Logger.getLogger(Application.class.getName());
	@Override
	public void onModuleLoad() {

		FlowPanel sp = new FlowPanel();
		sp.addStyleName("center");
		final VerticalPanel vp = new VerticalPanel();
		sp.add(vp);
		RootLayoutPanel rootPanel = RootLayoutPanel.get();
		//ScrollPanel sp = new ScrollPanel();
		
		final MyCard mc = new MyCard();
	
		sp.add(vp);
//		vp.add(new Label("Test"));
		vp.add(mc);
		rootPanel.add(sp);

		final String resource = "data/out-1.json";
		RequestBuilder rb = new RequestBuilder(RequestBuilder.GET,
				resource);

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
				
				mc.character.setText(cardDatas.get(9).getSimplifiedCharacter());
				
				mc.setCardData(cardDatas);
				
//mc.nameSpan.setInnerHTML(cardDatas.get(50).getSimplifiedCharacter());

//				JSONArray p = (JSONArray) JSONParser.parseLenient(jsonString);
//
//				for (int i = 0; i < p.size(); i++) {
//					JSONWrapper w = new JSONWrapper(p.get(i));
//
//					CardData cd = buildCustomer(w.toString());
//
//					Label l = new Label(cd.getSimplifiedCharacter());
//					l.addStyleName("chararter");
//					vp.add(l);
//
//					vp.add(new Label(""));
//					JsArray<Definition> jsArray = cd.getDefinitions();
//					FlexTable ft = new FlexTable();
//					int row = 0;
//					for (int j = 0; j < jsArray.length(); j++) {
//						Definition d = cd.getDefinitions().get(j);
//
//						Label lp = new Label(d.getPinyin());
//						lp.addStyleName("pinyin");
//
//						int tone = d.getTone();
//
//						String toneStyle;
//						switch (tone) {
//						case 1:
//							toneStyle = "tone1";
//							break;
//						case 2:
//							toneStyle = "tone2";
//							break;
//						case 3:
//							toneStyle = "tone3";
//							break;
//						case 4:
//							toneStyle = "tone4";
//							break;
//						default:
//							toneStyle = "tone5";
//
//						}
//
//						lp.addStyleName(toneStyle);
//
//						ft.setWidget(row, 0, lp);
//
//						for (int k = 0; k < d.getDefinition().length(); k++) {
//							ft.setText(row++, 1, d.getDefinition().get(k));
//						}
//
//					}
//
//					vp.add(ft);
//					vp.add(new Label(""));
//				}

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
	
	public static final native JsArray<CardData> buildCardData(String json) /*-{
	return eval('(' + json + ')');
}-*/;
}
