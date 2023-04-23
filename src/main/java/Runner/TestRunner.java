package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
		"/Users/loyoladsouza/Desktop/QA/SeleniumWorkspace/FreeCrmBDDFramework/src/main/java/Features/contact.feature" }, glue = {
				"stepDefinitions" }, plugin = { "pretty", "html:html-output/cucumber.html",
						"json:json_output/cucumber.json",
						"junit:junit_xml/cucumber.xml" }, dryRun = false, monochrome = true)

public class TestRunner {

}
