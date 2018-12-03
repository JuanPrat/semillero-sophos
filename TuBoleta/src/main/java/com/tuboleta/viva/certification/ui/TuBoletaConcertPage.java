package com.tuboleta.viva.certification.ui;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class TuBoletaConcertPage extends PageObject{
	
	public static final Target YELLOW_BUY_BUTTON = Target.the("yellow buy button").located(By.id("buyButton"));
	public static final Target BLUE_BUY_BUTTON = Target.the("blue buy button").located(By.xpath("//a[@href='/shows/show.aspx?sh=NAVIDAD18']"));
	public static final Target DATE_SELECT_BOX = Target.the("date selector").located(By.className("borInput"));
	public static final Target CONCERT_NAME = Target.the("concert name").located(By.xpath("//h1[@class='sectionHeading sectionHeadingText']"));
}
