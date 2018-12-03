package com.tuboleta.viva.certification.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.tuboleta.viva.certification.tasks.ClickOn;
import com.tuboleta.viva.certification.tasks.OpenThePage;
import com.tuboleta.viva.certification.tasks.PickConcert;
import com.tuboleta.viva.certification.ui.TuBoletaMainPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class SearchForConcertStepDefinition {
	
	Actor juan = Actor.named("juan");
	
	TuBoletaMainPage TuBoletaMainPage;
	
	@Managed(driver = "chrome") 					//@Managed le dice a serenity que es una prueba web
	WebDriver hisBrowser;							// se encargará de instanciar el driver, abrir la pagina y cerrarla al terminar el test
	
	@Before
	public void setUp() {
		juan.can(BrowseTheWeb.with(hisBrowser));
	}

	@Given("^juan is in tuboleta page$")
	public void juan_is_in_tuboleta_page() {
	    // Write code here that turns the phrase above into concrete actions
	    juan.attemptsTo(OpenThePage.at(TuBoletaMainPage));
	}
	
	@When("^juan search for concerts$")
	public void juan_search_for() {
	    // Write code here that turns the phrase above into concrete actions
	    juan.attemptsTo(ClickOn.TheButton(TuBoletaMainPage.CONCERTS_BUTTON));
	}
	
	@Then("^juan randomly pick one concert$")
	public void juan_randomly_pick_one_concert() {
	    // Write code here that turns the phrase above into concrete actions
	    juan.attemptsTo(PickConcert.inTheCataloge(hisBrowser));
	}

}
