package model;

//este model lo usaremos para guardar la informacion financiera del actor

public class FinancialData {
	private String creditCardNumber;
	private String ownerCardName;
	private String monthOfExpirity;
	private String yearOfExpirity;
	private String cvv;
	private String address;
	private String postalCode;
	
	public FinancialData(String creditCardNumber, String ownerCardName, String monthOfExpirity, String yearOfExpirity,
			String cvv, String address, String postalCode) {
		this.creditCardNumber = creditCardNumber;
		this.ownerCardName = ownerCardName;
		this.monthOfExpirity = monthOfExpirity;
		this.yearOfExpirity = yearOfExpirity;
		this.cvv = cvv;
		this.address = address;
		this.postalCode = postalCode;
	}
	public String getCreditCardNumber() {
		return creditCardNumber;
	}
	public String getOwnerCardName() {
		return ownerCardName;
	}
	public String getMonthOfExpirity() {
		return monthOfExpirity;
	}
	public String getYearOfExpirity() {
		return yearOfExpirity;
	}
	public String getCvv() {
		return cvv;
	}
	public String getAddress() {
		return address;
	}
	public String getPostalCode() {
		return postalCode;
	}
	
	
}
