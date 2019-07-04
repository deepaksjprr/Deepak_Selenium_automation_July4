package com.pfl.automation.org62.testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.pfl.automation.base.BaseTest;
import com.pfl.automation.utils.Constants;

public class BrowserStack extends BaseTest {

	public static String USERNAME_BS = "deepaksharma51";
	public static String ACCESSKEY_BS = "NygzpzK2VGZyu6TFNKyS";
	public static String URL_BS = "https://"+USERNAME_BS+":"+ACCESSKEY_BS+"@hub.browserstack.com/wd/hub";
	
	@Test
	public void openSTM() throws Exception
	{
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setPlatform(Platform.MAC);
		ds.setBrowserName("firefox");
		ds.setVersion("57");
		
		URL bsURL = new URL(URL_BS);
		WebDriver driver = new RemoteWebDriver(bsURL, ds);
		TC01();
	}
	
	@Test(enabled=true)
	public void TC01() throws Exception {
		loginPage.logintoapplication(Constants.username, Constants.password);
		salsesforcePage.open_tab(Constants.tab_contacts);
		salsesforcePage.selectview(Constants.pfl_contact_view);
		salsesforcePage.opencontact(Constants.con_bd_auto_contact_first_name, Constants.con_bd_auto_contact_last_name);
		salsesforcePage.click_sendswagbutton();
		salsesforcePage.select_contact_address();
		salsesforcePage.use_this_address();
		salsesforcePage.verify_program_on_contact_send_marketing_page_new(admin_bd_auto_program_1, admin_bd_auto_product_1);
		homePage.logout(driver);
	}
	

}
