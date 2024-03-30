package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
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
		elemUtils.typeTextIntoElement(firstNameField, firstNameText, CommonUtils.EXPLICIT_WAIT_TIME);		
	}
	
	public void enterLastName(String lastNameText) {
		elemUtils.typeTextIntoElement(lastNameField, lastNameText, CommonUtils.EXPLICIT_WAIT_TIME);
	}
	
	public void enterEmailAddress(String emailAddressText) {
		elemUtils.typeTextIntoElement(emailAddressField, emailAddressText, CommonUtils.EXPLICIT_WAIT_TIME);		
	}
	
	public void enterTelephoneNumber(String telephoneText) {
		elemUtils.typeTextIntoElement(telephoneField, telephoneText, CommonUtils.EXPLICIT_WAIT_TIME);
	}
	
	public void enterPassword(String passwordText) {
		elemUtils.typeTextIntoElement(passwordField, passwordText, CommonUtils.EXPLICIT_WAIT_TIME);
	}
	
	public void enterConfirmPassword(String confirmPasswordText) {
		elemUtils.typeTextIntoElement(confirmPasswordField, confirmPasswordText, CommonUtils.EXPLICIT_WAIT_TIME);
	}
	
	public void selectYesNewsletterCheckboxField() {
		elemUtils.clickOnElement(yesNewsletterCheckBox, CommonUtils.EXPLICIT_WAIT_TIME);
	}
	
	public void selectPrivacyPolicy() {
		elemUtils.clickOnElement(privacyPolicyBox, CommonUtils.EXPLICIT_WAIT_TIME);
	}
	
	public AccountSuccessPage clickOnContinueBtn(){
		elemUtils.clickOnElement(continueBtn, CommonUtils.EXPLICIT_WAIT_TIME);
		return new AccountSuccessPage(driver);
	}

	public String retriveTextForDuplicateEmailWarning() {
		return elemUtils.retrieveTextFromElement(duplicateEmailWarning, CommonUtils.EXPLICIT_WAIT_TIME);
	}
	
	public String retriveTextForPolicyWarning() {
		return elemUtils.retrieveTextFromElement(policyWarning, CommonUtils.EXPLICIT_WAIT_TIME);
	}
	
	public String retriveTextForFirstNameWarning() {
		return elemUtils.retrieveTextFromElement(firstNameWarning, CommonUtils.EXPLICIT_WAIT_TIME);
	}
	
	public String retriveTextForLastNameWarning() {
		return elemUtils.retrieveTextFromElement(lastNameWarning, CommonUtils.EXPLICIT_WAIT_TIME);
	}
	
	public String retriveTextForEmailAddressWarning() {
		return elemUtils.retrieveTextFromElement(emailAddressWarning, CommonUtils.EXPLICIT_WAIT_TIME);
	}
	
	public String retriveTextForTelephoneWarning() {
		return elemUtils.retrieveTextFromElement(telephoneWarning, CommonUtils.EXPLICIT_WAIT_TIME);
	}
	
	public String retriveTextForPasswordWarning() {
		return elemUtils.retrieveTextFromElement(passwordWarning, CommonUtils.EXPLICIT_WAIT_TIME);
	}
	
	
}
