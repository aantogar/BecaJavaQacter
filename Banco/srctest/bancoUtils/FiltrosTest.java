package bancoUtils;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ejerciciosBanco.Cuenta;

class FiltrosTest {
	final String NOMBRE_UNO="Andrea Anton";
	final String CONCEPTO_UNO="Esto es una prueba de test";
	final double CANTIDAD_UNO=0.00;
	final double COMPROBAR_CERO=0;
	final LocalDate fecha=LocalDate.of(2022, 10, 01);
	

	@Test
	void testFiltername()  {
		assertTrue(Filtros.Filtername(NOMBRE_UNO,10,21));
	}


	@Test
	void testFilterDate()  {
		assertTrue(Filtros.FilterDate(fecha));
	}

	@Test
	void testFilterconcept()  {
		assertTrue(Filtros.Filterconcept(CONCEPTO_UNO, 10, 30));
	}
	
	@Test
	void testFilterInresarCantidad() throws Exception {
		Assertions.assertThrows(Exception.class, () -> {
			Integer.parseInt(CONCEPTO_UNO);
		});
	}

}
