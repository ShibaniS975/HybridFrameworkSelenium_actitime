package com.acti.testcases;

import org.testng.annotations.Test;

import com.acti.base.DriverScript;
import com.acti.pages.EnterTimeTrack;
import com.acti.pages.LoginPage;
import com.acti.pages.TaskList;

public class TC02_CreateCustomer extends BaseTest{
	
	@Test
	public void testCreateCustomer() throws Exception
	{
		
		loginPage.loginApplication("admin", "manager");
		enterTimeTrack.clickTaskMenu();
		taskList.clickAddnew();
		taskList.clickAddnewCustomer();
		taskList.enterCustomerName("Abhishek Sharma");
		Thread.sleep(3000);
	}
	

}
