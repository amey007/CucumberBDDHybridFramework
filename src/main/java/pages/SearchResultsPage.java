package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.ElementUtils;

public class SearchResultsPage {

	private WebDriver driver;
	private ElementUtils elemUtils;

	// Constructor
	public SearchResultsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
		elemUtils = new ElementUtils(driver);
	}

	// Page Objects

	@FindBy(linkText = "HP LP3065")
	private WebElement validProductResult;
	
	@FindBy(xpath = "//input[@id = 'button-search']//following-sibling::p")
	private WebElement noProductFoundMessageField;

	// Page Actions

	public boolean retriveDisplayStatusOfValidProductResult() {
		return elemUtils.checkElementIsDisplayed(validProductResult, CommonUtils.EXPLICIT_WAIT_TIME);
	}
	
	public String retrieveTextFromNoProductFoundMessageField() {
		return elemUtils.retrieveTextFromElement(noProductFoundMessageField, CommonUtils.EXPLICIT_WAIT_TIME);
	}

}
