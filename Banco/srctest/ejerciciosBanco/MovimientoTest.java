package ejerciciosBanco;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ejerciciosBanco.Movimiento;

class MovimientoTest {
	Movimiento mov;
	private final String CONCEPTO=("Holi");
	private final LocalDate FECHA=LocalDate.now();
	private final double IMPORTE=(12.300);
	
	
	
	@BeforeEach
	void inicio() {
		mov=new Movimiento();
	}

	@Test
	void testGetConcepto() {
		mov.setConcepto(CONCEPTO);
		assertEquals(CONCEPTO,mov.getConcepto());
	}


	@Test
	void testGetFecha() {
		mov.setFecha(FECHA);
		assertEquals(FECHA,mov.getFecha());
	}


	@Test
	void testGetMiimporte() {
		mov.setMiimporte(IMPORTE);
		assertEquals(IMPORTE,mov.getMiimporte());
	}


}
