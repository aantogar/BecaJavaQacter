package bancoAppPracticar;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Credito extends Tarjeta{
	private double mCredito;
	private List<Movimiento>mMovimientos=new ArrayList<Movimiento>();
	
	
	public Credito(String numero,String titular, LocalDate fechacaduc) {
		super(numero,titular,fechacaduc);
	}


	@Override
	public void getSaldo() {
		// TODO Auto-generated method stub
		super.getSaldo();
	}


	@Override
	public void ingresar(double x) {
		// TODO Auto-generated method stub
		super.ingresar(x);
	}


	@Override
	public void retirar(double x) {
		// TODO Auto-generated method stub
		super.retirar(x);
	}


	@Override
	public void pagoEnEstablecimiento(String datos, double x) {
		// TODO Auto-generated method stub
		super.pagoEnEstablecimiento(datos, x);
	}

}
