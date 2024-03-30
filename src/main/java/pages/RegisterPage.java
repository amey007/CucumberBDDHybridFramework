package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	private WebDriver driver;

	// Constructor
	public RegisterPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
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
		firstNameField.sendKeys(firstNameText);		
	}
	
	public void enterLastName(String lastNameText) {
		lastNameField.sendKeys(lastNameText);
	}
	
	public void enterEmailAddress(String emailAddressText) {
		emailAddressField.sendKeys(emailAddressText);		
	}
	
	public void enterTelephoneNumber(String telephoneText) {
		telephoneField.sendKeys(telephoneText);
	}
	
	public void enterPassword(String passwordText) {
		passwordField.sendKeys(passwordText);
	}
	
	public void enterConfirmPassword(String confirmPasswordText) {
		confirmPasswordField.sendKeys(confirmPasswordText);
	}
	
	public void selectYesNewsletterCheckboxField() {
		yesNewsletterCheckBox.click();
	}
	
	public void selectPrivacyPolicy() {
		privacyPolicyBox.click();
	}
	
	public AccountSuccessPage clickOnContinueBtn(){
		continueBtn.click();
		return new AccountSuccessPage(driver);
	}

	public String retriveTextForDuplicateEmailWarning() {
		return duplicateEmailWarning.getText();
	}
	
	public String retriveTextForPolicyWarning() {
		return policyWarning.getText();
	}
	
	public String retriveTextForFirstNameWarning() {
		return firstNameWarning.getText();
	}
	
	public String retriveTextForLastNameWarning() {
		return lastNameWarning.getText();
	}
	
	public String retriveTextForEmailAddressWarning() {
		return emailAddressWarning.getText();
	}
	
	public String retriveTextForTelephoneWarning() {
		return telephoneWarning.getText();
	}
	
	public String retriveTextForPasswordWarning() {
		return passwordWarning.getText();
	}
	
	
}
