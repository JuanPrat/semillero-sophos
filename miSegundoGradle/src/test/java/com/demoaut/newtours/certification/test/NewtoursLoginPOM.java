package com.demoaut.newtours.certification.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewtoursLoginPOM {
	static WebDriver zoe;//variable local
	
	//instancia del driver
	public NewtoursLoginPOM() {
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
	}
	
	//ir a una pagina
	static public void Getpage(String page) {
		zoe.get(page);
	}
	
	//clickear un elemento
	static public void Search(String name) {
		zoe.findElement(By.name(name)).submit();
		
	}
	
	}
	

