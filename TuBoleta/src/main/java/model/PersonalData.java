package model;

//este model lo usaremos para guardar la informacion personal del actor para el momento del registro

import net.serenitybdd.screenplay.Actor;

public class PersonalData {
	
	private String email;
	private String pass;
	private String id;
	private String salute;
	private String firstName;
	private String lastName;
	private String dayOfBirth;
	private String monthOfBirth;
	private String yearOfBirth;
	private String areaCode;
	private String telefone;
	private String city;
	private String departament;
	private String country;
	
	public PersonalData(String email, String pass, String id, String salute, String firstName, String lastName,
	String dayOfBirth, String monthOfBirth, String yearOfBirth, String areaCode, String telefone, String city,
	String departament, String country) {
		this.email = email;
		this.pass = pass;
		this.id = id;
		this.salute = salute;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dayOfBirth = dayOfBirth;
		this.monthOfBirth = monthOfBirth;
		this.yearOfBirth = yearOfBirth;
		this.areaCode = areaCode;
		this.telefone = telefone;
		this.city = city;
		this.departament = departament;
		this.country = country;
	}
	
	public PersonalData(String email, String pass) {
		this.email = email;
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}

	public String getPass() {
		return pass;
	}

	public String getId() {
		return id;
	}

	public String getSalute() {
		return salute;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getDayOfBirth() {
		return dayOfBirth;
	}

	public String getMonthOfBirth() {
		return monthOfBirth;
	}

	public String getYearOfBirth() {
		return yearOfBirth;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getCity() {
		return city;
	}

	public String getDepartament() {
		return departament;
	}

	public String getCountry() {
		return country;
	}
	
	
	
	

}
