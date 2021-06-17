package com.acti.testcases;

import org.testng.annotations.Test;

import com.acti.base.DriverScript;
import com.acti.pages.EnterTimeTrack;
import com.acti.pages.LoginPage;
import com.acti.pages.TaskList;
import com.acti.utils.Generic;
import com.aventstack.extentreports.Status;

public class TC02_CreateCustomer extends BaseTest{
	
	@Test
	public void testCreateCustomer() throws Exception
	{
		logger=extent.createTest("Verify create Customer functionality");
		loginPage.loginApplication("admin", "manager");
		logger.log(Status.PASS, "Login Successful");
		enterTimeTrack.clickTaskMenu();
		logger.log(Status.PASS, "Clicked on TaskMenu");
		taskList.clickAddnew();
		logger.log(Status.PASS, "Clicked on Add NewButton");
		taskList.clickAddnewCustomer();
		logger.log(Status.PASS, "Clicked on Add NewCustomer");
		taskList.enterCustomerName("Abhishek Sharma");
		logger.log(Status.PASS, "Entered New Customer Name");
		taskList.enterCustomerDesc("ABC Corp");
		logger.log(Status.PASS, "Entered New Customer Description");
		taskList.clickProjectDropDwn();
		logger.log(Status.PASS, "Clicked on Project DropDown");
		taskList.clickProject();
		logger.log(Status.PASS, "Clicked on Project");
		taskList.clickCreateCustomerBtn();
		logger.log(Status.PASS, "Clicked on Create CustomerButton");
		Generic.fn_sleep();
		System.out.println(taskList.getSuccessMsg());
		logger.log(Status.PASS, "Customer Created Successfully");
	}
	

}
