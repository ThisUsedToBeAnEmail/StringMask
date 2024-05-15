package org.lnation.StringMask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;


class CalculatorTest {
	StringMask mask;
	
	@Test                                               
	@DisplayName("Test string masking from the start of the string")   
	void testStart() {
		mask = new StringMask();
		String masking = mask.mask("thisusedtobeanemail@gmail.com", "start", 5, "*");
		assertTrue(masking.equals("*****sedtobeanemail@gmail.com"), "first 5 characters");
	}

	@Test                                               
	@DisplayName("Test string masking from the middle of the string")   
	void testMiddle() {
		mask = new StringMask();
		String masking = mask.mask("thisusedtobeanemail@gmail.com", "middle", 5, "*");
		assertTrue(masking.equals("thisusedtobe*****il@gmail.com"), "middle 5 characters");
	}

	@Test                                               
	@DisplayName("Test string masking from the end of the string")   
	void testEnd() {
		mask = new StringMask();
		String masking = mask.mask("thisusedtobeanemail@gmail.com", "end", 5, "*");
		assertTrue(masking.equals("thisusedtobeanemail@gmai*****"), "end 5 characters");
	}

	@Test                                               
	@DisplayName("Test string masking of an email")   
	void testEmail() {
		mask = new StringMask();
		String masking = mask.mask("thisusedtobeanemail@gmail.com", "email", 5, "*");
		System.out.println(masking);
		assertTrue(masking.equals("thisusedtobean*****@*****.***"), "email 5 characters");
	}



}
