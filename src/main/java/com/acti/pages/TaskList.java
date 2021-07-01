package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.acti.base.DriverScript;
import com.acti.utils.Generic;

public class TaskList extends DriverScript{
	
	
	
	@FindBy(xpath="//div[@class='title ellipsis']") WebElement addNewDrpdwn;
	@FindBy(xpath="//div[@class='item createNewCustomer']") WebElement addnewCustomer;
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]") WebElement custNameTb;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']") WebElement custDescTb;
	@FindBy(xpath="//div[text()='Create Customer']") WebElement createCustBtn;
	@FindBy(xpath="(//input[@placeholder='Start typing name ...'])[1]") WebElement searchCustomerTb;
	@FindBy(xpath="//span[@class='innerHtml']") WebElement creationToastMessage;
	@FindBy(xpath="(//div[@class='dropdownButton'])[15]") WebElement projectDrpdwn;
	@FindBy(xpath="//div[contains(@class,'itemRow cpItemRow')][normalize-space()='Galaxy Corporation']") WebElement galaxyCompany;
	@FindBy(xpath="(//input[@placeholder='Start typing name ...'])[1]") WebElement custSearchbx;
	@FindBy(xpath="//div[@class='node customerNode editable selected']//div[@class='title']") WebElement custSearched;
	@FindBy(xpath="(//div[@class='editButton'])[15]") WebElement custEditbtn; 
	@FindBy(xpath="(//div[@class='actionButton'])[7]") WebElement custActionsBtn;
	@FindBy(xpath="//div[text()='Delete']") WebElement deleteBtn;
	@FindBy(xpath="(//div[@class='buttonIcon'])[3]") WebElement permanentlyDeleteBtn;
	@FindBy(xpath="//span[@class='innerHtml']") WebElement deleteToastMsg;
	
	public TaskList() 
	{
		PageFactory.initElements(driver, this);
	}
	public void enterCustomerSearch(String customerName)
	{
		custSearchbx.sendKeys(customerName);
	}
	public void clickCustomerSearched()
	{
		custSearched.click();
	}
	public void clickCustomerEditBtn()
	{
		custEditbtn.click();
	}
	public void clickCustomerActionsBtn()
	{
		custActionsBtn.click();
	}
	public void clickDeleteBtn()
	{
		deleteBtn.click();
	}
	public void clickPermanentlyDeleteBtn()
	{
		permanentlyDeleteBtn.click();
	}
	public String getDeleteToastMsg()
	{
		return deleteToastMsg.getText();
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
		 Generic.fn_waitforWebElementPresence(driver, createCustBtn);
		 createCustBtn.click();
	}
	public void clickProjectDropDwn()
	{
		projectDrpdwn.click();
	}
	public void clickProject()
	{
		galaxyCompany.click();
	}
	public String getSuccessMsg()
	{
		return creationToastMessage.getText();
	}
}
