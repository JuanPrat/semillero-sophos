package co.com.bancolombia.certification.googlesuite.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class GoogleAppsComponent {
	
	public static final Target GOOGLE_APPS = Target.the("Google apps button").located(By.id("gbwa"));
	public static final Target GOOGLE_TRANSALTE = Target.the("Google translate option").located(By.id("gb51"));
	public static final Target GOOGLE_NO_THANKS_BUTTON = Target.the("No thanks google button").located(By.xpath("//*[@id=\"gbw\"]/div/div/div[2]/div[4]/div/div/div[2]/div/a[1]"));
}
