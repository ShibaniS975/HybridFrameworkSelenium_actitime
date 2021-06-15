package com.acti.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.acti.base.DriverScript;
import com.acti.pages.LoginPage;
import com.acti.utils.ExcelLib;
import com.acti.utils.Generic;

public class TC01_Login extends BaseTest {
		
	//@Test
	public void testLogin()
	{
		loginPage.loginApplication("admin", "manager");
		Generic.fn_sleep();
		
	}	
	//@Test(priority=1)
	public void verifyLogoImg()
	{
		boolean flag = loginPage.verifyLogo();
		System.out.println(flag);
	}
	
	@Test(dataProvider="actiData")
	public void testMultipleLogins(String username,String password)
	{
		loginPage.loginApplication(username, password);
		Generic.fn_sleep();
	}
	
	
	
}
