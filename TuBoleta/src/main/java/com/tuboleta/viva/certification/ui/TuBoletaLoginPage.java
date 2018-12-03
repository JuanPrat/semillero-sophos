package com.tuboleta.viva.certification.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class TuBoletaLoginPage {
	
	public static final Target ACCOUNT_FIELD = Target.the("Login text field").located(By.name("ctl00$ctl00$uiBodyMain$uiBodyMain$uiLogin$tbLoginCode"));
	public static final Target PASSWORD_FIELD = Target.the("password text field").located(By.name("ctl00$ctl00$uiBodyMain$uiBodyMain$uiLogin$tbPassword"));
	public static final Target LOGIN_BUTTON = Target.the("login button").located(By.id("ctl00_ctl00_uiBodyMain_uiBodyMain_uiLogin_btnLogin"));
}
