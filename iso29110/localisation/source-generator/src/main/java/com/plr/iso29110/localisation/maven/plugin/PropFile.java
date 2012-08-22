package com.plr.iso29110.localisation.maven.plugin;

import java.util.Properties;

class PropFile implements Comparable<PropFile> {

	final private String name;
	final private String lang;
	final private String country;
	final private Properties properties;

	public PropFile(String name, String lang, String country, Properties properties) {
		super();
		this.name = name;
		this.lang = lang;
		this.country = country;
		this.properties = properties;		
	}

	@Override
	public int compareTo(PropFile o) {

		int val = this.name.compareTo(o.name);

		if (val != 0) {
			return val;
		}

		if (lang == null) {
			if (o.lang != null) {
				return -1;
			}
			return 0;
		}
		if (o.lang == null) {
			return 1;
		}
		val = this.lang.compareTo(o.lang);
		if (val != 0) {
			return val;
		}

		if (country == null) {
			if (o.country != null) {
				return -1;
			}
			return 0;
		}
		if (o.country == null) {
			return 1;
		}

		return this.country.compareTo(o.country);
	}

	public String getName() {
		return name;
	}

	public String getLang() {
		return lang;
	}

	public String getCountry() {
		return country;
	}

	public Properties getProperties() {
		return properties;
	}

	@Override
	public String toString() {
		return "PropFile [name=" + name + ", lang=" + lang + ", country=" + country + "]";
	}

}