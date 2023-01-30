package src.bancoAppPracticarJava;

import java.time.LocalDate;

public class Debito extends Tarjeta {
	
	public Debito(String numero,String titular,LocalDate fecha) {
		super(numero,titular,fecha);
	}

	@Override
	public double getSaldo() {
		return super.getSaldo();
	}

	@Override
	public void ingresar(double x) throws Exception {
		// TODO Auto-generated method stub
		getmCuentaAsociada().ingresar(x);
	}

	@Override
	public void retirar(double x) {
		// TODO Auto-generated method stub
		getmCuentaAsociada().retirar(x);
	}

	@Override
	public void pagoEnEstablecimiento(String datos, double x) {
		
	}

}
