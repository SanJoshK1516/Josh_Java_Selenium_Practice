package Pages;

//import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Browser.Browser;
import Locators.Page2Objects;

public class Page2 extends Browser {
	
	static Page2Objects obj;
	
	public static void optionClick(String str) {
		obj = PageFactory.initElements(driver, Page2Objects.class);
		
		wait.until(ExpectedConditions.elementToBeClickable(obj.dashboardElement));
		try {
			for (WebElement e : obj.list) {
				if(e.getText().equalsIgnoreCase(str)) {
					e.click();
					break;
				}
			}
		} catch (Exception exc) {
			System.out.println(exc);
		}
		
		
	}
	
	public static String getUser() {
		WebElement web = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
		String actualUser = web.getText();
		System.out.println(actualUser);
		
		return actualUser;
	}
	
	
	
	public static void expectedUserCheck() {
		WebElement web = driver.findElement(By.cssSelector("[class=\"oxd-userdropdown-name\"]"));
		String actualUser = web.getText();
		String expectedUser = "Giang Ngyuen";
		
		if(actualUser.equals(expectedUser)) {
			System.out.println("Username verified");
		} else {
			System.out.println("Username not verified");
		}
	}
	

}
