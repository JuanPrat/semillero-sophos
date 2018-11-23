package com.demoaut.newtours.certification.test;

import static org.junit.Assert.*;//sirve para hacer validaciones


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NewtoursLogin {
	
	NewtoursLoginPOM clase;//creo la variable local 	

	@Before//etiquetas que sirven para inyectar codigo
	public void setUp() throws Exception {
		//creamos el objeto NewtoursLoginPOM y el web driver
		clase = new NewtoursLoginPOM();
		
		//ahora vamos a cualquier pagina con el siguiente método
		clase.Getpage("http://www.google.com");
	}

	@After//etiquetas que sirven para inyectar codigo
	public void tearDown() throws Exception {
		//cerramos el navegador
		clase.Closebrowser();
	}

	@Test//etiquetas que sirven para inyectar codigo
	public void test() {
		//fail("Not yet implemented");
		//ahora escribimos en la barra de busqueda que tiene name = q, gmail
		clase.Type("q", "newtours demo");
		clase.Search("btnK");
	}

}
