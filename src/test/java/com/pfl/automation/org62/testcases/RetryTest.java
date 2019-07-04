package com.pfl.automation.org62.testcases;

import javax.validation.constraints.AssertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTest {
	
	@Test(retryAnalyzer = com.pfl.automation.deepak.rerun.FailedTestAnalyszer.class)
	public void mytest1()
	{
		Assert.assertTrue(false);		
	}
	
	@Test(retryAnalyzer = com.pfl.automation.deepak.rerun.FailedTestAnalyszer.class)
	public void mytest2()
	{
		Assert.assertFalse(true);		
	}
	
	@Test(retryAnalyzer = com.pfl.automation.deepak.rerun.FailedTestAnalyszer.class)
	public void mytest3()
	{
		Assert.assertEquals("Deepak", "Sharma");
	}

}
