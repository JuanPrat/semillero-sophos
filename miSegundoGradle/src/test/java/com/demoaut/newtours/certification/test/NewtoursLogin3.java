package com.demoaut.newtours.certification.test;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class NewtoursLogin3 {
	WebDriver Iexplorer;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.ie.driver", "C:\\selenium\\drivers\\IEDriverServer_Win32_3.9.0\\IEDriverServer.exe");
		Iexplorer = new InternetExplorerDriver();
	}

	@After
	public void tearDown() throws Exception {
		Iexplorer.close();
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		Iexplorer.get("http://www.google.com.co");
	}

}
