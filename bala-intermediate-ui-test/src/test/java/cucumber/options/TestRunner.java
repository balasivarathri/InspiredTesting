package cucumber.options;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        features = "src/test/java/org/features",
        glue = "org.stepdefinitions",
        plugin = {"json:target/jsonReports/cucumber-reports.json"}
            )

public class TestRunner {

}
