package srctest.fechasJava;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import src.fechasJava.FormatoFecha;

class FormatoFechaTest {
	private  final String FECHA_UNO=("2020-12-07");
	private  final String FECHA_DOS=("2020-12-07");
	private  final String FECHA_TRES="Tue, Aug 16 2016";
	private  final String FECHA_CUATRO =("2022-08");
	FormatoFecha fecha=new FormatoFecha();

	@Test
	void testFechaCorrecta() {
		assertNotNull(fecha.fechaCorrecta(FECHA_UNO));
	}

	@Test
	void testFechaCorrectaDos() {
		assertNotNull(fecha.fechaCorrecta(FECHA_DOS));
	}
	@Test
	void testFechaCorrectaTres() {
		assertNotNull(fecha.fechaCorrecta(FECHA_TRES));
	}
	@Test
	void testFechaCorrectaCuatro() {
		assertNotNull(fecha.fechaCorrecta(FECHA_TRES));
	}


}
