package com.tmb.pages;

import org.openqa.selenium.By;

import com.tmb.driver.DriverManager;

public class OrangeHRMHomePage {
	
	
	private By link_welcome = By.xpath("//span[@class='oxd-userdropdown-tab']");
   private By link_logout = By.xpath("//a[.='Logout']");
   
   
   public OrangeHRMHomePage clickwelcome()
   {
	   DriverManager.getDriver().findElement(link_welcome).click();
	   return this;
   }
   
   public OrangeHRMLoginPages clickLogout()
   {
	   DriverManager.getDriver().findElement(link_logout).click();
	   return new OrangeHRMLoginPages();
   }
   
   
}
