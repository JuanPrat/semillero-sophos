package com.tuboleta.viva.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.tuboleta.viva.certification.ui.TuBoletaLoginPage;

import model.PersonalData;

public class FillTheLoginData implements Task{
	
	PersonalData data;

	public FillTheLoginData(PersonalData data) {
		this.data = data;
	}

	@Override
	@Step("{0} fills the login requested data")
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Enter.theValue(data.getEmail()).into(TuBoletaLoginPage.ACCOUNT_FIELD),
				Enter.theValue(data.getPass()).into(TuBoletaLoginPage.PASSWORD_FIELD),
				Scroll.to(TuBoletaLoginPage.LOGIN_BUTTON),
				Click.on(TuBoletaLoginPage.LOGIN_BUTTON));
	}
	
	public static FillTheLoginData with(PersonalData personalData){
		return instrumented(FillTheLoginData.class, personalData);
	}

}
