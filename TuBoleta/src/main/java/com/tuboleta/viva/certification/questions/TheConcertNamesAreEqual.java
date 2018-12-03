package com.tuboleta.viva.certification.questions;

import com.tuboleta.viva.certification.ui.TuBoletaConfirmAndGoToPayPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheConcertNamesAreEqual implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return Text.of(TuBoletaConfirmAndGoToPayPage.CONCERT_NAME).viewedBy(actor).asString();
	}
	
	public static TheConcertNamesAreEqual name() {
		return new TheConcertNamesAreEqual();
	}

}
