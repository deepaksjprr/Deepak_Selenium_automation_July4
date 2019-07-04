package com.pfl.automation.org62.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTestNG {
	
	@Test 
	@Parameters("browser")
	public void browserName(String browser)
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.out.println("name of the browser is Chrome");
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.out.println("name of the browser is firefox");
		}
	}

}
