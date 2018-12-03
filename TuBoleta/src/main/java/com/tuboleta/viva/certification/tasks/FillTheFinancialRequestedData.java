package com.tuboleta.viva.certification.tasks;

import model.FinancialData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.tuboleta.viva.certification.ui.TuBoletaSendPayPage;

public class FillTheFinancialRequestedData implements Task{
	FinancialData financialData;
	
	public FillTheFinancialRequestedData(FinancialData financialData) {
		this.financialData = financialData;
	}
	
	//esta task es la encargada de llenar el formulario financiero para comprar la boleta

	@Override
	@Step("{0} fill's the financial data")
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(
				Scroll.to(TuBoletaSendPayPage.TIPE_OF_CREDIT_CARD_RADIO_BUTTON),
				Click.on(TuBoletaSendPayPage.TIPE_OF_CREDIT_CARD_RADIO_BUTTON),
				Enter.theValue(financialData.getCreditCardNumber()).into(TuBoletaSendPayPage.CREDIT_CARD_NUMBER),
				Enter.theValue(financialData.getOwnerCardName()).into(TuBoletaSendPayPage.CREDIT_CARD_OWNER_NAME),
				SelectFromOptions.byValue(financialData.getMonthOfExpirity()).from(TuBoletaSendPayPage.CREDIT_CARD_EXPIRITY_MONTH),
				SelectFromOptions.byValue(financialData.getYearOfExpirity()).from(TuBoletaSendPayPage.CREDIT_CARD_EXPIRITY_YEAR),
				Enter.theValue(financialData.getCvv()).into(TuBoletaSendPayPage.CVV),
				Scroll.to(TuBoletaSendPayPage.ADDRESS_TEXT_FIELD),
				Enter.theValue(financialData.getAddress()).into(TuBoletaSendPayPage.ADDRESS_TEXT_FIELD),
				Enter.theValue(financialData.getPostalCode()).into(TuBoletaSendPayPage.POSTAL_CODE),
				Scroll.to(TuBoletaSendPayPage.ACCEPT_TERMS_CHECK_BOX),
				Click.on(TuBoletaSendPayPage.ACCEPT_TERMS_CHECK_BOX),
				Scroll.to(TuBoletaSendPayPage.SEND_PAYMENT_BUTTON));
	}
	
	public static FillTheFinancialRequestedData with(FinancialData financialData) {
		return instrumented(FillTheFinancialRequestedData.class, financialData);
		
	}

}
