package com.plr.hanzi.client.supermemo;

public class DataRecord implements DataRcordInterface {
	private int repetition;
	private int interval;
	private double ef;

	public DataRecord(int repetition, int interval, double ef) {
		this.repetition = repetition;
		this.interval = interval;
		this.ef = ef;
	}

	@Override
	public int getRepetition() {
		return repetition;
	}

	@Override
	public int getInterval() {
		return interval;
	}

	@Override
	public double getEf() {
		return ef;
	}

}