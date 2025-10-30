package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(
        features = "src/test/resources/features/google.feature",       // Path to your .feature files
        glue = "stepDef",                     // Package containing step definitions
        plugin = {
                "pretty",
                "html:build/reports/cucumber-report.html",
                "json:build/reports/cucumber-report.json"
        },
        monochrome = true


)
// Make sure to extend AbstractTestNGCucumberTests
public class RunCucumberTest extends AbstractTestNGCucumberTests {

}