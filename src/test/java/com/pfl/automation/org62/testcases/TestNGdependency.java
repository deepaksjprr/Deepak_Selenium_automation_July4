package com.pfl.automation.org62.testcases;

import org.testng.annotations.Test;

public class TestNGdependency {

	@Test(groups = {"firstm"})
	public void firstmethod()
	{
		System.out.println("this is first method");
	}
	
	@Test(groups = {"secondm"})
	public void secondmethod()
	{
		System.out.println("this is second method");
	}
	
	
	
//	@Test(dependsOnMethods = {"secondmethod"})
//	public void firstmethod()
//	{
//		System.out.println("this is first method");
//	}
//	
//	@Test
//	public void secondmethod()
//	{
//		System.out.println("this is second method");
//	}
	
//	@Test(dependsOnMethods = {"thirdmethod"})
//	public void secondmethod()
//	{
//		System.out.println("this is second method");
//	}
	
//	@Test
//	public void thirdmethod()
//	{
//		System.out.println("this is third method");
//	}
//	
//	@Test
//	public void fourthmethod()
//	{
//		System.out.println("this is fourth method");
//	}
//	
//	@Test
//	public void fifthmethod()
//	{
//		System.out.println("this is fifth method");
//	}
}
