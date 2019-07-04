package com.pfl.automation.org62.testcases;

import org.testng.annotations.Test;

import com.pfl.automation.base.BaseTest;
import com.pfl.automation.utils.Constants;
import com.pfl.automation.utils.Log;
import com.pfl.automation.utils.reruntest.DynamicRetryAnalyzer;

public class TS01_Administration_AssertTiles extends BaseTest {
	
		//@Parameters("browser")
		//@Test(priority=0, alwaysRun = true)
		//@Test(groups= {"smoke"}, enabled = true)
		@Test
		public void TS_01_01_Verify_administration_tiles() throws Exception {
			System.out.println("only smoke");
			Log.startTestCase("TS1_Verify_administration_tiles");
			loginPage.logintoapplication(Constants.username, Constants.password);
			swagiq.verifyTilesAdministration(driver);
			homePage.logout(driver);
			Log.endTestCase("TS1_Verify_administration_tiles");
		}
		
		//@Test (retryAnalyzer=DynamicRetryAnalyzer.class)
		//@Test(priority=1, alwaysRun = true)
		//@Test(groups= {"regression"}, enabled = true)
		//@Test
		public void TS_01_02_Verify_presence_of_different_components_on_Program_administration_page() throws Exception {
			System.out.println("combination of smoke and regression");
			Log.startTestCase("TS2_Verify_presence_of_different_components_on_Program_administration_page");
			loginPage.logintoapplication(Constants.username, Constants.password);
			swagiq.Click_ProgramAdministration(driver);
			programAdminPage.verifyProgramAdministration(driver);
			homePage.logout(driver);
			Log.endTestCase("TS2_Verify_presence_of_different_components_on_Program_administration_page");
		}
		
		//@Test (retryAnalyzer=DynamicRetryAnalyzer.class)
		//@Test(priority=2, alwaysRun = true)
		//@Test(groups = {"regression", "smoke"}, enabled = true)
		//@Test
		public void TS_01_03_Verify_presence_of_different_components_on_User_administration_page() throws Exception {
			System.out.println("combination of smoke and regression");
			Log.startTestCase("TS3_Verify_presence_of_different_components_on_User_administration_page");
			loginPage.logintoapplication(Constants.username, Constants.password);
			swagiq.Click_UserAdministration(driver);
			userAdminPage.verifyUserAdministration(driver);
			homePage.logout(driver);
			Log.endTestCase("TS3_Verify_presence_of_different_components_on_User_administration_page");
		}
		
		//@Test (retryAnalyzer=DynamicRetryAnalyzer.class)
		//@Test(priority=3, alwaysRun = true)
		//@Test(groups = {"smoke"}, enabled = true)
		//@Test
		public void TS_01_04_Verify_presence_of_different_components_on_Product_administration_page() throws Exception {
			System.out.println("only smoke");
			Log.startTestCase("TS4_Verify_presence_of_different_components_on_Product_administration_page");
			loginPage.logintoapplication(Constants.username, Constants.password);
			swagiq.Click_ProductAdministration(driver);
			productAdministrationPage.verifyProductAdministration(driver);
			homePage.logout(driver);
			Log.endTestCase("TS4_Verify_presence_of_different_components_on_Product_administration_page");
		}
		
		//@Test(expectedExceptions = ArithmeticException.class)
		public void testNGexception()
		{
			System.out.println("This is to verify the testNG exception");
			int a = 1/0;
			System.out.println("value of a is: " +a);
		}
}