package be.cetic.nios.i18n;

import java.util.ResourceBundle;

import nios.Loc;

import org.junit.Assert;
import org.junit.Test;

public class LocalizationTest {

	
	@Test
	public void test1 () {
		ResourceBundle rb = Loc.getRessource("MyProcess");
		Assert.assertNotNull(rb);
	}
	
	@Test
	public void test2 () {
		ResourceBundle rb = Loc.getRessource("MyProcess");
		System.out.println(rb.getString("submit"));
	}
}
