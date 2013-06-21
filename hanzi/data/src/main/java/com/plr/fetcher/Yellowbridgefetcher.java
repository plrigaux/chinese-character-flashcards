package com.plr.fetcher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.CookiePolicy;
import java.net.HttpCookie;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.IOUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;

public class Yellowbridgefetcher {

	static {
		System.setProperty("http.agent", "");
	}

	Map<String, String> cookies = new HashMap<>();

	static Joiner.MapJoiner j = Joiner.on(';').withKeyValueSeparator("=");

	public Yellowbridgefetcher() {

		this(
				"__utmz=152973489.1369578078.1.1.utmccn=(direct)|utmcsr=(direct)|utmcmd=(none); __qca=P0-230016418-1369578078023; __atuvc=2%7C22; PHPSESSID=8qfnpi2d27eba4cmdgnrcqf5m3; maxWordLength=6; __utma=152973489.194228962.1369578078.1371471002.1371476736.13; __utmc=152973489; characterMode=s; dialect=M; crumb=1; PGSHIT=22; __utmb=152973489");
	}

	public Yellowbridgefetcher(String cookiesStr) {

		fillmap(cookies, cookiesStr);
	}

	private static Pattern p = Pattern.compile("HSK=(\\d)");

	public static void main(String[] args) {
		// "http://www.yellowbridge.com/chinese/wordsearch.php?searchMode=C&word=土豆"

		// String word = "土豆";
		String word = "苹果";

		try {

			Yellowbridgefetcher ybf = new Yellowbridgefetcher();
			ybf.getDataFromYB(word);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<YBDefinition> getDataFromYB(String word) throws Exception {

		List<YBDefinition> list = new ArrayList<>();

		String stringFromInputStream;

		stringFromInputStream = getYBData(word);
		getMaindata(stringFromInputStream, word, list, false);

		return list;
	}

	private String getYBData(String word) throws Exception {

		String strUrl = "http://www.yellowbridge.com/chinese/wordsearch.php?searchMode=C&word="
				+ URLEncoder.encode(word, "UTF-8");

		return getData(strUrl);
	}

	private String getData(String strUrl) throws IOException {
		System.out.println(strUrl);

		URL url = new URL(strUrl);
		String stringFromInputStream;
		HttpURLConnection con = (HttpURLConnection) url.openConnection();

		con.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
		// con.setRequestProperty("User-Agent",
		// "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");

		con.setRequestProperty("User-Agent",
				"User-Agent:Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/27.0.1453.110 Safari/537.36");
		con.setUseCaches(false);

		// String myCookie =
		// "__utmz=152973489.1369578078.1.1.utmccn=(direct)|utmcsr=(direct)|utmcmd=(none); __qca=P0-230016418-1369578078023; __atuvc=2%7C22; PHPSESSID=8qfnpi2d27eba4cmdgnrcqf5m3; maxWordLength=6; __utma=152973489.194228962.1369578078.1371471002.1371476736.13; __utmc=152973489; characterMode=s; dialect=M; crumb=1; PGSHIT=22; __utmb=152973489";

		String cookiesStr = j.join(cookies);
		con.setRequestProperty("Cookie", cookiesStr);
		int code = con.getResponseCode();
		System.out.println(code);
		String encoding = con.getContentEncoding();
		// System.out.println(encoding);

		con.connect();

		String headerName = null;
		for (int i = 1; (headerName = con.getHeaderFieldKey(i)) != null; i++) {
			if (headerName.equals("Set-Cookie")) {
				String cc = con.getHeaderField(i);
				
				fillmap(cookies, cc);
			}
		}

		try (InputStream in = con.getInputStream(); BufferedReader reader = new BufferedReader(new InputStreamReader(in));) {

			stringFromInputStream = IOUtils.toString(in, "UTF-8");

			// System.out.println(stringFromInputStream);
		}

		return stringFromInputStream;
	}

	private void getMaindata(String stringFromInputStream, String word, List<YBDefinition> list, boolean isMulti) throws IOException {
		Document doc = Jsoup.parse(stringFromInputStream, "");

		Elements es = doc.select("#mainData");

		if (!es.isEmpty()) {
			Element e = es.first();

			extract(e, word, list);
		} else {
			es = doc.select("#multiRow");
			// System.out.println(es.html());
			if (!es.isEmpty()) {
				
				if (isMulti) {
					System.err.println("Multi again");
					return;
				}
				
				Elements tds = es.select("td.nowrap");
				
				for (Element td : tds) {
					Elements as = td.select("a");
					
					for (Element link : as) {
						String linkHref = link.attr("href");
						System.out.println(linkHref);
						stringFromInputStream = getData("http://www.yellowbridge.com/" + linkHref);
						
						try {
							int delay = 4000;
							System.err.println("Sleep -- " + delay);
							Thread.sleep(delay);
						} catch (InterruptedException ex) {
							Thread.currentThread().interrupt();
						}
						getMaindata(stringFromInputStream, word, list, true);
					}
				}
				
				
			} else {
				System.err.println("Error ! " + word);
				System.exit(0);
			}
		}
	}

	void extract(Element e, String word, List<YBDefinition> list) {
		String mainData = e.html();

		// System.out.println(e.html());

		YBDefinition yd = new YBDefinition(word);
		list.add(yd);

		
		Element pye =  e.select("span.pinyin").first();
		
		yd.pinyin = pye != null ? pye.text() : null;

		yd.partsOfSpeech = extractElement(e, "Parts of Speech", true);
		yd.traditional = extractElement(e, "Traditional Characters", true);
		yd.definition = extractElement(e, "Definition", true);
		yd.synonyms = extractElement(e, "Synonyms", true);
		yd.seeAlso = extractElement(e, "See also", false);
		yd.measureWords = extractElement(e, "Measure Words", true);

		Matcher m = p.matcher(mainData);
		if (m.find()) {
			yd.HSK = Integer.valueOf(m.group(1));
		}

		System.out.println(yd);

	}

	String extractElement(Element e, String contain, boolean text) {
		String s = null;

		Elements es = e.select(":containsOwn(" + contain + ")");

		for  (Element ee : es) {
			
			// System.out.println(ee);
			Element next = ee.nextElementSibling();
			
			if (next == null) {
				continue;
			}
			// System.out.println(ee);
			if (text) {
				s = next.text();
			} else {
				s = next.html();
			}
			break;
		}

		return s;
	}

	static Splitter splitparam = Splitter.on(';').omitEmptyStrings().trimResults();
	static Splitter splitkeyval = Splitter.on('=').limit(2).trimResults();

	static void fillmap(Map<String, String> map, String c) {
		for (String s : splitparam.split(c)) {

			Iterator<String> it = splitkeyval.split(s).iterator();

			String key = null;
			String value = null;

			if (it.hasNext()) {
				key = it.next();
			}

			if (it.hasNext()) {
				value = it.next();
			}

			if (key != null && value != null) {
				map.put(key, value);
			}
		}
	}

}
