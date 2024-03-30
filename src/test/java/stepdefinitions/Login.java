package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;
import utils.CommonUtils;

public class Login {
	
	private WebDriver driver;
	private LoginPage loginPage;
	private AccountPage accountPage;
	private CommonUtils comutils;

	@Given("User navigates to Login page")
	public void User_navigates_to_Login_page() {
		driver = DriverFactory.getDriver();
		HomePage homePage = new HomePage(driver);
		homePage.clickOnMyAcct();
		loginPage = homePage.selectLoginOption();
	}

	@When("^User enters valid email address (.+) into the email field$")
	public void User_enters_valid_email_address_into_the_email_field(String emailText) {
		loginPage.enterEmailAddress(emailText);
	}

	@And("^User has entered valid password (.+) into password field$")
	public void user_has_entered_valid_password_into_password_field(String passwordText) {
		loginPage.enterPassword(passwordText);
	}

	@And("User clicks on Login button")
	public void user_clicks_on_login_button() {
		accountPage = loginPage.clickOnLoginBtn();
	}

	@Then("User should get successfully logged in")
	public void user_should_get_successfully_logged_in() {
		Assert.assertTrue(accountPage.displayStatusOfEditAcctInfoLink());
	}

	@When("User enters invalid email address into the email field")
	public void user_enters_invalid_email_address_into_the_email_field() {
		comutils = new CommonUtils();
		loginPage.enterEmailAddress(comutils.getEmailTimeStamp());		
	}

	@When("User has entered invalid password {string} into password field")
	public void user_has_entered_invalid_password_into_password_field(String invalidPasswordText) {
		loginPage.enterPassword(invalidPasswordText);	
	}

	@Then("User should not get logged in and should get a proper warning message about credentials mismatch")
	public void user_should_not_get_logged_in_and_should_get_a_proper_warning_message_about_credentials_mismatch() {
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		String actualWarningMessage = loginPage.retrieveTextForNoEmailMatchWarning();
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));		
	}

	@When("User does not enter email address into the email field")
	public void user_does_not_enter_email_address_into_the_email_field() {
		loginPage.enterEmailAddress("");
	}

	@When("User does not enter password into password field")
	public void user_does_not_enter_password_into_password_field() {
		loginPage.enterPassword("");		
	}
	

}
