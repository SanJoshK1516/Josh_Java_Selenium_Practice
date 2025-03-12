package TestCaseDemo;

//import org.openqa.selenium.By;

import Browser.Browser;
import Pages.Page1;
import Pages.Page2;
import ScreenShot.Capture;

public class Demo {
	
	public static void main(String[] args) {
	
		try {
			Browser.openBrowser();
			Browser.navigateToUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
//			Page1.expectedTitleCheck();
//			Page1.getTitle();
				
			Thread.sleep(3000);

//			USING LOCATORS - PAGE 1 AND PAGE 2 OBJECTS			
//			Page1.enterLoginCredentials("Admin", "admin123");
			
			Page1.enterUsername("Admin");
			
			
			
//			Thread.sleep(2000);
//			Page2.expectedUserCheck();
			
//			Page2.optionClick("My Info");
			
			Thread.sleep(5000);
//			Browser.closeBrowser();
	
			
		} catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
