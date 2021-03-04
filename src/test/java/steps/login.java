package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {

	@Given("user is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("step: user is on login page");
	    System.out.println("step: ");
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("step: user enters valid username and password");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("step: clicks on login button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("step: user is navigated to the home page");
	}

	@When("user enters invalid username and password")
	public void user_enters_invalid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("step: user enters invalid username and password");
	}

	@Then("error message is displayed - Invalid Credentials")
	public void error_message_is_displayed_Invalid_Credentials() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("step: error message is displayed - Invalid Credentials");
	}
}
