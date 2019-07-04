package com.pfl.automation.org62.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dummyfileupload {
	
	public WebDriver driver;
	By username_textbox = By.xpath("//input[@type='email'][@name='username']");
	By password_textbox = By.xpath("//input[@type='password'][@name='pw']");
	By login_button = By.xpath("//input[@type='submit'][@name='Login']");
	public static String username = "mohit.gulati@metacubeautomation.com";
	public static String password = "admin123#";
	String baseUrl = "https://login.salesforce.com";
	By user_nav_dropdown = By.xpath("//div[@id='userNav']");
	By my_profile_link = By.xpath("//a[@title='My Profile']");
	By user_logo = By.xpath("(//img[@class='chatter-photo'])[1]");
	
	By add_your_photo = By.xpath("//a[@id='uploadLink']");
	
//	By add_your_photo = By.xpath("//div/a[contains(.,'Add your photo')]");
	By close_popup = By.xpath("//a[@id='uploadPhotoX']");
	By iframe_id= By.xpath("//iframe[@id='uploadPhotoContentId']");
	By choose_file = By.xpath("//input[@class='fileInput']");
	By save_button = By.xpath("(//div/input[@value='Save'])[2]");
	By save_button_last = By.xpath("//div/input[@value='Save']");
	String pic_path = "C:\\Users\\Deepak\\Downloads\\mYPicture.jpg";
	
	public static void main(String args[])
	{
		dummyfileupload df = new dummyfileupload();
		df.login_and_profile();
	}
	
	public void login_and_profile()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get(baseUrl);
		driver.findElement(username_textbox).sendKeys(username);
		driver.findElement(password_textbox).sendKeys(password);
		driver.findElement(login_button).click();
		driver.findElement(user_nav_dropdown).click();
		driver.findElement(my_profile_link).click();
		WebElement user_logo_hover = driver.findElement(user_logo);
		
		Actions ac = new Actions(driver);
		ac.moveToElement(user_logo_hover).perform();
		System.out.println("hover successfully on logo image of user");
		
		driver.findElement(add_your_photo).click();
		driver.switchTo().frame(driver.findElement(iframe_id));
		System.out.println("entered inside the iframe");
		WebElement we = driver.findElement(choose_file);
		//we.click();
		//we.click();
		we.sendKeys(pic_path);
		driver.findElement(save_button).click();
		System.out.println("upload the picture succesfully");	
		driver.findElement(save_button_last).click();
		//driver.findElement(close_popup).click();
		//System.out.println("closed the upload photo popup succesfully");	
		driver.quit();
	}
}