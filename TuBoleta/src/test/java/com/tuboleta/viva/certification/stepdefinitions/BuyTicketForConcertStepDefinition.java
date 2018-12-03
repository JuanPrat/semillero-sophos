package com.tuboleta.viva.certification.stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.tuboleta.viva.certification.interactions.ScrollToGoToPayButton;
import com.tuboleta.viva.certification.interactions.ScrollToGoToPayButton2;
import com.tuboleta.viva.certification.questions.TheConcertNamesAreEqual;
import com.tuboleta.viva.certification.questions.TheYellowBuyButtonIsVisible;
import com.tuboleta.viva.certification.tasks.ClickOn;
import com.tuboleta.viva.certification.tasks.FillTheFinancialRequestedData;
import com.tuboleta.viva.certification.tasks.FillTheTicketInfo;
import com.tuboleta.viva.certification.ui.TuBoletaChooseTicketPage;
import com.tuboleta.viva.certification.ui.TuBoletaConcertPage;
import com.tuboleta.viva.certification.ui.TuBoletaConfirmAndGoToPayPage;
import com.tuboleta.viva.certification.ui.TuBoletaConfirmAndGoToPayPage2;
import com.tuboleta.viva.certification.ui.TuBoletaSendPayPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import exceptions.NoMatchingBuyButtonIsVisible;
import model.ConcertData;
import model.FinancialData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.containsString;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.findby.By;

public class BuyTicketForConcertStepDefinition {
	
	Actor juan = Actor.named("juan");
	ConcertData concertName; //esta variable global guardará el nombre del concierto para el momento
						//de querer validar que el concierto al que vamos a comprar boletas
						//es el previamente seleccionado
	
	@Managed(driver = "chrome")
	WebDriver hisDriver;
	
	@Before
	public void setUp() {
		juan.can(BrowseTheWeb.with(hisDriver));
	}
	
	@Then("^juan should see a yellow buy button$")
	public void juan_should_see_a_yellow_buy_button() {
	    // Write code here that turns the phrase above into concrete actions
	    juan.should(seeThat(TheYellowBuyButtonIsVisible.inThePage()).orComplainWith(NoMatchingBuyButtonIsVisible.class, NoMatchingBuyButtonIsVisible.getUnableToFoundButton()));
	}
	
	@Then("^juan stores the concert name$")
	public void juan_stores_the_concert_name() {
	    // Write code here that turns the phrase above into concrete actions
		//tomamos el nombre del concierto que se puede ver en la pantalla y instanciamos la variable global "ConcertName" con este nombre
		concertName = new ConcertData(hisDriver.findElement(By.xpath("//h1[@class='sectionHeading sectionHeadingText']")).getText());
	}

	@Given("^juan clicks the buy button$")
	public void juan_clicks_the_buy_button() {
		juan.attemptsTo(ClickOn.TheButton(TuBoletaConcertPage.YELLOW_BUY_BUTTON));
	}
	
	@When("^juan choose the ticket info$")
	public void juan_choose_the_ticket_info() {
    // Write code here that turns the phrase above into concrete actions
		juan.attemptsTo(FillTheTicketInfo.toBuy());
	}

	@When("^juan clicks the next button$")
	public void juan_clicks_the_next_button() {
	    // Write code here that turns the phrase above into concrete actions
	    juan.attemptsTo(ClickOn.TheButton(TuBoletaChooseTicketPage.NEXT_BUTTON));
	}

	@Then("^juan validates the name of the concert$")
	public void juan_validates_the_name_of_the_concert() {
	    // Write code here that turns the phrase above into concrete actions
	    juan.should(seeThat(TheConcertNamesAreEqual.name(), containsString(this.concertName.getConcertName())));
	}

	@When("^juan clicks the go to pay button$")
	public void juanClicksTheGoToPayButton() {
    // Write code here that turns the phrase above into concrete actions
		juan.attemptsTo(ScrollToGoToPayButton.to(TuBoletaConfirmAndGoToPayPage.GO_TO_PAY_BUTTON, hisDriver));
		juan.attemptsTo(ClickOn.TheButton(TuBoletaConfirmAndGoToPayPage.GO_TO_PAY_BUTTON));
	}
	
	@When("^juan clicks again a go to pay button$")
	public void juanClicksAgainAGoToPayButton() {
    // Write code here that turns the phrase above into concrete actions
		juan.attemptsTo(ScrollToGoToPayButton2.to(TuBoletaConfirmAndGoToPayPage2.GO_TO_PAY_BUTTON, hisDriver));
		juan.attemptsTo(ClickOn.TheButton(TuBoletaConfirmAndGoToPayPage2.GO_TO_PAY_BUTTON));
	}

	@When("^juan fills the financial requested data$")
	public void juan_fills_the_financial_requested_data(List<FinancialData> financialData) {
    juan.attemptsTo(FillTheFinancialRequestedData.with(financialData.get(0)));
}

	@Then("^juan clicks send payment button$")
	public void juan_clicks_send_payment_button() {
	    // Write code here that turns the phrase above into concrete actions
	    juan.attemptsTo(Click.on(TuBoletaSendPayPage.SEND_PAYMENT_BUTTON));
	}

}
