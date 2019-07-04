package com.pfl.automation.base;

import java.io.IOException;

import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendedreportsDeepak extends BaseTest
{
	
	public ExtentReports extent;
	public ExtentHtmlReporter htmlreporter;
	public ExtentTest logger;
	
//	
//	public void startReport()
//	{
//		htmlreporter = new ExtentHtmlReporter("./reports/"+"STMExtentreport.html");
//		extent = new ExtentReports();
//		extent.attachReporter(htmlreporter);
//		extent.setSystemInfo("HostName", "SoftwareTestingMaterials");
//		extent.setSystemInfo("ReporterName", "Deepak Sharma");
//		extent.setSystemInfo("Environment", "Production");
//		htmlreporter.config().setDocumentTitle("Title is Dummy reporting);");
//		htmlreporter.config().setReportName("ReportName is Deepaksharma reporting sir");
//		htmlreporter.config().setTheme(Theme.STANDARD);
//		
//	}
//	
//	public void getresult(ITestResult result)
//	{
//		if(ITestResult.FAILURE==result.getStatus())
//		{
//			logger.fail("test case "+result.getTestName()+" is failed");
//			try 
//			{
//				String screenshot = deeptakescreenshot(driver);
//				logger.fail("here is the screenshot of failed tc " +logger.addScreenCaptureFromPath(screenshot));
//			} 
//			catch (IOException e) 
//			{
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		} else if(ITestResult.SKIP==result.getStatus())
//		{
//			logger.skip("test case "+result.getTestName()+" is skipped");
//		}
//		else if(ITestResult.SUCCESS==result.getStatus())
//		{
//			logger.pass("test case "+result.getTestName()+" is passed");
//		}
//	}
//	
//	public void end_report()
//	{
//		extent.flush();
//	}
//	
}
