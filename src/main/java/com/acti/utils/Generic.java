package com.acti.utils;

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

}
