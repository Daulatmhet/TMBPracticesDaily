package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.tmb.driver.DriverManager;

public class TC2testcases {
	
	
	

	private TC2testcases() {
		
	}
	
	//Validate wheather the title is containing Google search or google Search
	//Validate whether the title is not null and the length of title is greater than 15 and less thank 100
	//check for the links in the pages --> Testing mini bytes -
	//Number of links dsiplayed is exactly 10 or 25
	
	
	
	
	@Test
	public void test2() throws Exception
	{
		
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Automation selnium testing",Keys.ENTER);
		
		
		
		
		
	/*String title=	DriverManager.getDriver().getTitle();
	Assert.assertTrue(Objects.nonNull(title));
	Assert.assertTrue(title.contains("Google Search"));
	Assert.assertTrue(title.toLowerCase().matches("\\w."));
	Assert.assertTrue(title.length()>15);
	Assert.assertTrue(title.length()<15);
	
	 List<WebElement> a = DriverManager.getDriver().findElements(By.xpath("//h3/span"));
	 Assert.assertEquals(a.size(), 10);
	 
	  boolean isElementPresent = false;
	 for(WebElement e: a)
	 {
		  if(e.getText().equalsIgnoreCase("Testing mini Bytes - Youtube")) {
			   
			   isElementPresent = true;
			   break;
			  
		  }
		  
		  
	 }
	 
	 Assert.assertTrue(isElementPresent, "Testing mini bytes not found");*/
	 
	 

	
	}
	
	

}




 



