package factory;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import utils.CommonUtils;
import utils.ConfigReader;

public class DriverFactory {
	
	static WebDriver driver = null;
	
	public static WebDriver initializeBrowser(String browserName) {
		ConfigReader configReader = new ConfigReader();
		Properties prop = configReader.initializeProperties();
		
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}else if (browserName.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(CommonUtils.IMPLICIT_WAIT_TIME));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(CommonUtils.PAGE_LOAD_TIME));
		driver.get(prop.getProperty("url"));
		
		return driver;
		
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
}
