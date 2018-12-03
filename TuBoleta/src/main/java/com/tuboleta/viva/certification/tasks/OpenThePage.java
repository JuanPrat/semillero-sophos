package com.tuboleta.viva.certification.tasks;

import com.tuboleta.viva.certification.ui.TuBoletaMainPage;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenThePage implements Task{
	
	//definimos el constructor de la page
	private PageObject page = new TuBoletaMainPage();

	@Override
	@Step("{0} open's the tuboleta's web page")
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Open.browserOn(page));
	}
	
	public static OpenThePage at(PageObject page) {
		return instrumented(OpenThePage.class, page);
	}

}
