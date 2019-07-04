package com.pfl.automation.org62.testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridChromeTest {

	public static void main(String[] args) throws MalformedURLException {
		
		// Define desired capabilities
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setPlatform(Platform.WINDOWS);
		dc.setBrowserName("chrome");
		
		// Chromeoption definition
		
		ChromeOptions co = new ChromeOptions();
		co.merge(dc);
		String hubUrl = "http://172.20.10.3:4444/wd/hub";
		
		WebDriver driver = new RemoteWebDriver(new URL(hubUrl),co);
		driver.get("http://www.freecrm.com");
		System.out.println(driver.getTitle());
		//driver.quit();
		
	
	}

}
