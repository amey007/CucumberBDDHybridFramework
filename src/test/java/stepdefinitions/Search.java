package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	
	WebDriver driver;
	
	@Given("User is on the Home page")
	public void user_is_on_the_home_page() {
		driver = DriverFactory.getDriver();
	}

	@When("User enters valid product {string} in the search box field")
	public void user_enters_valid_product_in_the_search_box_field(String validProductText) {
		driver.findElement(By.name("search")).sendKeys(validProductText);		
	}

	@When("User clicks on Search button")
	public void user_clicks_on_search_button() {
		driver.findElement(By.xpath("//button[contains(@class,'btn-default btn-lg')]")).click();		
	}

	@Then("User should get valid products displayed in search results")
	public void user_should_get_valid_products_displayed_in_search_results() {
		Assert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed());		
	}

	@When("User enters invalid product {string} in the search box field")
	public void user_enters_invalid_product_in_the_search_box_field(String invalidProductText) {
		driver.findElement(By.name("search")).sendKeys(invalidProductText);		
	}

	@Then("User should get proper message about no product matching")
	public void user_should_get_proper_message_about_no_product_matching() {
		Assert.assertEquals("There is no product that matches the search criteria.", driver.findElement(By.xpath("//input[@id = 'button-search']//following-sibling::p")).getText());		
	}

	@When("User does not enter any product in the search box field")
	public void user_does_not_enter_any_product_in_the_search_box_field() {
		// Intentionally left blank
	}

}
