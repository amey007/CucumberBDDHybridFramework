package utils;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtils {
	
	private WebDriver driver;
	
	public ElementUtils(WebDriver driver) {
		this.driver = driver;		
	}
	
	public void clickOnElement(WebElement element, long durationInSeconds) {
		WebElement elem = waitForElementToBeClickable(element, durationInSeconds);
		elem.click();
	}
	
	public void typeTextIntoElement(WebElement element, String textToBeTyped, long durationInSeconds) {
		WebElement elem = waitForElementToBeClickable(element, durationInSeconds);
		elem.click();
		elem.clear();
		elem.sendKeys(textToBeTyped);
	}
	
	public WebElement waitForElementToBeClickable(WebElement element, long durationInSeconds) {
		WebElement elem = null;
		try {
			WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(durationInSeconds));
			elem =  wait.until(ExpectedConditions.elementToBeClickable(element));
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return elem;
	}
	
	public WebElement waitForElementToBeVisible(WebElement element, long durationInSeconds) {
		WebElement elem = null;
		try {
			WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(durationInSeconds));
			elem =  wait.until(ExpectedConditions.visibilityOf(element));
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return elem;
	}
	
	public void selectOptionInDropDown(WebElement element, String dropDownOption, long durationInSeconds) {
		WebElement elem = waitForElementToBeClickable(element, durationInSeconds);
		Select select = new Select(elem);
		select.selectByVisibleText(dropDownOption);
	}
	
	public void acceptAlert(long durationInSeconds) {
		Alert alert = waitForAlert(durationInSeconds);
		alert.accept();		
	}
	
	public void dismissAlert(long durationInSeconds) {
		Alert alert = waitForAlert(durationInSeconds);
		alert.dismiss();		
	}
	
	public Alert waitForAlert(long durationInSeconds) {
		Alert alert = null;
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(durationInSeconds));
			alert = wait.until(ExpectedConditions.alertIsPresent());
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return alert;
	}
	
	public void mouseHoverAndClick(WebElement element, long durationInSeconds) {
		WebElement elem = waitForElementToBeVisible(element, durationInSeconds);
		Actions actions = new Actions(driver);
		actions.moveToElement(elem);
		actions.click(elem).build().perform();		
	}
	
	public void javaScriptClick(WebElement element, long durationInSeconds) {
		WebElement elem = waitForElementToBeVisible(element, durationInSeconds);
		JavascriptExecutor jse = ((JavascriptExecutor)driver);
		jse.executeScript("arguments[0].click();", elem);
	}
	
	public void javaScriptTypeText(WebElement element, long durationInSeconds, String textToBeTyped) {
		WebElement elem = waitForElementToBeVisible(element, durationInSeconds);
		JavascriptExecutor jse = ((JavascriptExecutor)driver);
		jse.executeScript("arguments[0].value='"+textToBeTyped+"'", elem);
	}
	
	public String retrieveTextFromElement(WebElement element, long durationInSeconds) {
		WebElement elem = waitForElementToBeVisible(element, durationInSeconds);
		return elem.getText();		
	}
	
	public boolean checkElementIsDisplayed(WebElement element, long durationInSeconds) {
		try {
			WebElement elem = waitForElementToBeVisible(element, durationInSeconds);
			return elem.isDisplayed();
		}catch (Exception e) {
			return false;
		}
	}


}
