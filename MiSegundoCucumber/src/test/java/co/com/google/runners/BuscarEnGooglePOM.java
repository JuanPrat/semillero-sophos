package co.com.google.runners;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuscarEnGooglePOM {
	static WebDriver zoe;//variable local
	
	//instancia del driver
	public static void BuscarEnGooglePOM() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		zoe = new ChromeDriver();
	}

	//cerrar navegador
	static public void Closebrowser() {
		zoe.close();
	}
	
	//copiar en el navegador
	static public void Type(String name, String keys) {
		zoe.findElement(By.name(name)).sendKeys(keys);
		Search(name);
	}
	
	//ir a una pagina
	static public void Getpage() {
		String page = "http://www.google.com.co";
		zoe.get(page);
	}
	
	//clickear un elemento
	static public void Search(String name) {
		zoe.findElement(By.name(name)).submit();
		
	}
	
	//validar en la direccion que se buscó lo que previamente envié
	static public void Validar(String string) {
		assertTrue(zoe.getCurrentUrl().contains(string));
	}
	
	}
	

