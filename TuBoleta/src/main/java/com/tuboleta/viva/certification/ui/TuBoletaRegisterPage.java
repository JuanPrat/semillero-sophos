package com.tuboleta.viva.certification.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class TuBoletaRegisterPage extends PageObject{
	public static final Target PERSONAL_DETAILS_TITLE = Target.the("personal details title").located(By.xpath("//h3[contains(text(),'DETALLES PERSONALES')]")); 
	public static final Target EMAIL_TEXT_FIELD = Target.the("email text field").located(By.id("ctl00_ctl00_uiBodyMain_uiBodyMain_uiBasicDetails_tbEmail"));
	public static final Target PASS_TEXT_FIELD = Target.the("password field").located(By.id("ctl00_ctl00_uiBodyMain_uiBodyMain_uiBasicDetails_tbPassword"));
	public static final Target CONFIRM_PASS_TEXT_FIELD = Target.the("confirm pass text field").located(By.id("ctl00_ctl00_uiBodyMain_uiBodyMain_uiBasicDetails_tbPasswordConfirm"));
	public static final Target ID_TEXT_FIELD = Target.the("id text field").located(By.id("ctl00_ctl00_uiBodyMain_uiBodyMain_uiBasicDetails_tbOtherPhone"));
	public static final Target SALUTE_FIELD = Target.the("salute text field").located(By.id("ctl00_ctl00_uiBodyMain_uiBodyMain_uiBasicDetails_ddlSalutation"));
	public static final Target FIRST_NAME_FIELD = Target.the("first name field").located(By.id("ctl00_ctl00_uiBodyMain_uiBodyMain_uiBasicDetails_tbFirstName"));
	public static final Target LAST_NAME_FIELD = Target.the("last name field").located(By.id("ctl00_ctl00_uiBodyMain_uiBodyMain_uiBasicDetails_tbLastName"));
	public static final Target DAY_OF_BIRTH_FIELD = Target.the("day of birth field").located(By.id("ctl00_ctl00_uiBodyMain_uiBodyMain_uiBasicDetails_tbDOBDay"));
	public static final Target MONTH_OF_BIRTH_FIELD = Target.the("month of birth").located(By.id("ctl00_ctl00_uiBodyMain_uiBodyMain_uiBasicDetails_tbDOBMonth"));
	public static final Target YEAR_OF_BIRTH_FIELD = Target.the("year if birth").located(By.id("ctl00_ctl00_uiBodyMain_uiBodyMain_uiBasicDetails_tbDOBYear"));
	public static final Target TELEFONE_AREA_CODE_FIELD = Target.the("telefone area code").located(By.id("ctl00_ctl00_uiBodyMain_uiBodyMain_uiBasicDetails_tbPhoneAreaCode"));
	public static final Target TELEFONE_FIELD = Target.the("telefone field").located(By.id("ctl00_ctl00_uiBodyMain_uiBodyMain_uiBasicDetails_tbPhone"));
	public static final Target CITY_FIELD = Target.the("city field").located(By.id("ctl00_ctl00_uiBodyMain_uiBodyMain_uiAddressDetails_tbAddressCity"));
	public static final Target DEPARTAMENT_FIELD = Target.the("departament field").located(By.id("ctl00_ctl00_uiBodyMain_uiBodyMain_uiAddressDetails_selAddressState"));
	public static final Target COUNTRY_FIELD = Target.the("country field").located(By.id("ctl00_ctl00_uiBodyMain_uiBodyMain_uiAddressDetails_ddlAddressCountry"));
	public static final Target JOIN_NOW_BUTTON = Target.the("join now button").located(By.name("ctl00$ctl00$uiBodyMain$uiBodyMain$uiDoValidation"));
	public static final Target BAIT = Target.the("footer of the page").located(By.id("ctl00_ctl00_uiFooter_footerBannerSpaceNew"));
}
