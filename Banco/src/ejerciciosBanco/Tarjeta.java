package ejerciciosBanco;

import java.time.LocalDate;
import java.util.Calendar;

import javax.xml.crypto.Data;

import bancoUtils.Filtros;

public class Tarjeta extends Cuenta{
	private LocalDate fecha;
	private Cuenta cuentasoc=new Cuenta(getNumero(),getTitular());
	LocalDate datanow=LocalDate.now();
	private final int  MIN_ANIO=datanow.getYear()-3;
	private final int MAX_ANIO=datanow.getYear()+5;
	
	Filtros filtros;
	
	public Tarjeta(String numero, String titular, LocalDate fechacaduc) throws Exception {
		super(numero,titular);
		
		if(Filtros.FilterDate(fecha, MIN_ANIO, MAX_ANIO)) {
			this.fecha=LocalDate.from(fechacaduc);
		}else 
			throw new Exception("La fecha no es correcta");
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
		super.ingresar(x);
		
	}

	@Override
	public void retirar(double x) throws Exception {
		super.retirar(x);
	}

}
