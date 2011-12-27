package com.plr.hanzi.client.supermemo;

import java.util.List;
import java.util.logging.Logger;

/**
 * 
 * Based on SM2 http://www.supermemo.com/english/ol/sm2.htm
 * 
 * @author Pier
 * 
 */
public class SuperMemo {

	public static final Logger logger = Logger.getLogger("SuperMemo");

	private final Revision revision;

	private final SuperMemoEngine engine = new SuperMemoEngine();

	private SuperMemo(String key) {
		revision = new Revision(key);
		revision.load();
	}

	public List<Record> getBatch() {

		// ask from revision
		List<Record> list = revision.getRecords();

		return list;
	}

	public void setResult(Record dataRecord, int grade) {
		engine.repetition(dataRecord, grade);
	}

	public static SuperMemo load(String key) {
		return new SuperMemo(key);
	}

	public void save() {
		revision.save();
	}

}
