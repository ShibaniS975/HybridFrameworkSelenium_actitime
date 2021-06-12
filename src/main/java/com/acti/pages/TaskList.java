package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

public class TaskList extends DriverScript{
	
	@FindBy(xpath="//div[@class='title ellipsis']") WebElement addNewDrpdwn;
	@FindBy(xpath="//div[@class='item createNewCustomer']") WebElement addnewCustomer;
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]") WebElement custNameTb;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']") WebElement custDescTb;
	@FindBy(xpath="//div[text()='Create Customer']") WebElement createCustBtn;

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
}
