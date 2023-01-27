package es.rf.tienda.util;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidatorTest {
	Validator validator;
	
	private final String ALFA_NUM="Jjdshfjsdhf90";
	private final String PHONE_NUM="987 67 8911";
	private final int MIN_PHONE=10;
	private final int MAX_PHONE=20;
	private final String EMAIL="andrea@hola.com";
	private final String DNI_BUENO="12.345.789-X";
	private final int VALOR_MIN=4;
	private final int VALOR_MAX=10;
	private final int VALOR_TEST=5;
	private final double VALOR_TESTB=5D;
	private final String VALOR_STR="Hola estamos en test";
	private final int MIN_STR=4;
	private final String EMPTY_STR="";
	
	
	
	
	@Test
	
	void testIsVacio(){
		assertTrue(Validator.isVacio(EMPTY_STR));
	}
	
	@Test
		
	void testIsAlfanumeric() {
		assertTrue(Validator.isAlfanumeric(ALFA_NUM));
	}

	@Test
	void testCumplePhoneNumber() {
		assertTrue(Validator.cumplePhoneNumber(PHONE_NUM, MIN_PHONE, MAX_PHONE));
	}

	@Test
	void testIsEmailValido() {
		assertTrue(Validator.isEmailValido(EMAIL));
	}

	@Test
	void testCumpleDNI() {
		assertTrue(Validator.cumpleDNI(DNI_BUENO));
	}

	@Test
	void testCumpleRangoIntIntInt() {
		assertTrue(Validator.cumpleRango(VALOR_TEST, VALOR_MIN, VALOR_MAX));
	}

	@Test
	void testCumpleRangoDoubleIntInt() {
		assertTrue(Validator.cumpleRango(VALOR_TESTB, VALOR_MIN, VALOR_MAX));
	}

	@Test
	void testCumpleLongitudMin() {
		assertTrue(Validator.cumpleLongitudMin(VALOR_STR, VALOR_MIN));
	}

	@Test
	void testCumpleLongitudMax() {
		assertTrue(Validator.cumpleLongitudMax(VALOR_STR, VALOR_MAX));
	}

	@Test
	void testCumpleLongitud() {
		fail("Not yet implemented");
	}

	@Test
	void testValDateMin() {
		fail("Not yet implemented");
	}

	@Test
	void testValDateMax() {
		fail("Not yet implemented");
	}

	@Test
	void testEsFechaValidaString() {
		fail("Not yet implemented");
	}

	@Test
	void testEsFechaValidaStringString() {
		fail("Not yet implemented");
	}

	@Test
	void testEsPasswordValida() {
		fail("Not yet implemented");
	}

}
