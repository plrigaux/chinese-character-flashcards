package com.plr.hanzi.client.supermemo;

import java.util.ArrayList;
import java.util.List;

public class RecordsImp implements Records {

	private List<Record> records = new ArrayList<>();
	
	
	@Override
	public List<Record> getRecords() {
		return records;
	}

	@Override
	public void setRecords( List<Record> records) {
		this.records = records;
	}

}
