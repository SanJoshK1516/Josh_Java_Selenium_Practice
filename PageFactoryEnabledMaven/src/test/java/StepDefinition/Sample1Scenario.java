package StepDefinition;

import io.cucumber.java.en.*;

import org.testng.Assert;

import Browser.Browser;
import Pages.Page1;

public class Sample1Scenario {
	
	@Given("User opens the Browser")
	public void user_opens_the_browser() throws Exception {
	   Browser.openBrowser();
	}
	
	@And("User navigates to the {string} Webpage")
	public void user_navigates_to_the_webpage(String string) throws Exception {
	   Browser.navigateToUrl(string);
	}

	@Then("User verifies the title of the Webpage")
	public void user_verifies_the_title_of_the_webpage() {
	   Assert.assertEquals(Page1.getTitle(), "OrangeHRM");
	}
	
//	@When("User enters the username, password and Login button")
//	public void user_enters_the_username_password_and_login_button() {
//	    Page1.enterLoginCredentials("Admin", "admin123");
//	}
	

	@And("User closes the Browser")
	public void user_closes_the_browser() {
		Browser.closeBrowser();
	}

}
