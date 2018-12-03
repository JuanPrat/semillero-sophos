package com.tuboleta.viva.certification.questions;

import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import com.tuboleta.viva.certification.ui.TuBoletaMainPage;

import net.serenitybdd.screenplay.Question;

public class TuBoletaPageIsVisible implements Question<Boolean>{
	
	private static String noConnectionMessage = "there is not connection to the internet";
	
	//esta question se usa para verificar que la barra de busqueda de la pagina tuboleta.com
	//está presente al momento de cargar la pagina 
	
	@Override
	public Boolean answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return the(TuBoletaMainPage.SEARCH_BOX).answeredBy(actor).isCurrentlyVisible();
	}
	
	public static TuBoletaPageIsVisible hasLoaded() {
		return new TuBoletaPageIsVisible();
	}
	
	public static String getNoConectionMessage() {
		return noConnectionMessage;
	}

}
