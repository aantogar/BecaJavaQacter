package src.bancoAppPracticarJava;

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
	public String toString() {
		return "Credito [mCredito=" + mCredito + ", mMovimientos=" + mMovimientos + ", getmCredito()=" + getmCredito()
				+ ", getmFechaCaducidad()=" + getmFechaCaducidad() + ", getmNumero()=" + getmNumero()
				+ ", getmTitular()=" + getmTitular() + "]";
	}


	public double getmCredito() {
		return mCredito;
	}


	public void setmCredito(double mCredito) {
		this.mCredito = mCredito;
	}


	public List<Movimiento> getmMovimientos() {
		return mMovimientos;
	}


	public void setmMovimientos(List<Movimiento> mMovimientos) {
		this.mMovimientos = mMovimientos;
	}


	@Override
	public double getSaldo() {
		return super.getSaldo();
	}


	@Override
	public void ingresar(double x) throws Exception {
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
