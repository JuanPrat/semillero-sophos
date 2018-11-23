package co.com.bancolombia.certification.googlesuite.tasks;

import co.com.bancolombia.certification.googlesuite.ui.GoogleAppsComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class GoTo implements Task{
	
	private Target googleApp;
	
	public GoTo(Target googleApp) {
		this.googleApp = googleApp;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(GoogleAppsComponent.GOOGLE_NO_THANKS_BUTTON));
		actor.attemptsTo(Click.on(GoogleAppsComponent.GOOGLE_APPS));
		actor.attemptsTo(Click.on(GoogleAppsComponent.GOOGLE_TRANSALTE));
	}

	public static Performable TheApp(Target googleApp) {
		// TODO Auto-generated method stub
		return Tasks.instrumented(GoTo.class, googleApp);
		
	}

}
