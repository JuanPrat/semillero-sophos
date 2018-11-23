package co.com.bancolombia.certifications.googlesuite.stepdefinitions;

import org.openqa.selenium.WebDriver;
import co.com.bancolombia.certification.googlesuite.questions.TheTranslatedTextField;
import co.com.bancolombia.certification.googlesuite.tasks.GoTo;
import co.com.bancolombia.certification.googlesuite.tasks.OpenTheBrowser;
import co.com.bancolombia.certification.googlesuite.tasks.Translate;
import co.com.bancolombia.certification.googlesuite.ui.GoogleAppsComponent;
import co.com.bancolombia.certification.googlesuite.ui.GoogleHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import static net.serenitybdd.screenplay.GivenWhenThen.*;								
import net.thucydides.core.annotations.Managed;
import static org.hamcrest.Matchers.contains;       									//importamos el hamcrest matcher para usar contains

public class GoogleTranslateStepDefinitions {
	
	@Managed(driver = "chrome")
	private WebDriver herBrowser;
	
	private Actor zoe = new Actor("zoe");						//instancia de un objeto Actor el cual es propio de la arquitectura de screeplay
	
	private GoogleHomePage googleHomePage;
	
	@Before
	public void setUp() {
		zoe.can(BrowseTheWeb.with(herBrowser));					//conectamos el webdriver con el actor
	}
	
	@Given("^that zoe want to translate a word$")
	public void thatZoeWantToTranslateAWord() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //Precondiciones: estar en google translate
		zoe.wasAbleTo(OpenTheBrowser.on(googleHomePage));
		zoe.wasAbleTo(GoTo.TheApp(GoogleAppsComponent.GOOGLE_TRANSALTE));
	}

	
	@When("^she translate the word amazing to spanish$")
	public void sheTranslateTheWordAmazingToSpanish() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //condiciones: traducir una palabra
		zoe.wasAbleTo(Translate.the());
	}

	@Then("^she should see the word amazing in the screen$")
	public void sheShouldSeeTheWordAmazingInTheScreen() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //postcondiciones o consecuencias: aparece la palabra traducida -> assert
		zoe.should(seeThat(TheTranslatedTextField.displayed(), contains("increíble")));
	}
	
}
