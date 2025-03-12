package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import java.time.Duration;
//import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Browser.Browser;
//import Locators.IOException;
import Locators.Page1Objects;

public class Page1 extends Browser {

//	public static WebDriverWait wait;

	static Page1Objects obj;

//	public static void enterLoginCredentials(String data, String data2) {
//		obj = PageFactory.initElements(driver, Page1Objects.class);
//
//		obj.username.sendKeys(data);
//		obj.password.sendKeys(data2);
//		obj.loginButton.click();
//
//	}
	
	public static void enterUsername(String data) throws Exception{
		
//		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("username"))));
		obj = PageFactory.initElements(driver, Page1Objects.class);
		Thread.sleep(2000);
		obj.username.sendKeys(data);
//		driver.findElement(By.name("username")).sendKeys("Admin");
	}
	
	public static void enterPassword(String data2) {
//		obj = PageFactory.initElements(driver, Page1Objects.class);
		obj.password.sendKeys(data2);
	}
	
	public static void clickLogin() {
		obj.loginButton.click();
	}
	
	
	public static String getTitle() {
		return driver.getTitle();
	}
	

//	04/03/2025 - Title Check (Expected vs Actual)
	public static void expectedTitleCheck() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "OrangeHRM";

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title match");
		} else {
			System.out.println("Title does not match");
		}
	}
	
}