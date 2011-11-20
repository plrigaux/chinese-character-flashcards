package com.plr.hanzi.client.supermemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.logging.Level;

import com.google.gwt.storage.client.Storage;
import com.plr.hanzi.client.style.AppResources;

public class Revision {

	private RecordSaver saver = new RecordSaver();

	
	private PriorityQueue<Record> pQueue = new PriorityQueue<>(200, new Comparator<Record>() {

		@Override
		public int compare(Record o1, Record o2) {
			return o1.getInterval() - o2.getInterval();
		}
	});

	private TreeMap<Integer, Record> map = new TreeMap<Integer, Record>();

	public void getRecords(ArrayList<Record> list, int num) {

		int limit = Math.min(num, pQueue.size());
		for (int i = 0; i < limit; i++) {
			Record record = pQueue.remove();
			list.add(record);
		}

		if (limit < num) {

			int id = 1;
			if (!map.isEmpty()) {
				id = map.lastKey();
			}

			for (int i = limit; i < num; i++) {

				Record record = new RecordImp(id++);

				list.add(record);
			}
		}
	}

	public void load(String key) {
		Records records = loadFromStorage(key);

		if (records == null) {
			records = new RecordsImp();
		}

		pQueue.clear();
		map.clear();

		for (Record record : records.getRecords()) {
			pQueue.add(record);
			map.put(record.getId(), record);
		}

	}

	private Records loadFromStorage(String key) {
		Records recordMap = null;

		Storage stockStore = Storage.getLocalStorageIfSupported();
		if (stockStore != null) {

			String saveString = stockStore.getItem(key);
			SuperMemo.logger.log(Level.INFO, "saveString: " + saveString);

			if (saveString != null) {
				try {
					recordMap = saver.deserializeFromJson(saveString);

				} catch (Exception e) {
					SuperMemo.logger.log(Level.ALL, e.getMessage());
					
					// some Auto bin error so clean
					stockStore.removeItem(key);
				}
			}
		} else {
			SuperMemo.logger.log(Level.ALL, "Local storage not Suported");
		}
		return recordMap;
	}

	public void save(String key) {
		

		RecordsImp records = new RecordsImp();
		
		List<Record> recordList = new ArrayList<>(map.values());
		
		records.setRecords(recordList);
				
		String saveString = saver.serializeToJson(records);

		AppResources.logger.log(Level.INFO, "saveString: " + saveString);

		Storage stockStore = Storage.getLocalStorageIfSupported();
		if (stockStore != null) {
			stockStore.setItem(key, saveString);
		} else {
			AppResources.logger.log(Level.ALL, "Local storage not Suported");
		}

	}
}
