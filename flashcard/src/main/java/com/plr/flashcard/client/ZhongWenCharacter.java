package com.plr.flashcard.client;

import com.plr.flashcard.client.CardData.CharDefinition;

public interface ZhongWenCharacter {
	public int getId();

	public String getSimplifiedCharacter();

	public int definitionCount();

	public CharDefinition getDefinition(int j);

}
