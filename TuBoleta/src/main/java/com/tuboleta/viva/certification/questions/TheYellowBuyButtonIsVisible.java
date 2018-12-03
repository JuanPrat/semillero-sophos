package com.tuboleta.viva.certification.questions;

import com.tuboleta.viva.certification.ui.TuBoletaConcertPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class TheYellowBuyButtonIsVisible implements Question<Boolean>{
	
	private static String errorMessage = "page out from test";
	
	//esta question se usa para validar que la pagina del concierto seleccionado
	//contiene el boton de compra del caso de prueba
	
	@Override
	public Boolean answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return the(TuBoletaConcertPage.YELLOW_BUY_BUTTON).answeredBy(actor).isCurrentlyVisible();
	}
	
	//Constructor de la clase	
		public static TheYellowBuyButtonIsVisible inThePage() {
			return new TheYellowBuyButtonIsVisible();
		}
		
		public static String getErrorMessage() {
			return errorMessage;
		}
}
