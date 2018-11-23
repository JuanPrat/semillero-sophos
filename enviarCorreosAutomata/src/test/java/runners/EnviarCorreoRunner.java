package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:cucumberReports/indexReport.html"},
monochrome = true,
strict = true, 
features="features/EntrarAGmail.Feature",
glue = "StepDefinitions", 
tags = "@tag1")

public class EnviarCorreoRunner {

}
