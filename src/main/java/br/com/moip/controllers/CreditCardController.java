package br.com.moip.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.moip.models.CreditCardRequest;
import br.com.moip.validators.CreditCard;

@RestController
@RequestMapping("/credit_card")
public class CreditCardController {
	
	@RequestMapping(method=RequestMethod.POST)
	public boolean validateCreditCard(@RequestBody(required=false) CreditCardRequest creditCard) {
		return new CreditCard(creditCard.getCardNumber()).isValid();
	}

}
