package com.acti.testcases;

import org.testng.annotations.Test;

import com.acti.utils.Generic;

public class TC03_DeleteCustomer extends BaseTest {
	
	@Test
	public void testDeleteCustomer()
	{
		loginPage.loginApplication("admin", "manager");
		enterTimeTrack.clickTaskMenu();
		taskList.enterCustomerSearch("Abhishek Sharma");
		taskList.clickCustomerSearched();
		taskList.clickCustomerEditBtn();
		taskList.clickCustomerActionsBtn();
		Generic.fn_sleep();
		taskList.clickDeleteBtn();
		Generic.fn_sleep();
		taskList.clickPermanentlyDeleteBtn();
		Generic.fn_sleep();
		System.out.println(taskList.getDeleteToastMsg());
	}

}
