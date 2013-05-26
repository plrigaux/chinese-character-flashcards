package com.plr.cvstojson;

import org.junit.Assert;
import org.junit.Test;

public class PinyinTest {
	@Test
	public void testR() {
		String out = Pinyin.convertToAccent("r5");
		
		Assert.assertEquals("r", out);
	}

	
	@Test
	public void testNu() {
		String out = Pinyin.convertToAccent("nv3");
		
		Assert.assertEquals("nǚ", out);
	}
}
