package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {

	@Given("User navigates to register account page")
	public void user_navigates_to_register_account_page() {
		
	}

	@When("User enters the details into below fields")
	public void user_enters_the_details_into_below_fields(DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		
	}

	@When("User selects privacy policy")
	public void user_selects_privacy_policy() {
		
	}

	@When("User clicks on Continue button")
	public void user_clicks_on_continue_button() {
		
	}

	@Then("User account should be created successfully")
	public void user_account_should_be_created_successfully() {
		
	}

	@When("User selects Yes for Newsletter")
	public void user_selects_yes_for_newsletter() {
		
	}

	@Then("User account should not be created and should get proper warning about duplicate email")
	public void user_account_should_not_be_created_and_should_get_proper_warning_about_duplicate_email() {
		
	}

	@When("User does not enter any details into fields")
	public void user_does_not_enter_any_details_into_fields() {
		
	}

	@Then("User should get proper warning for every mandatory field")
	public void user_should_get_proper_warning_for_every_mandatory_field() {
		
	}

}
