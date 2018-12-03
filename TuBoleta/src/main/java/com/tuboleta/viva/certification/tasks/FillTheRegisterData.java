package com.tuboleta.viva.certification.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.tuboleta.viva.certification.ui.TuBoletaRegisterPage;
import model.PersonalData;

public class FillTheRegisterData implements Task{
	PersonalData registerData;
	
	public FillTheRegisterData(PersonalData registerData) {
		this.registerData = registerData;
	}
	
	@Override
	@Step("{0} fills the register requested data")
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(
			Scroll.to(TuBoletaRegisterPage.PERSONAL_DETAILS_TITLE),
			Enter.theValue(registerData.getEmail()).into(TuBoletaRegisterPage.EMAIL_TEXT_FIELD),
			Enter.theValue(registerData.getPass()).into(TuBoletaRegisterPage.PASS_TEXT_FIELD),
			Enter.theValue(registerData.getPass()).into(TuBoletaRegisterPage.CONFIRM_PASS_TEXT_FIELD),
			Enter.theValue(registerData.getId()).into(TuBoletaRegisterPage.ID_TEXT_FIELD),
			SelectFromOptions.byValue(registerData.getSalute()).from(TuBoletaRegisterPage.SALUTE_FIELD),
			Enter.theValue(registerData.getFirstName()).into(TuBoletaRegisterPage.FIRST_NAME_FIELD),
			Scroll.to(TuBoletaRegisterPage.FIRST_NAME_FIELD),
			Enter.theValue(registerData.getLastName()).into(TuBoletaRegisterPage.LAST_NAME_FIELD),
			Enter.theValue(registerData.getDayOfBirth()).into(TuBoletaRegisterPage.DAY_OF_BIRTH_FIELD),
			Enter.theValue(registerData.getMonthOfBirth()).into(TuBoletaRegisterPage.MONTH_OF_BIRTH_FIELD),
			Enter.theValue(registerData.getYearOfBirth()).into(TuBoletaRegisterPage.YEAR_OF_BIRTH_FIELD),
			Enter.theValue(registerData.getAreaCode()).into(TuBoletaRegisterPage.TELEFONE_AREA_CODE_FIELD),
			Enter.theValue(registerData.getTelefone()).into(TuBoletaRegisterPage.TELEFONE_FIELD),
			Enter.theValue(registerData.getCity()).into(TuBoletaRegisterPage.CITY_FIELD),
			Scroll.to(TuBoletaRegisterPage.CITY_FIELD),
			SelectFromOptions.byVisibleText(registerData.getDepartament()).from(TuBoletaRegisterPage.DEPARTAMENT_FIELD),
			SelectFromOptions.byVisibleText(registerData.getCountry()).from(TuBoletaRegisterPage.COUNTRY_FIELD));
	}
	
	public static FillTheRegisterData with(PersonalData registerData) {
		return instrumented(FillTheRegisterData.class, registerData) ;
	}
	
	

}
