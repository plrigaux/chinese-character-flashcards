package com.plr.hanzi.client.supermemo;

import org.junit.BeforeClass;
import org.junit.Test;

public class SuperMemoTest {

	// @Test
	// public void testASDF() {
	//
	// double ef = 2.5;
	// SuperMemo sm = new SuperMemo();
	// for (int i = 0; i < 10; i++) {
	// System.out.println(ef);
	// ef = sm.newEf(5, ef);
	// }
	// }
	//

	
	@BeforeClass
	public static void init(){
		SuperMemoFactoryJava.init();
	}
	
	@Test
	public void testLoad() {

		SuperMemo.load("test");
	}

}
