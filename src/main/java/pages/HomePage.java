package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
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
		elemUtils.clickOnElement(myAccountDropDown, CommonUtils.EXPLICIT_WAIT_TIME);
	}

	public LoginPage selectLoginOption() {
		elemUtils.clickOnElement(loginOption, CommonUtils.EXPLICIT_WAIT_TIME);
		return new LoginPage(driver);
	}
	
	public RegisterPage selectRegisterOption() {
		elemUtils.clickOnElement(registerOption, CommonUtils.EXPLICIT_WAIT_TIME);
		return new RegisterPage(driver);
	}
	
	public void enterProductInSearchBoxField(String product) {
		elemUtils.typeTextIntoElement(searchBox, product, CommonUtils.EXPLICIT_WAIT_TIME);
	}
	
	public SearchResultsPage clickOnSearchBtn() {
		elemUtils.clickOnElement(searchBtn, CommonUtils.EXPLICIT_WAIT_TIME);
		return new SearchResultsPage(driver);
	}

}
