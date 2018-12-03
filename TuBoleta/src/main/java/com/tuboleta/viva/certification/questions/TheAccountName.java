package com.tuboleta.viva.certification.questions;

import net.serenitybdd.screenplay.questions.Text;
import com.tuboleta.viva.certification.ui.TuBoletaMainPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.thucydides.core.annotations.Step;

public class TheAccountName implements Question<String>{
	
	//esta question hará la validacion de que el primer nombre mostrado en pantalla luego del 
	//logueo sea acorde al nombre indicado al actor en el programa

	@Override
	@Step("{0} verify that he has loged in correctly with his account")
	public String answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return Text.of(TuBoletaMainPage.VISITOR_ACCOUNT).viewedBy(actor).asString().toLowerCase();
	}
	
	public static TheAccountName displayed() {
		return new TheAccountName();
	}
}
