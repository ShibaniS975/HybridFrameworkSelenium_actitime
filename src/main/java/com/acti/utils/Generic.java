package com.acti.utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Generic {
	
	public static void fn_sleep()
	{
		try 
		{
			Thread.sleep(3000);
		} 
		catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		}
	} 
	public static void makescreenshot(WebDriver driver)
	{
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src, new File("./Reports/Screenshots/failedTC.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
