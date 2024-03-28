package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	@Given("User navigates to Login page")
	public void User_navigates_to_Login_page() {

	}

	@When("User enters valid email address {string} into the email field")
	public void User_enters_valid_email_address_into_the_email_field(String emailText) {

	}

	@And("User has entered valid password {string} into password field")
	public void user_has_entered_valid_password_into_password_field(String passwordText) {
	
	}

	@And("User clicks on Login button")
	public void user_clicks_on_login_button() {
	
	}

	@Then("User should get successfully logged in")
	public void user_should_get_successfully_logged_in() {
	
	}

	@When("User enters invalid email address {string} into the email field")
	public void user_enters_invalid_email_address_into_the_email_field(String invalidEmailText) {
		
	}

	@When("User has entered invalid password {string} into password field")
	public void user_has_entered_invalid_password_into_password_field(String invalidPasswordText) {
		
	}

	@Then("User should not get logged in and should get a proper warning message about credentials mismatch")
	public void user_should_not_get_logged_in_and_should_get_a_proper_warning_message_about_credentials_mismatch() {
		
	}

	@When("User does not enter email address into the email field")
	public void user_does_not_enter_email_address_into_the_email_field() {
		
	}

	@When("User does not enter password into password field")
	public void user_does_not_enter_password_into_password_field() {
		
	}

}
