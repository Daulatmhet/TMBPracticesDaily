package com.tmb.pages;

import org.openqa.selenium.By;

public  class OrangeHRMHomePage extends BasePage  {
	
	

	
  private final By link_welcome = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span");
  private final By link_logout = By.xpath("//a[text()='Logout']");
  
  
  
  public OrangeHRMHomePage clickwelcome() throws InterruptedException {
	  Thread.sleep(1500);
	 // DriverManager.getDriver().findElement(link_welcome).click();
	  
	  click(link_welcome, "present");
	  return this;
  }
  
  
  
  
  public OrangeHRMLoginPage clickLogout() throws InterruptedException
  {
		
	  Thread.sleep(1000);
	  
	  
	//  DriverManager.getDriver().findElement(link_logout).click();
	  click(link_logout, "clickable");
	  
	   return new OrangeHRMLoginPage();
	   
  }
  
  
   
  

  
}




