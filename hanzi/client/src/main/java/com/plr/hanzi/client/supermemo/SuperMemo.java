package com.plr.hanzi.client.supermemo;

/**
 * 
 * Based on SM2 http://www.supermemo.com/english/ol/sm2.htm
 * 
 * @author Pier
 * 
 */
public class SuperMemo {

	private final int GRADE_RANK;
	private final double EF_LIMIT;
	private final int INTERVAL1;
	private final int INTERVAL2;
	private final int MIN_GRADE;

	public SuperMemo() {
		this(5, 1.3, 1, 6, 3);
	}

	public SuperMemo(int gradeRank, double efLimit, int interval1, int interval2, int minGrade) {
		GRADE_RANK = gradeRank;
		EF_LIMIT = efLimit;
		INTERVAL1 = interval1;
		INTERVAL2 = interval2;
		MIN_GRADE = minGrade;
	}

	public void repetition(int id, int grade) {
		DataRecord dataRecord = getDataRecord(id);
		repetition(dataRecord, grade);
	}

	public void repetition(DataRecord dataRecord, int grade) {

		int repetition = dataRecord.getRepetition();
		int interval = dataRecord.getInterval();
		double ef = dataRecord.getEf();

		// If the quality response was lower than MIN_GRADE then start
		// repetitions for
		// the item from the beginning without changing the E-Factor (i.e. use
		// intervals I(1), I(2) etc. as if the item was memorized anew).
		if (grade < MIN_GRADE) {
			if (repetition == 0) {
				interval = INTERVAL1;
			} else if (repetition == 1) {
				interval = INTERVAL2;
			} else {
				interval = (int) Math.round(interval * ef);
			}

			repetition = repetition + 1;
		} else {
			interval = 1;
			repetition = 0;
		}

		ef = newEf(grade, ef);

		if (ef < EF_LIMIT) {
			ef = EF_LIMIT;
		}

	}

	double newEf(int grade, double ef) {
		ef = ef + grade(GRADE_RANK, grade);
		return ef;
	}

	double grade(double grade, double GR) {
		return 0.1 - (GR - grade) * (0.08 + (GR - grade) * 0.02);
	}

	public static double round(double val, int Rpl) {
		double p = Math.pow(10, Rpl);
		val = val * p;
		double tmp = Math.round(val);
		return tmp / p;
	}

	private DataRecord getDataRecord(int id) {

		DataRecord dataRecord = new DataRecord(0, 0, 2.5);

		return dataRecord;
	}

}
