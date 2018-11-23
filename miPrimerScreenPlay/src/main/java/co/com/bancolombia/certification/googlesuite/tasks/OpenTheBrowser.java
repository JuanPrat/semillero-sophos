package co.com.bancolombia.certification.googlesuite.tasks;

import co.com.bancolombia.certification.googlesuite.ui.GoogleHomePage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenTheBrowser implements Task{
	
	private PageObject page;
	
	public OpenTheBrowser(PageObject page) {
		// TODO Auto-generated constructor stub
		this.page = page;
	}

	@Override
	@Step("{0} open the browser en google home page")
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Open.browserOn(page));
	}
	
	public static OpenTheBrowser on(PageObject page){
		return Tasks.instrumented(OpenTheBrowser.class, page);
	}

}
