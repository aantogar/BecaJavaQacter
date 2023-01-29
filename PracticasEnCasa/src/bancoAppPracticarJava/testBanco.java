package src.bancoAppPracticarJava;

import java.time.LocalDate;

public class testBanco {

	public static void main(String[] args) throws Exception {
		LocalDate local=LocalDate.now();
		Cuenta cuent=new Cuenta("123447","Andrea");
		cuent.ingresar(500);
		cuent.retirar(200);
		System.out.println(cuent.getSaldo());
		Credito cred=new Credito("1223","Antonia",local);
		cred.ingresar(500);
		cred.ingresar(200);
		cred.retirar(100);
		System.out.println(cred.getmCreditoDisponible());

	}

}
