package com.acti.testcases;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.acti.base.DriverScript;
import com.acti.pages.EnterTimeTrack;
import com.acti.pages.LoginPage;
import com.acti.pages.TaskList;
import com.acti.utils.ExcelLib;
import com.acti.utils.Generic;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseTest extends DriverScript {
	
	LoginPage loginPage;
	EnterTimeTrack enterTimeTrack;
	TaskList taskList;
	ExtentHtmlReporter htmlReport;
	ExtentReports extent;
	ExtentTest logger;
	
	@BeforeClass
	public void preTest()
	{
		htmlReport = new ExtentHtmlReporter("./Reports/AutomationActiReport" +Generic.generateDateTime()+".html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReport);
	}
	
	@BeforeMethod
	public void preconditions()
	{
		initBrowser();
		launchApplication();
		loginPage=new LoginPage();
		enterTimeTrack=new EnterTimeTrack();
		taskList=new TaskList();
	}
	
	
	@AfterMethod
	public void postconditions(ITestResult result)
	{	
		if(result.getStatus()==ITestResult.FAILURE)
		{
			Generic.makescreenshot(driver);
		}
		closeApplication();
	}
	
	@DataProvider(name="actiData")
	public Object[][] testData()
	{
		ExcelLib xl = new ExcelLib("./src/test/resources/testdata/actiData.xlsx");
		int row = xl.getActiveRows(0);
		Object[][] data = new Object[row][2];
		for (int i = 0; i < row; i++) 
		{
			data[i][0]=xl.getData(0, i, 0);
			data[i][1]=xl.getData(0, i, 1);
		}
		return data;
	}
	
	@AfterClass
	public void  tearDown()
	{
		extent.flush();
	}
}
