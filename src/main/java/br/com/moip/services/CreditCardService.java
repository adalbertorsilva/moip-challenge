package br.com.moip.services;

import org.springframework.stereotype.Component;

import br.com.moip.models.CreditCardRequest;
import br.com.moip.models.CreditCardResponse;

@Component
public class CreditCardService {

	public CreditCardResponse validateCardNumber (CreditCardRequest request) {
		return request.getCreditCard();
	}

}
