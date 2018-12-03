package com.tuboleta.viva.certification.stepdefinitions;

import java.util.List;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import static org.hamcrest.CoreMatchers.containsString;

import com.tuboleta.viva.certification.questions.TheAccountName;
import com.tuboleta.viva.certification.tasks.ClickOn;
import com.tuboleta.viva.certification.tasks.FillTheLoginData;
import com.tuboleta.viva.certification.tasks.OpenThePage;
import com.tuboleta.viva.certification.ui.TuBoletaMainPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.PersonalData;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class LogInStepDefinition {
	
	Actor juan = Actor.named("juan");
	
	TuBoletaMainPage TuBoletaMainPage;
	
	@Managed(driver = "chrome") 					//@Managed le dice a serenity que es una prueba web
	WebDriver hisBrowser;							// se encargará de instanciar el driver, abrir la pagina y cerrarla al terminar el test
	
	@Before
	public void setUp() {
		juan.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^juan is in the tuboleta page$")
	public void juan_is_in_the_tuboleta_page() {
	    // Write code here that turns the phrase above into concrete actions
	    juan.attemptsTo(OpenThePage.at(TuBoletaMainPage));
	}


	@When("^juan clicks ingresar button$")
	public void juan_clicks_ingresar_button() {
	    // Write code here that turns the phrase above into concrete actions
	    juan.attemptsTo(ClickOn.TheButton(TuBoletaMainPage.LOGIN_BUTTON));
	}

	@When("^juan login with his account and his password$")
	public void juan_login_with_his_account_and_his_password(List<PersonalData> loginData) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc).
	    // Field names for YourType must match the column names in 
	    // your feature file (except for spaces and capitalization).
	    juan.attemptsTo(FillTheLoginData.with(loginData.get(0)));
	}

	@Then("^juan checks he has logedin$")
	public void juan_checks_he_has_logedin() {
	    // Write code here that turns the phrase above into concrete actions
		juan.should(seeThat(TheAccountName.displayed(), containsString(this.juan.getName())));
	}
	
	

}
