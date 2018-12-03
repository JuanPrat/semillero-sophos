package com.tuboleta.viva.certification.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class TuBoletaConfirmAndGoToPayPage extends PageObject{
	
	public static final Target CONCERT_NAME = Target.the("concert name").located(By.className("sectionTitle"));
	public static final Target GO_TO_PAY_BUTTON = Target.the("go to pay button").located(By.xpath("//input[@id='goToPaymentButton']"));
	public static final Target BAIT = Target.the("the bait to scroll").located(By.id("DigiCertClickID_3JpOPQ0GSeal"));
	public static final Target CLOSE_MAP = Target.the("map").located(By.id("toggle-close"));
}
