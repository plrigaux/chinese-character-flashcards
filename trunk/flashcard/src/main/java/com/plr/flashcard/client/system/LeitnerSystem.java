package com.plr.flashcard.client.system;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.logging.Level;

import com.google.gwt.storage.client.Storage;
import com.plr.flashcard.client.AppResources;
import com.plr.flashcard.client.ZhongWenCharacter;

public class LeitnerSystem {

	private static final String CHINESE_FLASHCARD_LEITNER = "chinese.flashcard.leitner";

	private Map<LEVEL, LinkedHashSet<Integer>> leitnerLearningBoxes = new TreeMap<LEVEL, LinkedHashSet<Integer>>();

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

	private LeitnerSystem() {
		for (LEVEL l : LEVEL.values()) {
			leitnerLearningBoxes.put(l, new LinkedHashSet<Integer>());
		}
	}

	private LeitnerSystem(Map<Double, List<Integer>> map) {
		this();

		if (map != null) {
			for (Map.Entry<Double, List<Integer>> en : map.entrySet()) {

				double kl = en.getKey();
				LEVEL l = LEVEL.values()[(int)kl];

				LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
				set.addAll(en.getValue());

				leitnerLearningBoxes.put(l, set);
			}
		}

	}

	int newToday() {
		return 0;
	}

	int reviewToday() {
		return 0;
	}

	public void setNew(int newNb) {
		LinkedHashSet<Integer> learningBox = leitnerLearningBoxes.get(LEVEL.LEVEL_1);

		int limit = newNb + maxId;
		for (int i = maxId; i < limit; i++) {
			learningBox.add(i + 1);

			maxId = Math.max(i + 1, maxId);
		}

	}

	public int totalSize() {
		int totalSize = 0;
		for (LinkedHashSet<Integer> learningBox : leitnerLearningBoxes.values()) {
			totalSize += learningBox.size();
		}
		return totalSize;
	}

	public int getNextCard() {
		int zc = -1;

		LEVEL l = LEVEL.getLevelRand();

		out: for (int i = l.ordinal(); i >= 0; i--) {

			LinkedHashSet<Integer> learningBox = leitnerLearningBoxes.get(LEVEL.values()[i]);

			Iterator<Integer> it = learningBox.iterator();
			while (it.hasNext()) {
				zc = it.next();
				it.remove();
				break out;
			}
		}

		// Not found
		if (zc == -1) {
			out: for (int i = l.ordinal(); i < LEVEL.values().length; i++) {

				LinkedHashSet<Integer> learningBox = leitnerLearningBoxes.get(LEVEL.values()[i]);

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
		LinkedHashSet<Integer> levelMap = leitnerLearningBoxes.get(level);
		levelMap.add(zwchar.getId());

		maxId = Math.max(zwchar.getId(), maxId);
	}

	public void shuffle(List<Integer> values) {

		Random r = new Random();
		for (int i = 0; i < values.size(); i++) {
			int index = r.nextInt(values.size());

			Integer c1 = values.get(i);
			Integer c2 = values.get(index);
			values.set(index, c1);
			values.set(i, c2);
		}
	}

	public int size(LEVEL l) {
		return leitnerLearningBoxes.get(l).size();
	}

	public List<Integer> getTrainingList(int listSize) {
		List<Integer> l = new ArrayList<Integer>();

		for (int i = 0; i < listSize; i++) {
			int charIdx = getNextCard();
			if (charIdx != -1) {
				l.add(charIdx);
			} else {
				break;
			}
		}
		shuffle(l);
		return l;
	}

	public void save() {
		LeitnerSaverFactory saverFactory = new LeitnerSaverFactory();
		LeitnerSaver saver = saverFactory.createSaver();

		Map<Double, List<Integer>> map = new TreeMap<Double, List<Integer>>();

		for (Map.Entry<LEVEL, LinkedHashSet<Integer>> en : leitnerLearningBoxes.entrySet()) {

			double level = en.getKey().ordinal();
			ArrayList<Integer> list = new ArrayList<Integer>();

			list.addAll(en.getValue());

			map.put(level, list);
		}

		saver.setMap(map);

		String saveString = saverFactory.serializeToJson(saver);

		AppResources.logger.log(Level.INFO, "saveString: " + saveString);

		Storage stockStore = Storage.getLocalStorageIfSupported();
		if (stockStore != null) {
			stockStore.setItem(CHINESE_FLASHCARD_LEITNER, saveString);
		} else {
			AppResources.logger.log(Level.ALL, "Local storage not Suported");
		}

	}

	static public LeitnerSystem load() {
		Storage stockStore = Storage.getLocalStorageIfSupported();
		if (stockStore != null) {
			String saveString = stockStore.getItem(CHINESE_FLASHCARD_LEITNER);

			AppResources.logger.log(Level.INFO, "saveString: " + saveString);
			if (saveString != null) {
				LeitnerSaverFactory saverFactory = new LeitnerSaverFactory();

				LeitnerSaver saver = saverFactory.deserializeFromJson(saveString);

				Map<Double, List<Integer>> map = saver.getMap();

				LeitnerSystem ls = new LeitnerSystem(map);

				return ls;
			}
		} else {
			AppResources.logger.log(Level.ALL, "Local storage not Suported");
		}

		return new LeitnerSystem();
	}
}
