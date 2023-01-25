package ejerciciosBanco;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import javax.xml.crypto.Data;

public class Credito extends Tarjeta{
	private double credito;
	private  List<Movimiento> movimientosCred=new ArrayList<Movimiento>();
	private double comision=5/100;
	private double minimo=3;
	
	public Credito(String numero,String titular,LocalDate fechacaduc) throws Exception {
		super(numero,titular,fechacaduc);
	}

	public double getCredito() {
		return credito;
	}
	public  double getSaldo()  {
		double resultado=0.0;
				for(Movimiento mov: movimientosCred) {
					resultado+=mov.getMiimporte();
				}
				return resultado;		
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}
	public void liquidar(int mes, int anio) {

		double cantidad=0.0;
		double total =0;
		for(int i=0;i<movimientosCred.size();i++) {
			Movimiento mov=movimientosCred.get(i);
			if((mov.getFecha().getMonthValue() == mes && mov.getFecha().getYear()==anio)) {
				total+=mov.getMiimporte();
				this.movimientosCred.remove(mov);			
			}
		}
			Movimiento liquidar=new Movimiento();
			liquidar.setMiimporte(-total);
			liquidar.setConcepto("Liquidación de operaciones tarj.credito, "+anio+" y "+mes+
				" cantidad: "+total	);
			getCuentasoc().addMovimiento(liquidar);
		
		
	
		
		/*for(int i=this.movimientosCred.size()-1;i<=0;i--) {
			if(m.getFecha().getMonthValue()==mes && m.getFecha().getYear() == anio) {
				r+=m-getImporte
				movimiendosCred.remove(i);
			}
		for(Iterator it=movimientosCred.iterator();it.hasNext();){
			Movimiento m=(Movimiento)it.next();
			if(m.getFecha().getMonthValue()==mes && m.getFecha().getYear()== anio) {
				r+=m.getMiimporte();
				it.remove();
		}
		liq.setMiimporte(r);
		if(r!=0) {
		getCuentasoc().addMovimiento(liq);
			}*/
		
	}
	

	@Override
	public void pagoEstablecimiento(String concepto, double x) {
		// TODO Auto-generated method stub
		Movimiento mov=new Movimiento();
		concepto=("Pago con la tarjeta de credito: ");
		mov.setConcepto(concepto);
		mov.setMiimporte(x);
		addMovimiento(mov);
		credito-=x;
		
	}


	public void setSaldo(double x) {
		Movimiento mov = new Movimiento();
		mov.setConcepto("Saldo ingresado: ");
		mov.setMiimporte(x);
		//movimientosCred.add(mov);
		addMovimiento(mov);
	}




	@Override
	public String toString() {
		return "Credito : " +getCredito() + super.toString() + " y \n"+getMovimientosCred()+"\n";
	}

	@Override
	public void ingresar(double x) {
		// TODO Auto-generated method stub

	}

	@Override
	public void ingresar(String concepto, double x) throws Exception {
		// TODO Auto-generated method stub
		Movimiento mov=new Movimiento();
		if(x<=0) 
			throw new Exception("No se ha podido ingresar la cantidad.");
		mov.setConcepto(concepto);
		mov.setMiimporte(x);
		addMovimiento(mov);
		credito+=x;
	}
	

	@Override
	public void retirar(String concepto, double x) throws Exception {
		// TODO Auto-generated method stub
		Movimiento mov=new Movimiento();
		concepto=("Se ha retirado de la tarjeta de credito un total de ");
		if(x<=3)
			throw new Exception("No se ha podido sacar dinero por ser menor que 3 euros.");
		x+=x*comision;
		mov.setConcepto(concepto);
		mov.setMiimporte(-x);
		addMovimiento(mov);
		credito-=x;
		
    		
	}
	protected void addMovimiento(Movimiento m) {
		List<Movimiento>mov=getMovimientos();
		mov.add(m);
	}

	public List<Movimiento> getMovimientosCred() {
		return movimientosCred;
	}

	public void setMovimientos(List<Movimiento> movimientosCred) {
	
		this.movimientosCred = new ArrayList<Movimiento>(movimientosCred);	
	}

	@Override
	public void retirar(double x) throws Exception  {
		if(x<=3)
			throw new Exception("No se ha podido ingresar la cantidad.");
			retirar("Retirada de efectivo",x);	
	}

}
