package ejerciciosBanco;

import java.time.LocalDate;
import java.util.Calendar;

import javax.xml.crypto.Data;

public class testBanco {
	public static void main (String[]args) throws Exception {
		
		LocalDate date=LocalDate.now();
		Debito deb=new Debito("33456","Andrea",date);
		deb.ingresar(500);
		deb.ingresar(2000);
		deb.ingresar(1000);
		//System.out.println(dbb.getCuentasoc().getSaldo());
		Credito cred=new Credito("33456","Andrea",date);
		cred.getCuentasoc().ingresar(500);
		System.out.println(deb.getMovimientos());
		
		
	}

}
