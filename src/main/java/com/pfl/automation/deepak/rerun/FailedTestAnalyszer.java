package com.pfl.automation.deepak.rerun;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class FailedTestAnalyszer implements IRetryAnalyzer {
	
	int init_count = 0;
	int max_count = 2;
	
	public boolean retry(ITestResult result)
	{
		if(init_count<max_count)
		{
			init_count++;
			return true;
		}
		
		return false;
	}

}
