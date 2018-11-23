package co.com.bancolombia.certification.googlesuite.questions;

//librerias de serenity necesarias para implementar las questions
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import com.gargoylesoftware.htmlunit.javascript.host.media.TextTrackList;

import co.com.bancolombia.certification.googlesuite.ui.GoogleTranslatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class TheTranslatedTextField implements Question<List<String>>{

	@Override
	public List<String> answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		
		//retornamos el texto traducido para hacer la validacion del hamcrest

		return Text.of(GoogleTranslatePage.TARGET_LANGUAJE_RESULT).viewedBy(actor).asList();
	}

	public static Question<List<String>> displayed(){
		// TODO Auto-generated method stub
		return new TheTranslatedTextField();
	}
	
	

}
