package com.plr.hanzi.client.supermemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.gwt.storage.client.Storage;
import com.plr.hanzi.client.style.AppResources;

public class Revision {
	public static final Logger logger = Logger.getLogger("SuperMemo");

	private final RecordSaver saver;

	private int recordsBatchNumber = 0;
	private int recordsBatchSize = 20;

	private List<RecordInfo> tempBatch = null;

	private PriorityQueue<RecordInfo> pQueue = new PriorityQueue<>(200, new Comparator<RecordInfo>() {
		@Override
		public int compare(RecordInfo o1, RecordInfo o2) {
			return o1.getOrder() - o2.getOrder();
			// System.out.println(v);
			// return v;

//			if (o1.getOrder() < o2.getOrder()) {
//				return -1;
//			} else if (o1.getOrder() > o2.getOrder()) {
//				return 1;
//			}
//			return 0;
		}
	});

	private TreeMap<Integer, RecordInfo> map = new TreeMap<Integer, RecordInfo>();

	private final String key;

	Revision(String key) {
		this.key = key;
		saver = SuperMemoFactory.getSuperMemoFactory().getRecordSaver();
	}

	public int getRecordsBatchSize() {
		return recordsBatchSize;
	}

	public void setRecordsBatchSize(int batchSize) {
		this.recordsBatchSize = batchSize;
	}

	public List<RecordInfo> getRecordsBatch() {

		if (tempBatch != null) {
			setBatch();
		}

		ArrayList<RecordInfo> list = new ArrayList<>(recordsBatchSize);

		int limit = Math.min(recordsBatchSize, pQueue.size());
		for (int i = 0; i < limit; i++) {
			RecordInfo record = pQueue.peek();

			if (record.getOrder() > recordsBatchNumber) {
				break;
			}

			pQueue.poll();
			list.add(record);
		}

		if (list.size() < recordsBatchSize) {

			int id = 1;
			if (!map.isEmpty()) {
				id = map.lastKey() + 1;
			}

			for (int i = list.size(); i < recordsBatchSize; i++) {

				RecordInfo record = new RecordInfo(id++);

				list.add(record);
			}
		}

		recordsBatchNumber++;
		tempBatch = new ArrayList<>(list);
		return list;
	}

	void setBatch() {
		if (tempBatch == null) {
			return;
		}

		for (RecordInfo recordInfo : tempBatch) {
			pQueue.add(recordInfo);
			map.put(recordInfo.getId(), recordInfo);
		}

		tempBatch = null;
	}

	void load() {
		Records records = loadFromStorage(key);

		if (records == null) {
			records = new RecordsImp();
		} else {
			recordsBatchSize = records.getBatchSize();
			recordsBatchNumber = records.getBatchNum();
		}

		pQueue.clear();
		map.clear();

		for (Record record : records.getRecords()) {
			RecordInfo recordInfo = new RecordInfo(record);
			pQueue.add(recordInfo);
			map.put(recordInfo.getId(), recordInfo);
		}
	}

	private Records loadFromStorage(String key) {
		Records recordMap = null;

		Storage stockStore = SuperMemoFactory.getSuperMemoFactory().getLocalStorageIfSupported();
		if (stockStore != null) {

			String saveString = stockStore.getItem(key);
			logger.log(Level.INFO, "saveString: " + saveString);

			if (saveString != null) {
				try {
					recordMap = saver.deserializeFromJson(saveString);

				} catch (Exception e) {
					logger.log(Level.ALL, e.getMessage());

					// some Auto bin error so clean
					stockStore.removeItem(key);
				}
			}
		} else {
			logger.log(Level.ALL, "Local storage not Suported");
		}
		return recordMap;
	}

	public void save() {

		setBatch();

		RecordsImp records = new RecordsImp();

		List<RecordInfo> recordInfoList = new ArrayList<>(map.values());

		List<Record> recordList = new ArrayList<>(recordInfoList.size());

		for (RecordInfo recordInfo : recordInfoList) {
			recordList.add(recordInfo.getRecord());
		}

		records.setRecords(recordList);

		records.setBatchSize(recordsBatchSize);

		records.setBatchNum(recordsBatchNumber);

		String saveString = saver.serializeToJson(records);

		AppResources.logger.log(Level.INFO, "saveString: " + saveString);

		Storage stockStore = SuperMemoFactory.getSuperMemoFactory().getLocalStorageIfSupported();
		if (stockStore != null) {
			stockStore.setItem(key, saveString);
		} else {
			AppResources.logger.log(Level.ALL, "Local storage not Suported");
		}

	}

	public static Revision load(String saverKey) {
		Revision r = new Revision(saverKey);
		r.load();
		return r;
	}

	public int getRecordsBatchNumber() {
		return recordsBatchNumber;
	}

	void setInterval(RecordInfo recordInfo, int interval) {

		int order = getRecordsBatchNumber() - 1 + interval;
		recordInfo.setOrder(order);
		recordInfo.setInterval(interval);
	}

	void setRecordsBatchNumber(int recordsBatchNumber) {
		this.recordsBatchNumber = recordsBatchNumber;
	}
}