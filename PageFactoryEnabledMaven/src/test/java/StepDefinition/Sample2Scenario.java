package StepDefinition;

import org.testng.Assert;

import Pages.Page1;
import Pages.Page2;
import io.cucumber.java.en.*;

public class Sample2Scenario {

	@When("User enters  {string} the username")
	public void user_enters_the_username(String string) throws Exception {
		Thread.sleep(3000);
		Page1.enterUsername("Admin");
	}

	@And("User enters {string} the password")
	public void user_enters_the_password(String string) {
		Page1.enterPassword("admin123");
	}

	@And("User clicks on the Login button")
	public void user_clicks_on_the_login_button() {
		Page1.clickLogin();
	}

	@Then("User verifies the Profile Account")
	public void user_verifies_the_profile_account() throws Exception{
		Thread.sleep(3000);
		Assert.assertEquals(Page2.getUser(), "manda user");
	}

}
