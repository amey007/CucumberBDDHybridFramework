package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ElementUtils;

public class LoginPage {
	
	private WebDriver driver;
	private ElementUtils elemUtils;
	
	//Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
		elemUtils = new ElementUtils(driver);
	}
	
	// Object Repository
	
	@FindBy(id = "input-email")
	private WebElement emailField;
	
	@FindBy(id = "input-password")
	private WebElement passwordField;
	
	@FindBy(xpath = "//input[@type = 'submit']")
	private WebElement loginBtn;
	
	@FindBy(xpath = "//div[contains(@class, \"alert-dismissible\")]")
	private WebElement noEmailMatchWarning;
	
//	@FindBy()
//	private WebElement ;
	
	// Page Actions
	public void enterEmailAddress(String emailText) {
		elemUtils.typeTextIntoElement(emailField, emailText, 15);
	}
	
	public void enterPassword(String passwordText) {
		elemUtils.typeTextIntoElement(passwordField, passwordText, 15);
	}
	
	public AccountPage clickOnLoginBtn() {
		elemUtils.clickOnElement(loginBtn, 15);
		return new AccountPage(driver);
	}
	
	public String retrieveTextForNoEmailMatchWarning() {
		return elemUtils.retrieveTextFromElement(noEmailMatchWarning, 15);	
	}
	
}
