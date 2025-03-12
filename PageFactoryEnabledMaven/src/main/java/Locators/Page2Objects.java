package Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import Browser.Browser;
public class Page2Objects extends Browser {

//	public static By searchMenuElements = By.xpath("//ul[@class='oxd-main-menu']/li");
	
	@FindAll(@FindBy(xpath = "//ul[@class='oxd-main-menu']/li"))
	@CacheLookup
	public List<WebElement> list;
	
	@FindBy(css = "[class=\"oxd-userdropdown-name\"]")
//	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/p")
	@CacheLookup
	public WebElement dashboardElement;
	
	
//	public static List<WebElement> menuElements(){
//		wait = new WebDriverWait(Browser.driver, Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(searchMenuElements));
//		
//		return driver.findElements(searchMenuElements);
//	}
	

}
