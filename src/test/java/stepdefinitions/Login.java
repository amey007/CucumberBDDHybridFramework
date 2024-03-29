package stepdefinitions;

import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	WebDriver driver;

	@Given("User navigates to Login page")
	public void User_navigates_to_Login_page() {
		driver = DriverFactory.getDriver();
		driver.findElement(By.xpath("//span[text() = 'My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
	}

	@When("User enters valid email address {string} into the email field")
	public void User_enters_valid_email_address_into_the_email_field(String emailText) {
		driver.findElement(By.id("input-email")).sendKeys(emailText);
	}

	@And("User has entered valid password {string} into password field")
	public void user_has_entered_valid_password_into_password_field(String passwordText) {
		driver.findElement(By.id("input-password")).sendKeys(passwordText);
	}

	@And("User clicks on Login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
	}

	@Then("User should get successfully logged in")
	public void user_should_get_successfully_logged_in() {
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
	}

	@When("User enters invalid email address into the email field")
	public void user_enters_invalid_email_address_into_the_email_field() {
		driver.findElement(By.id("input-email")).sendKeys(getEmailTimeStamp());		
	}

	@When("User has entered invalid password {string} into password field")
	public void user_has_entered_invalid_password_into_password_field(String invalidPasswordText) {
		driver.findElement(By.id("input-password")).sendKeys(invalidPasswordText);	
	}

	@Then("User should not get logged in and should get a proper warning message about credentials mismatch")
	public void user_should_not_get_logged_in_and_should_get_a_proper_warning_message_about_credentials_mismatch() {
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, \"alert-dismissible\")]")).getText();
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));		
	}

	@When("User does not enter email address into the email field")
	public void user_does_not_enter_email_address_into_the_email_field() {
		driver.findElement(By.id("input-email")).sendKeys("");
	}

	@When("User does not enter password into password field")
	public void user_does_not_enter_password_into_password_field() {
		driver.findElement(By.id("input-password")).sendKeys("");		
	}
	
	private String getEmailTimeStamp() {
		Date date = new Date();
		return "testauto" + date.toString().replace(" ", "_").replace(":", "_") + "@gmail.com";
	}

}
