package com.plr.hanzi.client.supermemo;

import java.util.Map;

public interface RecordMap {
	Map<Integer, RecordMap> getMap();
	void setLeitnerBoxes(Map<Integer, RecordMap> map);
}