package com.plr.hanzi.client.supermemo;

public interface Record {
	public int getRepetition();

	public int getInterval();

	public double getEf();

	public int getId();

	public void setEf(double ef);

	public void setInterval(int interval);

	public void setRepetition(int repetition);
}