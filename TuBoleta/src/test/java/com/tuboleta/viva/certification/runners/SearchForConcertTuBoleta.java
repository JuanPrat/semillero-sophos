package com.tuboleta.viva.certification.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		glue = "com.tuboleta.viva.certification.stepdefinitions",
		features = "features\\search_for_concert_tu_boleta.Feature",
		snippets = SnippetType.CAMELCASE
		)

public class SearchForConcertTuBoleta {

}
