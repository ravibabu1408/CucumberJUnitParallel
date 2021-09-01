package parallel;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun=false,
		monochrome=true,
				plugin = {"pretty",
				        "html:target/cucumberHtmlReport",
				        "json:target/jsonReports/cucumber-report.json",
				        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				    }, // Plugin to generate HTML report and json report
        features = "src/test/resources/parallel",
        glue={"parallel"},
        tags= "@tag1"
        )
 
public class TestRunner{
	


}

	