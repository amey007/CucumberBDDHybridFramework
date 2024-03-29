package hooks;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks {

	WebDriver driver;

	@Before
	public void setup() {
		DriverFactory.initializeBrowser("chrome");
		driver = DriverFactory.getDriver();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

}
