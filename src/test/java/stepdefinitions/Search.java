package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SearchResultsPage;

public class Search {
	
	private WebDriver driver;
	private HomePage homePage;
	private SearchResultsPage searchResultsPage;
	
	@Given("User is on the Home page")
	public void user_is_on_the_home_page() {
		driver = DriverFactory.getDriver();
		homePage = new HomePage(driver);
	}

	@When("User enters valid product {string} in the search box field")
	public void user_enters_valid_product_in_the_search_box_field(String validProductText) {
		homePage.enterProductInSearchBoxField(validProductText);
	}

	@When("User clicks on Search button")
	public void user_clicks_on_search_button() {
		searchResultsPage = homePage.clickOnSearchBtn();
	}

	@Then("User should get valid products displayed in search results")
	public void user_should_get_valid_products_displayed_in_search_results() {
		Assert.assertTrue(searchResultsPage.retriveDisplayStatusOfValidProductResult());
	}

	@When("User enters invalid product {string} in the search box field")
	public void user_enters_invalid_product_in_the_search_box_field(String invalidProductText) {
		homePage.enterProductInSearchBoxField(invalidProductText);		
	}

	@Then("User should get proper message about no product matching")
	public void user_should_get_proper_message_about_no_product_matching() {
		Assert.assertEquals("There is no product that matches the search criteria.", searchResultsPage.retrieveTextFromNoProductFoundMessageField());		
	}

	@When("User does not enter any product in the search box field")
	public void user_does_not_enter_any_product_in_the_search_box_field() {
		// Intentionally left blank
	}

}
