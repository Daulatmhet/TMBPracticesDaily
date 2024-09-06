package com.tmb.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tmb.driver.DriverManager;

public class BasePage {
	
	
	
	protected void click(By by , String waitstrategy)
	{
		if(waitstrategy.equalsIgnoreCase("clickable"))
		{
			explicitWaitForElementToBeClickable(by);
		}
		else if (waitstrategy.equalsIgnoreCase("present"))
		{
			explicitWaitForElementToBePresent(by);
		}
		
		
		DriverManager.getDriver().findElement(by).click();
		
	}
	
	protected void sendkeys(By by , String value , String waitstrategy)
	{
		
		if(waitstrategy.equalsIgnoreCase("clickable"))
		{
			explicitWaitForElementToBeClickable(by);
		}
		else if (waitstrategy.equalsIgnoreCase("present"))
		{
			explicitWaitForElementToBePresent(by);
		}
		
		DriverManager.getDriver().findElement(by).sendKeys(value);
		
		
	}
	
	protected String getPageTitle()
	{ 
		return DriverManager.getDriver().getTitle();
	}
	
	private void explicitWaitForElementToBeClickable(By by)
	{
		 new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(by));
	}
	
	
	private void explicitWaitForElementToBePresent(By by)
	{
		
		 new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10))
			.until(ExpectedConditions.presenceOfElementLocated(by));
	}
	
	
	
	

}
