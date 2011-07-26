package com.plr.flashcard.client.view.main;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.gwt.user.client.ui.Widget;
import com.plr.flashcard.client.view.MyCard;
import com.plr.flashcard.client.view.dictionnary.ZwCharBrowser;
import com.plr.flashcard.client.view.shishenme.ShiShenme;
import com.plr.flashcard.client.view.welcome.Welcome;

public class MainPanel extends Composite implements ValueChangeHandler<String> {

	private static final String FLASH = "flash";
	private static final String DICTIONNARY = "dictionnary";
	private static final String SHI_SHENME = "shiShenme";
	private static Binder uiBinder = GWT.create(Binder.class);
	@UiField
	MenuItem about;
	@UiField
	MenuItem help;
	@UiField
	HTMLPanel insidePanel;

	
	@UiField
	MenuItem flashcards;
	@UiField
	MenuItem guesser;
	@UiField
	MenuItem browser;
	@UiField
	MenuItem home;
	
	interface Binder extends UiBinder<Widget, MainPanel> {
	}

	public MainPanel() {
		initWidget(uiBinder.createAndBindUi(this));
		History.addValueChangeHandler(this);
		
		
		help.setCommand(new Command() {
			@Override
			public void execute() {
				Window.alert("help");
			}
		});

		about.setCommand(new Command() {
			@Override
			public void execute() {
				Window.alert("about");
			}
		});
		
		flashcards.setCommand(new Command() {
			@Override
			public void execute() {
				History.newItem(FLASH);
			}
		});
		
		guesser.setCommand(new Command() {
			@Override
			public void execute() {
				History.newItem(SHI_SHENME);
			}
		});
		
		browser.setCommand(new Command() {
			@Override
			public void execute() {
				History.newItem(DICTIONNARY);
			}
		});
		
		home.setCommand(new Command() {
			@Override
			public void execute() {
				History.newItem("");
			}
		});
		
		
		//When you reload, stay  on the same page
		String hash = Window.Location.getHash();
				
		History.newItem("");
		
		if (hash.startsWith("#")) {
			hash = hash.substring(1);
		}
		
		History.newItem(hash);
	}

	@Override
	public void onValueChange(ValueChangeEvent<String> event) {

		String value = event.getValue();

		if (FLASH.equals(value)) {
			insidePanel.clear();
			MyCard mc = new MyCard();
			insidePanel.add(mc);
		} else if (DICTIONNARY.equals(value)) {
			insidePanel.clear();
			ZwCharBrowser charDictionnary = new ZwCharBrowser();
			insidePanel.add(charDictionnary);
		} else if (SHI_SHENME.equals(value)) {
			insidePanel.clear();
			ShiShenme charDictionnary = new ShiShenme();
			insidePanel.add(charDictionnary);
		} else {
			insidePanel.clear();
			Welcome welcome = new Welcome();
			insidePanel.add(welcome);
		}

	}

}
