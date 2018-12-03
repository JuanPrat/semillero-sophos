package com.tuboleta.viva.certification.stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.tuboleta.viva.certification.interactions.ScrollToJoinNowButton;
import com.tuboleta.viva.certification.questions.TuBoletaPageIsVisible;
import com.tuboleta.viva.certification.tasks.ClickOn;
import com.tuboleta.viva.certification.tasks.FillTheRegisterData;
import com.tuboleta.viva.certification.tasks.OpenThePage;
import com.tuboleta.viva.certification.ui.TuBoletaMainPage;
import com.tuboleta.viva.certification.ui.TuBoletaRegisterPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import exceptions.UnableToConnect;
import model.PersonalData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class RegisterTuBoletaStepDefinition {
	
	//iniciamos el driver
	@Managed(driver = "Chrome")
	WebDriver hisDriver;
	
	//definimos el actor para le metodo
	private Actor juan = Actor.named("juan");
	
	@Before
	public void setingUp() {
		juan.can(BrowseTheWeb.with(hisDriver));
	}
	
	TuBoletaMainPage tuBoletaMainPage;
	TuBoletaRegisterPage tuBoletaRegisterPage;
	

	@Given("^juan goes to tu boleta page$")
	public void juanGoesToTuBoletaPage() {
    // Write code here that turns the phrase above into concrete actions
		juan.wasAbleTo(OpenThePage.at(tuBoletaMainPage));
	}
	
	@Then("^juan should see the tu boleta main page$")
	public void juan_should_see_the_tu_boleta_main_page() {
	    // Write code here that turns the phrase above into concrete actions
	    juan.should(seeThat(TuBoletaPageIsVisible.hasLoaded()).orComplainWith(UnableToConnect.class, UnableToConnect.getConnectionMessage()));
	}

	@When("^juan clicks register button$")
	public void juan_clicks_register_button() {
    // Write code here that turns the phrase above into concrete actions
		juan.wasAbleTo(ClickOn.TheButton(tuBoletaMainPage.REGISTER_BUTTON));
	}

	@When("^juan fills the requested data$")
	public void juan_fills_the_requested_data(List<PersonalData> registerData) { //pasamos la datatable a lista
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc).
    // Field names for YourType must match the column names in 
    // your feature file (except for spaces and capitalization).
		juan.attemptsTo(FillTheRegisterData.with(registerData.get(0))); //enviamos los datos alojados en la lista del primer nodo
		
	}

@Then("^juan clicks join now$")
	public void juan_clicks_join_now() {
    // Write code here that turns the phrase above into concrete actions
		juan.attemptsTo(ScrollToJoinNowButton.to(TuBoletaRegisterPage.BAIT));
    	juan.attemptsTo(ClickOn.TheButton(TuBoletaRegisterPage.JOIN_NOW_BUTTON));
	}
@Then("^juan clicks the tuboleta Homebutton$")
public void juan_clicks_the_tuboleta_Homebutton() {
    // Write code here that turns the phrase above into concrete actions
    juan.attemptsTo(ClickOn.TheButton(TuBoletaMainPage.HOME_BUTTON));
}

}
