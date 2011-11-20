package com.plr.hanzi.client.supermemo;

public class RecordImp implements Record {
	private final int id;
	private int repetition;
	private int interval;
	private double ef;

	public RecordImp(int id) {
		this.repetition = 0;
		this.interval = 0;
		this.ef = 2.5;
		this.id = id;
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

	@Override
	public int getId() {		
		return id;
	}

	@Override
	public void setRepetition(int repetition) {
		this.repetition = repetition;
	}

	@Override
	public void setInterval(int interval) {
		this.interval = interval;
	}

	@Override
	public void setEf(double ef) {
		this.ef = ef;
	}

}