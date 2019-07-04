package com.pfl.automation.org62.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.pfl.automation.utils.Constants;

public class ParallelExecution1 {
	
//	@Test
//	public void getFirefoxbrowser()
//	{
//		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + Constants.firefoxDriverPath);
//		WebDriver driver = new FirefoxDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.get("https://www.softwaretestingmaterial.com");
//		driver.close();
//		
//	}
	
	@Test
	public void getchromebrowser()
	{
		System.out.println("hello from PE1");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + Constants.chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.softwaretestingmaterial.com");
		driver.close();
	}

}
