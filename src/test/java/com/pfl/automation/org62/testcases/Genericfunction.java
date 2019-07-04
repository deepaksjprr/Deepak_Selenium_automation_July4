package com.pfl.automation.org62.testcases;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Genericfunction {
	
	
	public static void takescreenshot(WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File f =	ts.getScreenshotAs(OutputType.FILE);
		String time = get_timestamp(); 
		FileUtils.copyFile(f, new File("./Screenshot_Deepak/" +"screenshot_" +time +".png"));
	}
	
	public static String get_timestamp() {
		
		Date date = new Date();  
        Timestamp ts=new Timestamp(date.getTime());  
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");  
        System.out.println(formatter.format(ts));   
        return formatter.format(ts);
        
//		System.out.println("we are inside get_timestamp method");
//		Date date = new Date();
//		long time = date.getTime();
//		System.out.println("Time in Milliseconds: " + time);
//		return time;
	}
	
}
