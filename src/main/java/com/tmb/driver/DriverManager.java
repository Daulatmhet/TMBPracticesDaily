package com.tmb.driver;

import org.openqa.selenium.WebDriver;

public class DriverManager {
	
	

	private static WebDriver driver;
	
	private static ThreadLocal<WebDriver> dr = new ThreadLocal<>();
	
	public static WebDriver getDriver()
	{
		return dr.get();
	}
	
	public static void setDriver(WebDriver driverref)
	{
		dr.set(driverref);
	}
	
	public static void unload()
	{
		dr.remove(); 
	}

}
