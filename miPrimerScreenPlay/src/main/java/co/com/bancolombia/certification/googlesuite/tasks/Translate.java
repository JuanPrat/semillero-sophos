package co.com.bancolombia.certification.googlesuite.tasks;

import org.openqa.selenium.remote.server.handler.SendKeys;

import co.com.bancolombia.certification.googlesuite.ui.GoogleTranslatePage;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Translate implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(GoogleTranslatePage.SOURCE_LANGUAJE),
				Click.on(GoogleTranslatePage.SOURCE_LANGUAJE_OPTION),
				Click.on(GoogleTranslatePage.TARGET_LANGUAJE),
				Click.on(GoogleTranslatePage.TARGET_LANGUAJE_OPTION),
				Click.on(GoogleTranslatePage.SOURCE_LANGUAJE_TEXT_AREA),
				Enter.theValue("amazing").into(GoogleTranslatePage.SOURCE_LANGUAJE_TEXT_AREA));
				Click.on(GoogleTranslatePage.TRANSLATE_BUTTON);
				
		
	}

	public static Translate the() {
		// TODO Auto-generated method stub
		return Tasks.instrumented(Translate.class);
	}

}
