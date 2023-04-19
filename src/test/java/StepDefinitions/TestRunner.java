package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features", 
		glue= {"StepDefinitions"}, 
		
monochrome = true,

//Reports different types of generate reports under target folder
plugin = {"pretty","html:target/HtmlReports/report.html",
"junit:target/JUnitReports/report.xml",
"json:target/JSONReports/report.json"},
		
		tags="@smoketest"
		


)

public class TestRunner {

}
 