package com.acti.testcases;

import org.testng.annotations.Test;

import com.acti.base.DriverScript;
import com.acti.pages.EnterTimeTrack;
import com.acti.pages.LoginPage;
import com.acti.pages.TaskList;
import com.acti.utils.Generic;

public class TC02_CreateCustomer extends BaseTest{
	
	@Test
	public void testCreateCustomer() throws Exception
	{
		
		loginPage.loginApplication("admin", "manager");
		enterTimeTrack.clickTaskMenu();
		taskList.clickAddnew();
		taskList.clickAddnewCustomer();
		taskList.enterCustomerName("Abhishek Sharma");
		taskList.enterCustomerDesc("ABC Corp");
		taskList.clickProjectDropDwn();
		taskList.clickProject();
		taskList.clickCreateCustomerBtn();
		Generic.fn_sleep();
		System.out.println(taskList.getSuccessMsg());
	}
	

}
