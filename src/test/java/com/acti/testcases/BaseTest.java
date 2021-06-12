package com.acti.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import com.acti.base.DriverScript;
import com.acti.pages.EnterTimeTrack;
import com.acti.pages.LoginPage;
import com.acti.pages.TaskList;

public class BaseTest extends DriverScript {
	
	LoginPage loginPage;
	EnterTimeTrack enterTimeTrack;
	TaskList taskList;
	
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
	public void postconditions()
	{
		closeApplication();
	}

}
