package com.plr.iso29110.localisation.maven.plugin;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HumanComparator implements Comparator<String> {

	final private static Pattern numberPattern = Pattern.compile("\\d+");

	@Override
	public int compare(String o1, String o2) {

		ArrayList<Object> l1 = makeList(o1);
		ArrayList<Object> l2 = makeList(o2);

		int val = 0;

		for (int i = 0; i < l1.size() && i < l2.size(); i++) {

			Object ob1 = l1.get(i);
			Object ob2 = l2.get(i);

			if (ob1 instanceof Integer && ob2 instanceof Integer) {

				Integer i1 = (Integer) ob1;
				Integer i2 = (Integer) ob2;
				val = i1.compareTo(i2);
			} else {

				String s1 = ob1.toString();
				String s2 = ob2.toString();

				val = s1.compareTo(s2);
			}

			if (val != 0) {
				return val;
			}
		}

		val = Integer.valueOf(l1.size()).compareTo(Integer.valueOf(l2.size()));

		return val;
	}

	private ArrayList<Object> makeList(String o1) {
		Matcher m = numberPattern.matcher(o1);
		ArrayList<Object> l = new ArrayList<>();
		int start = 0;
		while (m.find()) {

			l.add(o1.substring(start, m.start()));
			Integer i = Integer.parseInt(m.group());
			l.add(i);
			start = m.end();
		}

		String s = o1.substring(start);

		if (!s.isEmpty()) {
			l.add(s);
		}

		return l;
	}
}