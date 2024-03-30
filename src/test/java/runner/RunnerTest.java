package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", 
				 glue = { "stepdefinitions", "hooks" },
				 plugin = {"pretty", "json:target/json/file.json","html:target/CucumberReports/CucumberReport.html"},
				 publish = true)
public class RunnerTest {

}
	