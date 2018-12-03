package util;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.findby.By;

public class ScrollToConcert {
	
	public WebElement ConcertToGo;
	public WebElement Bait;
	
	public ScrollToConcert(WebDriver driver) {
		int Concert;
		//creamos una lista con todos los elementos que contengan un boton con clase ResultBuyNow, los cuales son los conciertos
		List<WebElement> Concerts = driver.findElements(By.className("resultBuyNow"));  
		Random rand = new Random();
		//tiramos un random con el tama�o de la lista como limite superior
		//Concert = 0; 
		Concert = rand.nextInt(Concerts.size());
		//si el random nos da cero, el elemento para enviar al scroll no ser� un boton sino el header de la tabla que tiene los conciertos
		if(Concert == 0)												
			Bait = driver.findElement(By.id("ctl00_uiBodyMain_searchResultsControl_uiResultsMessage"));
		//si el random nos d� diferente de cero el elemento para enviar al scroll ser� un elemento de la tabla que contendr� otro concierto
		else
			Bait = Concerts.get(Concert-1); 							
		//tomamos el concierto al cual queremos ir realmente seg�n el random
		ConcertToGo = Concerts.get(Concert); 							 
	}
}


