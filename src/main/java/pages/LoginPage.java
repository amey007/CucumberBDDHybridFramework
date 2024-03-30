package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	//Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);			
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
		emailField.sendKeys(emailText);
	}
	
	public void enterPassword(String passwordText) {
		passwordField.sendKeys(passwordText);
	}
	
	public AccountPage clickOnLoginBtn() {
		loginBtn.click();
		return new AccountPage(driver);
	}
	
	public String retrieveTextForNoEmailMatchWarning() {
		return noEmailMatchWarning.getText();	
	}
	
}
