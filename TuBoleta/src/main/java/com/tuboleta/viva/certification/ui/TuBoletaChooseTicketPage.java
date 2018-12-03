package com.tuboleta.viva.certification.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class TuBoletaChooseTicketPage extends PageObject{
	
	public static final Target TICKET_CATEGORY = Target.the("ticket category").located(By.className("marker"));
	public static final Target TICKET_CUANTITY = Target.the("cuantity select box").located(By.id("quantity--A"));
	public static final Target SHIPPING_METHOD = Target.the("shipping method button").located(By.id("selectDeliveryType"));
	public static final Target NEXT_BUTTON = Target.the("next button").located(By.className("chooseTicketsOfferDiv"));
	public static final Target BAIT = Target.the("the bait to scroll").located(By.id("wrapFooter"));
}
