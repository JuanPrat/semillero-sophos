package co.com.google.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty" , "html:cucumberReports/indexReport.html"},
features="features/BuscarEnGoogle.Feature",
glue = "co.com.google.StepDefinitions", 
tags = "@tag1")

public class BuscarEnGoogleRunner {

}


