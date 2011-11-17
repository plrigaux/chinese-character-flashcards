package com.plr.flashcard.client.i18n;

/**
 * Interface to represent the messages contained in resource bundle:
 * 	C:/GWT/workspace/flashcard/src/main/java/com/plr/flashcard/client/i18n/HanziMessages.properties'.
 */
public interface HanziMessages extends com.google.gwt.i18n.client.Messages {
  
  /**
   * Translated "About".
   * 
   * @return translated "About"
   */
  @DefaultMessage("About")
  @Key("welcome_button_about")
  String welcome_button_about();

  /**
   * Translated "Browser".
   * 
   * @return translated "Browser"
   */
  @DefaultMessage("Browser")
  @Key("welcome_button_charBrowser")
  String welcome_button_charBrowser();

  /**
   * Translated "Flashcards".
   * 
   * @return translated "Flashcards"
   */
  @DefaultMessage("Flashcards")
  @Key("welcome_button_flashcards")
  String welcome_button_flashcards();

  /**
   * Translated "Guess".
   * 
   * @return translated "Guess"
   */
  @DefaultMessage("Guess")
  @Key("welcome_button_shishenme")
  String welcome_button_shishenme();
}
