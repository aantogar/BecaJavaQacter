package ejerciciosBanco;
import ejerciciosBanco.Cuenta;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {
	Cuenta cuentatest;
	final String NUMERO_CUENTA="1237689";
	final String TITULAR_UNO="Andrea Antón García";
	final double CANTIDAD_UNO=2000.00;
	final String CONCEPTO_UNO=("PRIMER CONCEPTO");
	final double SALDO_DIS_UNO=10000.00;
	final String TOSTRING=("Estamos probando");
	final int VALOR_UNO=2;
	final int VALOR_DOS=22;
	
	
	@BeforeEach
	void inicio() {
		cuentatest=new Cuenta();
	}

	@Test
	void testIngresarDouble() throws Exception {
		cuentatest.ingresar(2000);
		assertEquals(CANTIDAD_UNO,cuentatest.getSaldo());
	}

	@Test
	void testIngresarStringDouble() throws Exception {
		cuentatest.ingresar(CONCEPTO_UNO, CANTIDAD_UNO);
		assertEquals(CANTIDAD_UNO,cuentatest.getSaldo());
	}

	@Test
	void testRetirarDouble() throws Exception {
		cuentatest.ingresar(SALDO_DIS_UNO);
		cuentatest.retirar(CANTIDAD_UNO);
		assertEquals(cuentatest.getSaldo(),SALDO_DIS_UNO-CANTIDAD_UNO);
	}

	@Test
	void testRetirarStringDouble() throws Exception {
		cuentatest.ingresar(SALDO_DIS_UNO);
		cuentatest.retirar(CANTIDAD_UNO);
		assertEquals(cuentatest.getSaldo(),SALDO_DIS_UNO-CANTIDAD_UNO);
	}

	@Test
	void testGetTitular() {
		cuentatest.setTitular(TITULAR_UNO);
		assertEquals(TITULAR_UNO,cuentatest.getTitular());
	}


	@Test
	void testGetNumero() {
		cuentatest.setNumero(NUMERO_CUENTA);
		assertEquals(NUMERO_CUENTA,cuentatest.getNumero());
	}


}
