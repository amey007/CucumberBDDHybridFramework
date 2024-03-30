package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage {

	private WebDriver driver;

	// Constructor
	public SearchResultsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Page Objects

	@FindBy(linkText = "HP LP3065")
	private WebElement validProductResult;
	
	@FindBy(xpath = "//input[@id = 'button-search']//following-sibling::p")
	private WebElement noProductFoundMessageField;

	// Page Actions

	public boolean retriveDisplayStatusOfValidProductResult() {
		return validProductResult.isDisplayed();
	}
	
	public String retrieveTextFromNoProductFoundMessageField() {
		return noProductFoundMessageField.getText();
	}

}
