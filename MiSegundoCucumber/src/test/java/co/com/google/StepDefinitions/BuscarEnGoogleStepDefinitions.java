package co.com.google.StepDefinitions;

import co.com.google.runners.BuscarEnGooglePOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuscarEnGoogleStepDefinitions {
	
	@Given("Que abro el navegador")
	public void que_abro_el_navegador() {
	    // Write code here that turns the phrase above into concrete actions
	    BuscarEnGooglePOM.BuscarEnGooglePOM();
	}

	@When("que voy a google")
	public void que_voy_a_google() {
	    // Write code here that turns the phrase above into concrete actions
	    BuscarEnGooglePOM.Getpage();
	}

	@When("^realizo una busqueda de \"([^\"]*)\"$")
	public void realizo_una_busqueda_de(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    BuscarEnGooglePOM.Type("q", string);
	}

	@Then("^valido que busco lo que muestra es relacionado con \"([^\"]*)\"$")
	public void valido_que_busco_lo_que_muestra_es_relacionado_con(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    BuscarEnGooglePOM.Validar(string);
	}
}
