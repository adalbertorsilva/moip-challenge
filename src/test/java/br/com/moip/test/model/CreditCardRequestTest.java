package br.com.moip.test.model;

import static org.junit.Assert.*;
import org.junit.Test;

import br.com.moip.models.CreditCardRequest;

public class CreditCardRequestTest {
	
	@Test
	public void mustHaveAnValidCardNumberAndBrand () {
		CreditCardRequest request = new CreditCardRequest();
		request.setCardNumber("5464798032114107");
		assertTrue(request.getCreditCard().isValid());
		assertEquals(request.getCreditCard().getBrand(), "MASTERCARD");
	}
	
	@Test
	public void mustHaveAnInalidCardNumberAndBrand () {
		CreditCardRequest request = new CreditCardRequest();
		request.setCardNumber("546479803211410111111");
		assertFalse(request.getCreditCard().isValid());
		assertEquals(request.getCreditCard().getBrand(), "UNKNOWN");
	}

}
