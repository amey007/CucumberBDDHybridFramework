package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ElementUtils;

public class RegisterPage {
	
	private WebDriver driver;
	private ElementUtils elemUtils;

	// Constructor
	public RegisterPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
		elemUtils = new ElementUtils(driver);
	}
	
	// Page Objects
	@FindBy(id = "input-firstname")
	private WebElement firstNameField;
	
	@FindBy(id = "input-lastname")
	private WebElement lastNameField;
	
	@FindBy(id = "input-email")
	private WebElement emailAddressField;
	
	@FindBy(id = "input-telephone")
	private WebElement telephoneField;
	
	@FindBy(id = "input-password")
	private WebElement passwordField;
	
	@FindBy(id = "input-confirm")
	private WebElement confirmPasswordField;
	
	@FindBy(name = "agree")
	private WebElement privacyPolicyBox;
	
	@FindBy(xpath = "//input[@type = 'submit']")
	private WebElement continueBtn;
	// Move to acctsuccessPage
	
	@FindBy(xpath = "//input[@name = 'newsletter' and @value = '1']")
	private WebElement yesNewsletterCheckBox;
	
	@FindBy(xpath = "//div[contains(@class, \"alert-dismissible\")]")
	private WebElement duplicateEmailWarning;
	
	@FindBy(xpath = "//div[contains(@class, \"alert-dismissible\")]")
	private WebElement policyWarning;
	
	@FindBy(xpath = "//input[@id = 'input-firstname']//following-sibling::div")
	private WebElement firstNameWarning;
	
	@FindBy(xpath = "//input[@id = 'input-lastname']//following-sibling::div")
	private WebElement lastNameWarning;
	
	@FindBy(xpath = "//input[@id = 'input-email']//following-sibling::div")
	private WebElement emailAddressWarning;
	
	@FindBy(xpath = "//input[@id = 'input-telephone']//following-sibling::div")
	private WebElement telephoneWarning;
	
	@FindBy(xpath = "//input[@id = 'input-password']//following-sibling::div")
	private WebElement passwordWarning;
	
	
	// Page Actions
	
	public void enterFirstName(String firstNameText) {
		elemUtils.typeTextIntoElement(firstNameField, firstNameText, 15);		
	}
	
	public void enterLastName(String lastNameText) {
		elemUtils.typeTextIntoElement(lastNameField, lastNameText, 15);
	}
	
	public void enterEmailAddress(String emailAddressText) {
		elemUtils.typeTextIntoElement(emailAddressField, emailAddressText, 15);		
	}
	
	public void enterTelephoneNumber(String telephoneText) {
		elemUtils.typeTextIntoElement(telephoneField, telephoneText, 15);
	}
	
	public void enterPassword(String passwordText) {
		elemUtils.typeTextIntoElement(passwordField, passwordText, 15);
	}
	
	public void enterConfirmPassword(String confirmPasswordText) {
		elemUtils.typeTextIntoElement(confirmPasswordField, confirmPasswordText, 15);
	}
	
	public void selectYesNewsletterCheckboxField() {
		elemUtils.clickOnElement(yesNewsletterCheckBox, 15);
	}
	
	public void selectPrivacyPolicy() {
		elemUtils.clickOnElement(privacyPolicyBox, 15);
	}
	
	public AccountSuccessPage clickOnContinueBtn(){
		elemUtils.clickOnElement(continueBtn, 15);
		return new AccountSuccessPage(driver);
	}

	public String retriveTextForDuplicateEmailWarning() {
		return elemUtils.retrieveTextFromElement(duplicateEmailWarning, 15);
	}
	
	public String retriveTextForPolicyWarning() {
		return elemUtils.retrieveTextFromElement(policyWarning, 15);
	}
	
	public String retriveTextForFirstNameWarning() {
		return elemUtils.retrieveTextFromElement(firstNameWarning, 15);
	}
	
	public String retriveTextForLastNameWarning() {
		return elemUtils.retrieveTextFromElement(lastNameWarning, 15);
	}
	
	public String retriveTextForEmailAddressWarning() {
		return elemUtils.retrieveTextFromElement(emailAddressWarning, 15);
	}
	
	public String retriveTextForTelephoneWarning() {
		return elemUtils.retrieveTextFromElement(telephoneWarning, 15);
	}
	
	public String retriveTextForPasswordWarning() {
		return elemUtils.retrieveTextFromElement(passwordWarning, 15);
	}
	
	
}
