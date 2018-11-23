package co.com.bancolombia.certification.googlesuite.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class GoogleTranslatePage {
	
	public static final Target SOURCE_LANGUAJE = Target.the("Source laguage button").located(By.id("gt-sl-gms"));
	public static final Target TARGET_LANGUAJE = Target.the("Target laguage button").located(By.id("gt-tl-gms"));
	public static final Target SOURCE_LANGUAJE_OPTION = Target.the("Source language").located(By.xpath("//div[@id='gt-sl-gms-menu']/table/tbody/tr/td//div[contains(text(), 'inglés')]"));
	public static final Target TARGET_LANGUAJE_OPTION = Target.the("Target language").located(By.xpath("//div[@id='gt-tl-gms-menu']/table/tbody/tr/td//div[contains(text(), 'español')]"));
	public static final Target SOURCE_LANGUAJE_TEXT_AREA = Target.the("Source language textarea").located(By.id("source"));
	public static final Target TARGET_LANGUAJE_RESULT = Target.the("Target languaje result area").located(By.id("gt-res-dir-ctr"));
	public static final Target TRANSLATE_BUTTON = Target.the("Translate button").located(By.id("gt-submit"));
}
