package com.tmb.pages;

import org.openqa.selenium.By;

import com.tmb.driver.DriverManager;

public final class OrangeHRMLoginPage extends BasePage{

	
	
	public final By textbox_username = By.xpath("//input[@name='username']");
	public final By textbox_password = By.xpath("//input[@type='password']");
	
	private final By button_login = By.xpath("//button[@type='submit']");
	
	
	
	public OrangeHRMLoginPage enterusername(String username) {
		
		//We are reduced the code
		
	//	DriverManager.getDriver().findElement(textbox_username).sendKeys(username);
		
		sendkeys(textbox_username, username , "Present");
		return this;
	}
	
	public OrangeHRMLoginPage enterPassword(String password)
	{
		//DriverManager.getDriver().findElement(textbox_password).sendKeys(password);
		
		sendkeys(textbox_password, password , "Present");
		return this;
	}
	
	public OrangeHRMHomePage clickLogin()
	{
	//	DriverManager.getDriver().findElement(button_login).click();
		
		click(button_login , "clickable");
		
		return new OrangeHRMHomePage();
	}
	
	public String getTitle()
	{
		return getPageTitle();
		
	}
	
	
	}




