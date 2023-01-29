package src.bancoAppPracticarJava;

import java.time.LocalDate;

public class Tarjeta extends Cuenta{
	private LocalDate mFechaCaducidad;
	 private Cuenta mCuentaAsociada=new Cuenta(getmTitular(),getmNumero());
	
	public Tarjeta(String numero,String titular, LocalDate fechacaduc) {
		//llamamos a los atributos del padre
		super(numero,titular);
		this.mFechaCaducidad=fechacaduc;
		
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
	public void pagoEnEstablecimiento(String datos,double x) {
		
	}


	public Cuenta getmCuentaAsociada() {
		return mCuentaAsociada;
	}

	public void setmCuentaAsociada(Cuenta mCuentaAsociada) {
		//creamos el objeto cuenta y le pasamos los metodos getter para vincular con cuenta
		this.mCuentaAsociada = mCuentaAsociada;
	}

	public LocalDate getmFechaCaducidad() {
		return mFechaCaducidad;
	}

	public void setmFechaCaducidad(LocalDate mFechaCaducidad) {
		this.mFechaCaducidad = mFechaCaducidad;
	}
	

}
