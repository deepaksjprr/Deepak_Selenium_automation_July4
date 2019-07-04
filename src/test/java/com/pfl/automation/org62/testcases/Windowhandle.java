package com.pfl.automation.org62.testcases;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Windowhandle {
	
	WebDriver driver;
	String baseUrl = "http://demo.guru99.com/popup.php";

	
	@Test(priority=0, alwaysRun = true)
	public void handlemultiplewindows()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get(baseUrl);
		String mainwindow = driver.getWindowHandle();
		String main_win_title = driver.switchTo().window(mainwindow).getCurrentUrl();
		System.out.println("title of main windowhandle is: " +main_win_title);
		System.out.println("id of main windowhandle is: " +mainwindow);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('Hey, are you seeing this popup?')");
		driver.switchTo().alert().accept();
		
		WebElement submit_button = driver.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
		
		Actions ac = new Actions(driver);
		ac.contextClick(submit_button).build().perform();
		System.out.println("right clicked successfully");
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		System.out.println("clicked on link successfully");
		
		Set<String> handles = driver.getWindowHandles();
		
		System.out.println("value of set handles is: " +handles);
		Iterator<String> i = handles.iterator();
		
		while(i.hasNext())
		{
			String childwin = i.next();
			if(!childwin.equalsIgnoreCase(mainwindow))
			{
			driver.switchTo().window(childwin);
			String child_w_title = driver.switchTo().window(childwin).getTitle();
			System.out.println("title of main windowhandle is: " +child_w_title);
			System.out.println("switched to new window succesfully");
			driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("deepak@gmail.com");
			driver.findElement(By.xpath("//input[@value='Submit']")).click();
//			driver.quit();
			}
		}
			
	}	
	
	@AfterMethod
	public void teardown(ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			Genericfunction.takescreenshot(driver);
		}
	}
		
	
		
//		ArrayList<String> tabs = new ArrayList<>(handles);
//		
//		driver.switchTo().window(tabs.get(0));
//		System.out.println("currnet title of this page is: " +driver.getCurrentUrl());
//		driver.close();
//		
//		driver.switchTo().window(tabs.get(1));
//		System.out.println("currnet title of this page is: " +driver.getCurrentUrl());
//		driver.close();		
	

}
