package com.plr.flashcard.client.system;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

import com.plr.flashcard.client.ZhongWenCharacter;

public class LeitnerSystem {

	private Map<LEVEL, LinkedHashSet<Integer>> LeitnerLearningBoxes = new TreeMap<LEVEL, LinkedHashSet<Integer>>();

	private LinkedHashSet<Integer> buffer = new LinkedHashSet<Integer>();

	private int maxId = 0;

	public enum LEVEL {
		LEVEL_1(750), LEVEL_2(250), LEVEL_3(100), LEVEL_4(50);

		final int weight;
		int sumWeight;

		LEVEL(int weight) {
			this.weight = weight;
		}

		private static int sum = 0;
		static {
			for (LEVEL l : LEVEL.values()) {
				sum += l.weight;
				l.sumWeight = sum;
			}
		}

		static LEVEL getLevel(int value) {
			for (LEVEL l : LEVEL.values()) {
				if (value < l.sumWeight) {
					return l;
				}
			}

			return LEVEL_1;
		}

		static private Random rand = new Random();

		static LEVEL getLevelRand() {
			int value = rand.nextInt(LEVEL.sum);
			return getLevel(value);
		}
	}

	public LeitnerSystem() {
		for (LEVEL l : LEVEL.values()) {
			LeitnerLearningBoxes.put(l, new LinkedHashSet<Integer>());
		}
	}

	int newToday() {
		return 0;
	}

	int reviewToday() {
		return 0;
	}

	public void setNew(int newNb) {
		LinkedHashSet<Integer> learningBox = LeitnerLearningBoxes.get(LEVEL.LEVEL_1);

		for (int i = 0; i < newNb; i++) {
			learningBox.add(i + 1);
		}

	}

	public int totalSize() {
		int totalSize = 0;
		for (LinkedHashSet<Integer> learningBox : LeitnerLearningBoxes.values()) {
			totalSize += learningBox.size();
		}
		return totalSize;
	}

	public int getNextCard() {
		int zc = -1;

		LEVEL l = LEVEL.getLevelRand();

		out: for (int i = l.ordinal(); i >= 0; i--) {

			LinkedHashSet<Integer> learningBox = LeitnerLearningBoxes.get(LEVEL.values()[i]);

			Iterator<Integer> it = learningBox.iterator();
			while (it.hasNext()) {
				zc = it.next();
				it.remove();
				break out;
			}
		}

		if (zc != -1) {
			out: for (int i = l.ordinal(); i < LEVEL.values().length; i++) {

				LinkedHashSet<Integer> learningBox = LeitnerLearningBoxes.get(LEVEL.values()[i]);

				Iterator<Integer> it = learningBox.iterator();
				while (it.hasNext()) {
					zc = it.next();
					it.remove();
					break out;
				}
			}
		}

		if (zc != -1) {
			buffer.add(zc);
		}

		return zc;
	}

	public void answerCard(LEVEL level, ZhongWenCharacter zwchar) {
		buffer.remove(zwchar.getSimplifiedCharacter());
		LinkedHashSet<Integer> levelMap = LeitnerLearningBoxes.get(level);
		levelMap.add(zwchar.getId());

		maxId = Math.max(zwchar.getId(), maxId);
	}

}
