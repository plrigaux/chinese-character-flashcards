package com.plr.iso29110.localisation.maven.plugin;

import java.io.File;

import org.apache.maven.plugin.testing.AbstractMojoTestCase;
import org.junit.Before;
import org.junit.Test;

public class MyMojoTest extends AbstractMojoTestCase {

	GenarateLocalisedSource myMojo = null;

	@Override
	public void setUp() throws Exception {
		super.setUp();

		File pom = getTestFile("src/test/resources/pom.xml");
		assertNotNull(pom);
		assertTrue(pom.exists());

		myMojo = (GenarateLocalisedSource) lookupMojo("doit", pom);

		assertNotNull(myMojo);
	}

	public void testPackageName() throws Exception {
		assertEquals("test.test", myMojo.getPackageName());
	}

	public void testBaseDir() throws Exception {
		myMojo.setBasedir(new File( "" ).getAbsolutePath());
		System.out.println(myMojo.getBaseDir());
	}

	public void testExecute() throws Exception {
		
	}
}