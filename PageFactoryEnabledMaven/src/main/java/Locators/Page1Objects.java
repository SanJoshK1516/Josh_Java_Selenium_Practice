package Locators;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import Browser.Browser;

public class Page1Objects extends Browser {

	@FindBy(xpath= "//input[@name='username']")
	public static WebElement username;
	
	@FindBy(name = "password")
	public WebElement password;
	
//	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement loginButton;
	

}
