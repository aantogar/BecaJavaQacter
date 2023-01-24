package ejerciciosBanco;

import java.time.LocalDate;
import java.util.Calendar;

import javax.xml.crypto.Data;

public class Tarjeta extends Cuenta{
	private LocalDate fecha;
	private Cuenta cuentasoc=new Cuenta(getNumero(),getTitular());
	
	public Tarjeta(String numero, String titular, LocalDate fechacaduc) {
		super(numero,titular);
		this.fecha=LocalDate.from(fechacaduc);
	
	}

	@Override
	public double getSaldo() {
		// TODO Auto-generated method stub
		return super.getSaldo();
	}

	public LocalDate getFecha() {
		return fecha;
	}
	public void pagoEstablecimiento(String datos, double x) throws Exception {
		
		
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Cuenta getCuentasoc() {
		return cuentasoc;
	}

	public void setCuentasoc(Cuenta cuentasoc) {
		this.cuentasoc = cuentasoc;
	}

	@Override
	public void ingresar(double x) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retirar(double x) throws Exception {
		super.retirar(x);
	}

}
