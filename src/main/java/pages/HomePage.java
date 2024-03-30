package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ElementUtils;

public class HomePage {

	private WebDriver driver;
	private ElementUtils elemUtils;

	// Constructor for loading the locators
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		elemUtils = new ElementUtils(driver);
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
		elemUtils.clickOnElement(myAccountDropDown, 15);
	}

	public LoginPage selectLoginOption() {
		elemUtils.clickOnElement(loginOption, 15);
		return new LoginPage(driver);
	}
	
	public RegisterPage selectRegisterOption() {
		elemUtils.clickOnElement(registerOption, 15);
		return new RegisterPage(driver);
	}
	
	public void enterProductInSearchBoxField(String product) {
		elemUtils.typeTextIntoElement(searchBox, product, 15);
	}
	
	public SearchResultsPage clickOnSearchBtn() {
		elemUtils.clickOnElement(searchBtn, 15);
		return new SearchResultsPage(driver);
	}

}
