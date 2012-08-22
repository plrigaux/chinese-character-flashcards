package nios.gen;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class _BaseLocalTool {

	static public ResourceBundle getRessource(String baseName) {
		Locale loc = Locale.getDefault();
		return getRessource(baseName, loc);
	}

	static public ResourceBundle getRessource(String baseName, String languageTag) {
		Locale loc = Locale.forLanguageTag(languageTag);
		return getRessource(baseName, loc);
	}

	static public ResourceBundle getRessource(String baseName, Locale locale) {
		ResourceBundle rb = ResourceBundle.getBundle(baseName, locale);
		return rb;
	}

	static public String getValue(String baseName, String key) {
		return getRessource(baseName).getString(key);
	}

	static public String getValue(String baseName, Locale locale, String key) {
		return getRessource(baseName, locale).getString(key);
	}

	static public String getMessageFormat(String baseName, Locale locale, String key,
			Object... arguments) {
		String pattern = getValue(baseName, locale, key);

		return MessageFormat.format(pattern, arguments);
	}
	
	static public String getFormater(String baseName, Locale locale, String key,
			Object... arguments) {
		String format = getValue(baseName, locale, key);
			
		return String.format(locale, format, arguments);
	}
}
