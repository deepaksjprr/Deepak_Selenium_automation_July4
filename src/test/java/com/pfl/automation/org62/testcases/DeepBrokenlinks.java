package com.pfl.automation.org62.testcases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pfl.automation.utils.Constants;

public class DeepBrokenlinks {

//	WebDriver driver = new ChromeDriver();
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + Constants.chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.softwaretestingmaterial.com");
		Thread.sleep(4000);
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("total number of available links is: " +list.size());
		for(int i=0;i<list.size();i++)
		{
			WebElement we = list.get(i);
			String url = we.getAttribute("href");
			verifyURL(url);
		}
		
	}
	
	
	public static void verifyURL(String url) throws IOException, InterruptedException
	{
		URL link = new URL(url);
		HttpURLConnection hc = (HttpURLConnection)link.openConnection();
		Thread.sleep(3000);
		hc.setConnectTimeout(3000);
		hc.connect();
		if(hc.getResponseCode()==200)
		{
			System.out.println("The link is correct: " +url +":" +hc.getResponseMessage());
			
		}
		if(hc.getResponseCode()==404)
		{
			System.out.println("The link is incorrect: "+url +":"+hc.getResponseMessage());
		}
	}
	
}
