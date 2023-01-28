package bancoAppPracticar;

import java.time.LocalDate;

public abstract class Movimiento {
	//declaramos sus atributos
	private String mConcepto;
	private LocalDate mFecha;
	private double mImporte;
	
	
	public Movimiento() {
		
	}


	public String getmConcepto() {
		return mConcepto;
	}


	public void setmConcepto(String mConcepto) {
		this.mConcepto = mConcepto;
	}


	public LocalDate getmFecha() {
		return mFecha;
	}


	public void setmFecha(LocalDate mFecha) {
		this.mFecha = mFecha;
	}


	public double getmImporte() {
		return mImporte;
	}


	public void setmImporte(double mImporte) {
		this.mImporte = mImporte;
	}
	

}
