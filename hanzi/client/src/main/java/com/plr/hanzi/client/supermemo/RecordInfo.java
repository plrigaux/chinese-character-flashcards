package com.plr.hanzi.client.supermemo;

public class RecordInfo {
	final Record record;

	RecordInfo(Record record) {
		this.record = record;
	}

	RecordInfo(int id) {
		this.record = new RecordImp(id);
	}

	/**
	 * Because the rank start at 1 and index start at 0
	 * 
	 * @return index of charater
	 */

	public int getCharIndex() {
		return getId() - 1;
	}

	public int getRepetition() {
		return record.getRepetition();
	}

	public int getInterval() {
		return record.getInterval();
	}

	public double getEf() {
		return record.getEf();
	}

	public int getId() {
		return record.getId();
	}

	void setRepetition(int repetition) {
		record.setRepetition(repetition);
	}

	void setInterval(int interval) {
		record.setInterval(interval);
	}

	void setEf(double ef) {
		record.setEf(ef);
	}

	public int getOrder() {
		return record.getOrder();
	}

	public void setOrder(int order) {
		record.setOrder(order);
	}

	@Override
	public String toString() {
		return "id:" + getId() + " r:" + getRepetition() + " o:" + getOrder() + " i:" + getInterval() + " ef:" + getEf();
	}

	Record getRecord() {
		return record;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		RecordInfo other = (RecordInfo) obj;
//
//		if (record.getId() != other.record.getId())
//			return false;
//		return true;
//	}

}
