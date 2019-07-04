package com.pfl.automation.org62.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RuntimeRetryTest {
	

	@Test
	public void mytest1()
	{
		Assert.assertTrue(false);		
	}
	
	@Test
	public void mytest2()
	{
		Assert.assertFalse(true);		
	}
	
	@Test
	public void mytest3()
	{
		Assert.assertEquals("Deepak", "Sharma");
	}

}
