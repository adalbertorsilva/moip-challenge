package br.com.moip.models;

import br.com.moip.validators.CreditCard;

public class CreditCardRequest {
	
	private String cardNumber;

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public CreditCardResponse getCreditCard () {
		CreditCard creditCard = new CreditCard(this.cardNumber);
		return new CreditCardResponse(creditCard.isValid(), creditCard.getBrand().name());
	}

}
