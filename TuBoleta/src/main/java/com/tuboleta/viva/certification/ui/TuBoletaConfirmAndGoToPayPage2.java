package com.tuboleta.viva.certification.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class TuBoletaConfirmAndGoToPayPage2 {
	
	public static final Target GO_TO_PAY_BUTTON = Target.the("go to pay button").located(By.id("ctl00_uiContent_uiContinueButton"));
	public static final Target DEPLOYABLE = Target.the("the deployable arrow").located(By.className("feesInfo"));
}
