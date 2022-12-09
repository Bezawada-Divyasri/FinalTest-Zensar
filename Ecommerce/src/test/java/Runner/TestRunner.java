package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".\\Features\\Orders.feature",
		glue="OrdersStepDefination",
		dryRun=false,
		monochrome=true
		)
public class TestRunner {

}
