package com.acti.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.acti.base.DriverScript;
import com.acti.pages.LoginPage;

public class TC01_Login extends BaseTest {
		
	@Test(priority=2)
	public void testLogin()
	{
		loginPage.loginApplication("admin", "manager");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
	@Test(priority=1)
	public void verifyLogoImg()
	{
		boolean flag = loginPage.verifyLogo();
		System.out.println(flag);
	}
	
	
}
