package bancoAppPracticar;

import java.time.LocalDate;

public class Tarjeta extends Cuenta{
	private Cuenta mCuentaAsociada=new Cuenta(getmNumero(),getmTitular());
	private LocalDate mFechaCaducidad;
	
	public Tarjeta(String numero,String titular, LocalDate fechacaduc) {
		super(numero,titular);
		this.mFechaCaducidad=fechacaduc;
		
	}

	public Cuenta getmCuentaAsociada() {
		return mCuentaAsociada;
	}

	public void setmCuentaAsociada(Cuenta mCuentaAsociada) {
		this.mCuentaAsociada = mCuentaAsociada;
	}

	public LocalDate getmFechaCaducidad() {
		return mFechaCaducidad;
	}

	public void setmFechaCaducidad(LocalDate mFechaCaducidad) {
		this.mFechaCaducidad = mFechaCaducidad;
	}
	

}
