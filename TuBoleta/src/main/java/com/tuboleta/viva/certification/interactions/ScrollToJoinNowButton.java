package com.tuboleta.viva.certification.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;

public class ScrollToJoinNowButton implements Interaction{
	Target button;
	
	//esta y todas las interacciones se hacen porque al hacer scroll hacia cualquier elemento
	//este queda por debajo del footer de la pagina ya que esta tiene la clase de bootstrap
	//que convierte a los elementos como el navbar y el footer flotantes. entonces al hacer click
	//sobre un elemento que está debajo del footer, enrealidad se hace click sobre el footer
	//y no en el elemento
	//por eso estas interacciones enrealidad hacen scroll sobre un elemento debajo del elemento
	//al cual se le va a hacer click, para que así el elemento quede sobre el footer y pueda ser
	//cliqueado efectivamente
	
	public ScrollToJoinNowButton(Target button) {
		// TODO Auto-generated constructor stub
		this.button = button;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Scroll.to(button).andAlignToBottom());
	}
	
	public static ScrollToJoinNowButton to(Target button) {
		return instrumented (ScrollToJoinNowButton.class, button);
	}
}
