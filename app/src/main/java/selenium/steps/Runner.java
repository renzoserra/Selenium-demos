package selenium.steps;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src\\main\\java\\selenium\\feature",
    glue = "selenium/steps",
    publish = true,
    plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
    snippets = CucumberOptions.SnippetType.CAMELCASE,
    monochrome = true,
    tags = "@orangehrm"
)


public class Runner {
    
}
