package ejerciciosBanco;

import java.time.LocalDate;
import java.util.Calendar;

import javax.xml.crypto.Data;

public class testBanco {
	
	public static void main (String[]args) throws Exception {
		
		LocalDate date=LocalDate.now();
		Debito deb=new Debito("33456","Andrea Antón García",date);
		deb.getCuentasoc().ingresar(500);
		deb.ingresar(2000);
		deb.ingresar(1000);
		deb.retirar(200);
		//System.out.println(dbb.getCuentasoc().getSaldo());
		Credito cred=new Credito("133113","Ana María Ballesteros Ruiz",date);
		cred.ingresar(500);
		System.out.println(deb.getCuentasoc().toString());
		cred.ingresar(2000);
		//cred.liquidar(2023, 01);
		//cred.getCuentasoc().retirar(300);
		cred.ingresar(3000);
		cred.retirar(300);
		cred.liquidar(01, 2023);
		System.out.println(cred.toString());
	
		

		
		
	}

}
