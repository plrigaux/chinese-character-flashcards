package com.plr.fetcher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.IOUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Yellowbridgefetcher {

	static {
		System.setProperty("http.agent", "");
	}

	static Pattern p = Pattern.compile("HSK=(\\d)");

	public static void main(String[] args) {
		// "http://www.yellowbridge.com/chinese/wordsearch.php?searchMode=C&word=土豆"

		String word = "土豆";
		// String word = "得";

		try {
			getDataFromYB(word);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	 static List<YBDefinition> getDataFromYB(String word) throws Exception {

		List<YBDefinition> list = new ArrayList<>();

		String stringFromInputStream;

		stringFromInputStream = getYBData(word);
		getMaindata(stringFromInputStream, word, list);

		return list;
	}

	private static String getYBData(String word) throws Exception {

		String strUrl = "http://www.yellowbridge.com/chinese/wordsearch.php?searchMode=C&word="
				+ URLEncoder.encode(word, "UTF-8");

		return getData(strUrl);
	}

	private static String getData(String strUrl) throws IOException {
		System.out.println(strUrl);
		
		URL url = new URL(strUrl);
		String stringFromInputStream;
		HttpURLConnection con = (HttpURLConnection) url.openConnection();

		con.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
//		con.setRequestProperty("User-Agent",
//				"Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
		
		con.setRequestProperty("User-Agent","User-Agent:Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/27.0.1453.110 Safari/537.36");
		con.setUseCaches(false);
		
        String myCookie = "__utmz=152973489.1369578078.1.1.utmccn=(direct)|utmcsr=(direct)|utmcmd=(none); __qca=P0-230016418-1369578078023; __atuvc=2%7C22; PHPSESSID=8qfnpi2d27eba4cmdgnrcqf5m3; maxWordLength=6; __utma=152973489.194228962.1369578078.1371471002.1371476736.13; __utmc=152973489; characterMode=s; dialect=M; crumb=1; PGSHIT=22; __utmb=152973489";
        con.setRequestProperty("Cookie", myCookie);
		int code = con.getResponseCode();
		System.out.println(code);
		String encoding = con.getContentEncoding();
//		System.out.println(encoding);

		try (InputStream in = con.getInputStream(); BufferedReader reader = new BufferedReader(new InputStreamReader(in));) {

			stringFromInputStream = IOUtils.toString(in, "UTF-8");

			// System.out.println(stringFromInputStream);
		}

		return stringFromInputStream;
	}

	private static void getMaindata(String stringFromInputStream, String word, List<YBDefinition> list) throws IOException {
		Document doc = Jsoup.parse(stringFromInputStream, "");

		Elements es = doc.select("#mainData");

		if (!es.isEmpty()) {
			Element e = es.first();

			extract(e, word, list);
		} else {
			es = doc.select("#multiRow");
//			System.out.println(es.html());
			if (!es.isEmpty()) {

				es = es.select("a");

				for (Element link : es) {
					String linkHref = link.attr("href");
					System.out.println(linkHref);
					stringFromInputStream = getData("http://www.yellowbridge.com/" + linkHref);
					getMaindata(stringFromInputStream, word, list);
				}
			} else {
				System.err.println("Error ! " + word);
				System.exit(0);
			}
		}
	}

	static void extract(Element e, String word, List<YBDefinition> list) {
		String mainData = e.html();

		// System.out.println(e.html());

		YBDefinition yd = new YBDefinition(word);
		list.add(yd);
		
		yd.pinyin = e.select(".pinyin").first().text();

		yd.partsOfSpeech = extractElement(e, "Parts of Speech", true);
		yd.traditional = extractElement(e, "Traditional Characters", true);
		yd.definition = extractElement(e, "Definition", true);
		yd.synonyms = extractElement(e, "Synonyms", true);
		yd.seeAlso = extractElement(e, "See also", false);

		Matcher m = p.matcher(mainData);
		if (m.find()) {
			yd.HSK = Integer.valueOf(m.group(1));
		}

		System.out.println(yd);

	}

	static String extractElement(Element e, String contain, boolean text) {
		String s = null;

		Elements es = e.select(":containsOwn(" + contain + ")");

		if (!es.isEmpty()) {
			Element ee = es.first();
//			System.out.println(ee);
			ee = ee.nextElementSibling();
//			System.out.println(ee);
			if (text) {
				s = ee.text();
			} else {
				s = ee.html();
			}
		}

		return s;
	}
}
