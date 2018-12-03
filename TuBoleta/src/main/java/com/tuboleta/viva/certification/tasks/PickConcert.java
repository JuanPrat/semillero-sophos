package com.tuboleta.viva.certification.tasks;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Step;
import util.ScrollToConcert;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PickConcert implements Task{
	private WebElement ConcertToGo;				//esta será la variable que contendrá el boton del concierto al cual cliquear 
	
	public PickConcert(WebDriver driver) {
		ScrollToConcert util = new ScrollToConcert(driver);   //util es la variable tipo ScrollToConcert en donde tenemos el codigo correspondiente para obtener las variables bait y concert to go
		ConcertToGo = util.ConcertToGo;
	}

	@Override
	@Step("{0} selects a concert from the list")
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
			actor.attemptsTo(Scroll.to(ConcertToGo));
			ConcertToGo.click();
	}
	
	public static PickConcert inTheCataloge(WebDriver driver) {
		return instrumented(PickConcert.class,driver);
	}

}
