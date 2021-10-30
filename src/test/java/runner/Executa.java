package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/feature",
		glue = "steps",
		tags = "@tag",
		dryRun = false,
		plugin = {"pretty","json:target/report.json","html:target/report.html"},
		monochrome = true
		)
public class Executa {

}
