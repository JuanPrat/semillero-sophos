package com.tuboleta.viva.certification.ui;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class TuBoletaSendPayPage extends PageObject{
	public static final Target TIPE_OF_CREDIT_CARD_RADIO_BUTTON = Target.the("tipe of credit card radio button").located(By.id("uiCardTypeRadioButtons_3"));
	public static final Target CREDIT_CARD_NUMBER = Target.the("credit card number").located(By.name("ctl00$uiContent$uiBasketOffers$uiCreditCardDetails$uiCardNumber"));
	public static final Target CREDIT_CARD_OWNER_NAME = Target.the("credit card owner name").located(By.name("ctl00$uiContent$uiBasketOffers$uiCreditCardDetails$uiCardName"));
	public static final Target CREDIT_CARD_EXPIRITY_MONTH = Target.the("credit card expire month").located(By.name("ctl00$uiContent$uiBasketOffers$uiCreditCardDetails$uiExpiryMonth"));
	public static final Target CREDIT_CARD_EXPIRITY_YEAR = Target.the("credit card expire year").located(By.name("ctl00$uiContent$uiBasketOffers$uiCreditCardDetails$uiExpiryYear"));
	public static final Target CVV = Target.the("credit card cvv").located(By.name("ctl00$uiContent$uiBasketOffers$uiCreditCardDetails$uiCardCvc"));
	public static final Target ADDRESS_TEXT_FIELD = Target.the("adress field").located(By.name("ctl00$uiContent$uiBillingAddress$tbAddressLine1"));
	public static final Target POSTAL_CODE = Target.the("postal code text field").located(By.name("ctl00$uiContent$uiBillingAddress$tbAddressPostcode"));
	public static final Target ACCEPT_TERMS_CHECK_BOX = Target.the("accept terms check box").located(By.id("ctl00_uiContent_uiVerifyPurchase_uiAgree"));
	public static final Target SEND_PAYMENT_BUTTON = Target.the("send payment button").located(By.name("ctl00$uiContent$uiPurchaseSubmit"));
	
}
