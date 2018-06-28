package br.com.moip.models;

public class CreditCardResponse {
	
	public CreditCardResponse (boolean valid, String brand) {
		this.valid = valid;
		this.brand = brand;
	}
	
	private boolean valid;
	private String brand;
	
	public boolean isValid() {
		return valid;
	}
	
	public String getBrand() {
		return brand;
	}

}
