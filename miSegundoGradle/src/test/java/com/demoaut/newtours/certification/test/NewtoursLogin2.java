package com.demoaut.newtours.certification.test;

import static org.junit.Assert.*;//para hacer validaciones


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class NewtoursLogin2 {
	WebDriver firefox;
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\drivers\\Mozilla\\geckodriver.exe");
		firefox = new FirefoxDriver();
	}

	@After
	public void tearDown() throws Exception {
		firefox.close();
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		firefox.get("http://www.google.com.co");
	}

}
