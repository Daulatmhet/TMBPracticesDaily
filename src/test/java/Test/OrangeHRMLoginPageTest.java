package Test;

import org.testng.annotations.Test;

import com.tmb.pages.OrangeHRMLoginPages;

public class OrangeHRMLoginPageTest extends BaseTest{
	
	private OrangeHRMLoginPageTest () {
		
	}
	
	@Test
	public void loginLogoutTest()
	{
		
		
     String title=  new OrangeHRMLoginPages().enterUsername("Admin").enterPassword("admin123").clickOnLogin().clickwelcome().clickLogout().getTitle();
	 
	 
	
		
		 
		 
		 
		 
		 
	
	}
	
	
 
	
  
}
