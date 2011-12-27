package com.plr.hanzi.client.supermemo;

/**
 * @author Pier
 *
 */
public interface Record {
	public int getRepetition();

	public int getInterval();

	public double getEf();

	public int getId();

	public void setEf(double ef);

	public void setInterval(int interval);

	public void setRepetition(int repetition);

	
	/**
	 * Because the rank start at 1 and index start at 0
	 * @return index of charater
	 */
	public int getCharIndex();
}