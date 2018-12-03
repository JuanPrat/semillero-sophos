package com.tuboleta.viva.certification.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tuboleta.viva.certification.ui.TuBoletaConfirmAndGoToPayPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;

public class ScrollToGoToPayButton2 implements Interaction{
	Target button;
	WebDriver driver;
	
	public ScrollToGoToPayButton2(Target button, WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.button = button;
		this.driver = driver;
	}
	
		//esta interaccion la usaremos para scrollear hasta el segundo boton de go to pay
		//se hace esta interaccion en especial porque hay que esperar a que un elemento desplegable
		//que aparece en la pantalla se mueva completamente para no confundir al programa

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		//esperamos a que el elemento con nombre de clase feesinfo se mueva por completo antes de hacer scroll hacia el
		WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.className("feesInfo")));
		actor.attemptsTo(Scroll.to(TuBoletaConfirmAndGoToPayPage.BAIT));
	}
	
	public static ScrollToGoToPayButton2 to(Target button, WebDriver driver ) {
		return instrumented (ScrollToGoToPayButton2.class, button, driver);
	}

}
