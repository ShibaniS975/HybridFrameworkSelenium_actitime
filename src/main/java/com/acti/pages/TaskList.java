package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.acti.base.DriverScript;

public class TaskList extends DriverScript{
	
	WebDriverWait wait;
	
	@FindBy(xpath="//div[@class='title ellipsis']") WebElement addNewDrpdwn;
	@FindBy(xpath="//div[@class='item createNewCustomer']") WebElement addnewCustomer;
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]") WebElement custNameTb;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']") WebElement custDescTb;
	@FindBy(xpath="//div[text()='Create Customer']") WebElement createCustBtn;
	@FindBy(xpath="(//input[@placeholder='Start typing name ...'])[1]") WebElement searchCustomerTb;
	@FindBy(xpath="//span[@class='innerHtml']") WebElement creationToastMessage;
	@FindBy(xpath="(//div[@class='dropdownButton'])[15]") WebElement projectDrpdwn;
	@FindBy(xpath="(//div[text()='Big Bang Company'])[7]") WebElement bigBangCompany;
	

	public TaskList() 
	{
		PageFactory.initElements(driver, this);
	}
	public void clickAddnew()
	{
		addNewDrpdwn.click();
	}
	public void clickAddnewCustomer()
	{
		addnewCustomer.click();
	}
	public void enterCustomerName(String customerName)
	{
		custNameTb.sendKeys(customerName);
	}
	public void enterCustomerDesc(String customerDesc)
	{
		custNameTb.sendKeys(customerDesc);
	}
	public void clickCreateCustomerBtn()
	{	
		 wait = new WebDriverWait(driver, 20);
		 wait.until(ExpectedConditions.elementToBeClickable(createCustBtn));
		 createCustBtn.click();
	}
	public void clickProjectDropDwn()
	{
		projectDrpdwn.click();
	}
	public void clickProject()
	{
		bigBangCompany.click();
	}
	public String getSuccessMsg()
	{
		return creationToastMessage.getText();
	}
}
