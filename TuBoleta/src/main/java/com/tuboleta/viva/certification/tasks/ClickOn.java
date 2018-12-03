package com.tuboleta.viva.certification.tasks;

import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickOn implements Task{
	
	private Target buttonToClick;
	
	public ClickOn (Target theButtonToClick) {
		this.buttonToClick = theButtonToClick;
	}
	
	@Override
	@Step("{0} clicks the tuboleta's '#buttonToClick'")
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		Scroll.to(buttonToClick);
		actor.attemptsTo(Click.on(buttonToClick));
	}
	
	public static ClickOn TheButton(Target button) {
		return instrumented(ClickOn.class, button);
	}

}
