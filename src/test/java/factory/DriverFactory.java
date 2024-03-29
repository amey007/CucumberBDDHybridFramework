package factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {
	
	static WebDriver driver = null;
	
	public static void initializeBrowser(String browserName) {
		
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");
		
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
}
