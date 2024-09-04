package com.tmb.pages;

import org.openqa.selenium.By;

import com.tmb.driver.DriverManager;

public class OrangeHRMLoginPages {
	
	public OrangeHRMLoginPages()
	{
		
	}
	
	private final By textbox_username = By.xpath("//input[@name ='username']");
	private final By textbox_password = By.xpath("//input[@name ='password']");
	private final By login_click = By.xpath("//button[@type='submit']");
	
	
	
	public OrangeHRMLoginPages enterUsername(String username)
	{
		DriverManager.getDriver().findElement(textbox_username).sendKeys(username);
		return this;
	}
	
	public OrangeHRMLoginPages enterPassword(String password)
	{
		DriverManager.getDriver().findElement(textbox_password).sendKeys(password);
		return this;
		
	}
	
	public OrangeHRMHomePage clickOnLogin()
	{
		DriverManager.getDriver().findElement(login_click).click();
		return new OrangeHRMHomePage();
	}
	
	
	public String getTitle()
	{
		  return DriverManager.getDriver().getTitle();
		  
		  
	}
     
	
	
}
