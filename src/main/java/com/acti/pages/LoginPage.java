package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

public class LoginPage extends DriverScript{

//*******************Page Elements ***************	
		
		@FindBy(id="username") WebElement usernameTB;
		@FindBy(name="pwd") WebElement passwordTB;
		@FindBy(id="loginButton") WebElement loginBtn;
		@FindBy(xpath="//div[@class='atLogoImg']") WebElement actitimeLogoImg;
	
	
//***************** Page Element Initialize********
//Use of Page Factory Class in POM to initialize the page elements by a constructor
	
public LoginPage()
{
	PageFactory.initElements(driver, this);
}
	
//****************Page Actions *****************************
public void loginApplication(String username,String password)
{
	usernameTB.sendKeys(username);
	passwordTB.sendKeys(password);
	loginBtn.click();
}
public boolean verifyLogo()
{
	return actitimeLogoImg.isDisplayed();
}
	
public String verifyPageTitle()
{
	return driver.getTitle();
}
}