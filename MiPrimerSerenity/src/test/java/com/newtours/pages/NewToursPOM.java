package com.newtours.pages;

import net.serenitybdd.core.pages.PageObject;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;				//page object para 
import net.thucydides.core.annotations.DefaultUrl;			//para definir la pagina default

@DefaultUrl("http://www.newtours.demoaut.com")
public class NewToursPOM extends PageObject{

	
	@FindBy(name = "userName")
	WebElement txtUserName;
	
	@FindBy(name="password")
	WebElement txtPass;
	
	@FindBy(name="login")
	WebElement btnLogin;
	
	
	
	public void writeData(String user, String pass) {
		txtUserName.sendKeys(user);
		txtPass.sendKeys(pass);
	}
	
	public void sendData(String user, String pass) {
		btnLogin.click();
	}
	
	
	}

