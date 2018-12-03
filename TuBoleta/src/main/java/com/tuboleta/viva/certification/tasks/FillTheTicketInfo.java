package com.tuboleta.viva.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.tuboleta.viva.certification.ui.TuBoletaChooseTicketPage;

public class FillTheTicketInfo implements Task{

	@Override
	@Step("{0} chooses the ticket spot, quantity and shipping method")
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
			actor.attemptsTo(Click.on(TuBoletaChooseTicketPage.TICKET_CATEGORY),
			Scroll.to(TuBoletaChooseTicketPage.TICKET_CUANTITY),
			SelectFromOptions.byValue("1").from(TuBoletaChooseTicketPage.TICKET_CUANTITY),
			Scroll.to(TuBoletaChooseTicketPage.SHIPPING_METHOD),
			SelectFromOptions.byValue("1").from(TuBoletaChooseTicketPage.SHIPPING_METHOD),
			Scroll.to(TuBoletaChooseTicketPage.NEXT_BUTTON));
	}
	
	public static FillTheTicketInfo toBuy() {
		return instrumented (FillTheTicketInfo.class);
	}

}
