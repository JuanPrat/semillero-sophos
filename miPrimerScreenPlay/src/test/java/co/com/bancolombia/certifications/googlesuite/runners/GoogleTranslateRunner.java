package co.com.bancolombia.certifications.googlesuite.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
	features = "src\\test\\resourses\\features\\googleTranslate.Feature",
	glue = "co.com.bancolombia.certifications.googlesuite.stepdefinitions",
	snippets = SnippetType.CAMELCASE,
	plugin = {"pretty" , "html:cucumberReports/indexReport.html"})

public class GoogleTranslateRunner {

}
