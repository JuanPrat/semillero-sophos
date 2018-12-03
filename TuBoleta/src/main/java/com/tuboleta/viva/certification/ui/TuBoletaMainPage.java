package com.tuboleta.viva.certification.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;		//a design pattern for pages
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;	//old library to specify the default url of a ui 

@DefaultUrl("https://vive.tuboleta.com/")
public class TuBoletaMainPage extends PageObject{
	public static final Target REGISTER_BUTTON = Target.the("The register button").located(By.id("ctl00_ctl02_lbRegister"));
	public static final Target LOGIN_BUTTON = Target.the("The login button").located(By.id("ctl00_ctl02_lbLogin"));
	public static final Target SEARCH_BOX = Target.the("The search box").located(By.id("ctl00_uiEventSelector_k"));
	public static final Target CONCERTS_BUTTON = Target.the("The concerts button").located(By.xpath("/html[1]/body[1]/form[1]/div[4]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]"));
	public static final Target VISITOR_ACCOUNT = Target.the("Loged account").located(By.id("mastHeadSignin"));
	public static final Target HOME_BUTTON = Target.the("tu boleta home button").located(By.id("mainLogo"));
}
