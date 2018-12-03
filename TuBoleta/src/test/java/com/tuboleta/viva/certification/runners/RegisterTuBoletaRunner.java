package com.tuboleta.viva.certification.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "features\\register_tu_boleta.Feature",
		glue = "com.tuboleta.viva.certification.stepdefinitions",
		snippets = SnippetType.CAMELCASE
		)

public class RegisterTuBoletaRunner {

}
