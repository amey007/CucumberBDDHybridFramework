package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ElementUtils;

public class AccountPage {

	private WebDriver driver;
	private ElementUtils elemUtils;
	
	//Constructor
	public AccountPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
		elemUtils = new ElementUtils(driver);
	}
	
	// Page Objects
	
	@FindBy(linkText = "Edit your account information")
	private WebElement editAcctInfoLink;
	
	
	// Page Actions 
	public boolean displayStatusOfEditAcctInfoLink() {
		return elemUtils.checkElementIsDisplayed(editAcctInfoLink, 15);
	}

}
