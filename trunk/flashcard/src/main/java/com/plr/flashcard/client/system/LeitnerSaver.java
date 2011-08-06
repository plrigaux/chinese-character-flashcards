package com.plr.flashcard.client.system;

import java.util.List;
import java.util.Map;

public interface LeitnerSaver {
	Map<Double, List<Integer>> getMap();
	void setMap(Map<Double, List<Integer>> map);
}
