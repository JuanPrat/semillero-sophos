package com.newtours.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "features/LoginNewTours.Feature",
		glue = "com.newtours.stepDefinitions",
		plugin = {"pretty", "html:cucumberReports/indexReport.html"},
		monochrome = true,
		strict = true)
public class NewToursRunner {

}
