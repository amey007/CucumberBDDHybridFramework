package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ElementUtils;

public class AccountSuccessPage {
	
	private WebDriver driver;
	private ElementUtils elemUtils;
	
	// Constructor
	public AccountSuccessPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
		elemUtils = new ElementUtils(driver);
	}
	
	// Page Objects
	
	@FindBy(xpath = "//div[@id = 'content']/h1")
	private WebElement accountCreatedSuccessMessage;
	
	// Page Actions
	
	public String retriveTextFromAccountCreatedSuccessMessageField() {
		return elemUtils.retrieveTextFromElement(accountCreatedSuccessMessage, 15);
	}

}
