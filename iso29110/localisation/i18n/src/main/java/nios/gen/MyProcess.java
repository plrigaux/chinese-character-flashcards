package nios.gen;

import java.util.Locale;

public class MyProcess {
final public static String BASENAME = "MyProcess";
static public String iam(Locale webUserLocale) {
	return _BaseLocalTool.getValue(BASENAME, webUserLocale, "iam");
}

static public String processName(Locale webUserLocale) {
	return _BaseLocalTool.getValue(BASENAME, webUserLocale, "processName");
}

static public String submit(Locale webUserLocale) {
	return _BaseLocalTool.getValue(BASENAME, webUserLocale, "submit");
}

}
