package com.plr.flashcard.client.view.main;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasAlignment;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.plr.flashcard.client.view.dictionnary.ZwCharBrowser;
import com.plr.flashcard.client.view.flashcard.FlashCardSystem;
import com.plr.flashcard.client.view.shishenme.ShiShenmeSystem;
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
				alertWidget("Help", "Help").center();
			}
		});

		about.setCommand(new Command() {
			@Override
			public void execute() {
	
				alertWidget("About", "About").center();
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
			FlashCardSystem mc = new FlashCardSystem();
			insidePanel.add(mc);
		} else if (DICTIONNARY.equals(value)) {
			insidePanel.clear();
			ZwCharBrowser charDictionnary = new ZwCharBrowser();
			insidePanel.add(charDictionnary);
		} else if (SHI_SHENME.equals(value)) {
			insidePanel.clear();
			ShiShenmeSystem charDictionnary = new ShiShenmeSystem();
			insidePanel.add(charDictionnary);
		} else {
			insidePanel.clear();
			Welcome welcome = new Welcome();
			insidePanel.add(welcome);
		}

	}
	public static DialogBox alertWidget(final String header, final String content) {
        final DialogBox box = new DialogBox();
        final VerticalPanel panel = new VerticalPanel();
        box.setText(header);
        panel.add(new Label(content));
        final Button buttonClose = new Button("Close",new ClickHandler() {
            @Override
            public void onClick(final ClickEvent event) {
                box.hide();
            }
        });
        // few empty labels to make widget larger
        final Label emptyLabel = new Label("");
        emptyLabel.setSize("auto","25px");
        panel.add(emptyLabel);
        panel.add(emptyLabel);
        buttonClose.setWidth("90px");
        panel.add(buttonClose);
        panel.setCellHorizontalAlignment(buttonClose, HasAlignment.ALIGN_RIGHT);
        box.add(panel);
        box.setGlassEnabled(true);
        return box;
    }
}
