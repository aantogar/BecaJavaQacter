package ejerciciosBanco;

import java.time.LocalDate;
import java.util.Calendar;

import javax.xml.crypto.Data;

public class testBanco {
	public static void main (String[]args) throws Exception {
		
		LocalDate date=LocalDate.now();
		Debito deb=new Debito("33456","Andrea",date);
		deb.getCuentasoc().ingresar(500);
		deb.ingresar(2000);
		deb.ingresar(1000);
		//System.out.println(dbb.getCuentasoc().getSaldo());
		Credito cred=new Credito("133113","Laura",date);
		cred.getCuentasoc().ingresar(500);
		System.out.println(deb.getCuentasoc().toString());
		cred.getCuentasoc().ingresar(2000);
		cred.liquidar(1, 2023);
		//cred.getCuentasoc().retirar(300);
		System.out.println(cred.getCuentasoc().toString());
		
		
	}

}
