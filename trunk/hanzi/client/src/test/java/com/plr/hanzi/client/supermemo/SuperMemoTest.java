package com.plr.hanzi.client.supermemo;

import org.junit.Test;

public class SuperMemoTest {

//	@Test
//	public void testASDF() {
//		
//		double ef = 2.5;
//		SuperMemo sm = new SuperMemo();
//		for (int i = 0; i < 10; i++) {
//			System.out.println(ef);
//			ef = sm.newEf(5, ef);
//		}
//	}
//	
	
	
	@Test
	public void testGrade() {
		
		
		SuperMemo sm = new SuperMemo(4,0,0,0,0);
		
		
		for (double i = 1; i < 4; i = i + 0.1) {
			double ef = sm.grade(i, 4);
			System.out.println(SuperMemo.round(i, 1) + " -- " + SuperMemo.round(ef, 2));
		}
	}
	
}
