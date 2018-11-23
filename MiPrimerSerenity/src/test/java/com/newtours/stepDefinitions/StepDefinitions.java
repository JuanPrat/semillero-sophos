package com.newtours.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class StepDefinitions {

	@Steps
	LoginSteps login;
	
	@Given("^The newtours login page$")
	public void the_newtours_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    login.OpenApplication();
	}

	@When("^i fill the user and password$")
	public void i_fill_the_user_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    login.WriteData();
	}

	@When("^click submit button$")
	public void click_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    login.SendData();
	}

	@Then("^i access to a new page$")
	public void i_access_to_a_new_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("funcionó");
	}
}
