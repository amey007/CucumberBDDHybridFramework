package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	private WebDriver driver;

	// Constructor for loading the locators
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Object Repository
	@FindBy(xpath = "//span[text() = 'My Account']")
	private WebElement myAccountDropDown;

	@FindBy(linkText = "Login")
	private WebElement loginOption;

	@FindBy(linkText = "Register")
	private WebElement registerOption;
	
	@FindBy(name = "search")
	private WebElement searchBox;
	
	@FindBy(xpath = "//button[contains(@class,'btn-default btn-lg')]")
	private WebElement searchBtn;

	// Page Actions
	public void clickOnMyAcct() {
		myAccountDropDown.click();
	}

	public LoginPage selectLoginOption() {
		loginOption.click();
		return new LoginPage(driver);
	}
	
	public RegisterPage selectRegisterOption() {
		registerOption.click();
		return new RegisterPage(driver);
	}
	
	public void enterProductInSearchBoxField(String product) {
		searchBox.sendKeys(product);
	}
	
	public SearchResultsPage clickOnSearchBtn() {
		searchBtn.click();
		return new SearchResultsPage(driver);
	}

}
