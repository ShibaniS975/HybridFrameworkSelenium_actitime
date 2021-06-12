package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

public class EnterTimeTrack extends DriverScript {
	
	@FindBy(xpath="//a[@class='content tasks']") WebElement tasksMenu;
	@FindBy(id="logoutLink") WebElement logoutLink;
	
	public EnterTimeTrack() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogout()
	{
		logoutLink.click();
	}
	public void clickTaskMenu()
	{
		tasksMenu.click();
	}
}
