package com.newtours.stepDefinitions;

import com.newtours.pages.NewToursPOM;

import net.thucydides.core.annotations.Step;

public class LoginSteps {

	NewToursPOM pom;
	String usuario = "juanprat";
	String pass = "nn";
	
	@Step
	public void OpenApplication() {
		pom.open();
	}
	@Step
	public void WriteData() {
		pom.writeData(usuario, pass);
	}
	@Step
	public void SendData() {
		pom.sendData(usuario, pass);
	}
}
