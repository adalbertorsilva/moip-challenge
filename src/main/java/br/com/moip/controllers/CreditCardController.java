package br.com.moip.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.moip.models.CreditCardRequest;
import br.com.moip.models.CreditCardResponse;
import br.com.moip.services.CreditCardService;

@RestController
@RequestMapping("/credit_card")
public class CreditCardController {
	
	@Autowired
	private CreditCardService creditCardService;
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<CreditCardResponse> validateCreditCard(@RequestBody(required=false) CreditCardRequest request) {
		return new ResponseEntity<CreditCardResponse>(creditCardService.validateCardNumber(request), HttpStatus.OK);
	}
}
