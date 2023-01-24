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
	
	public Credito(String numero,String titular,LocalDate fechacaduc) {
		super(numero,titular,fechacaduc);
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}
	public void liquidar(int mes, int anio) {
		Movimiento liq=new Movimiento();
		liq.setConcepto("Liquidación de operaciones tarj.credito, "+anio+" y "+mes+
			"."	);
		double r=0.0;
		/*for(int i=this.movimientosCred.size()-1;i<=0;i--) {
			if(m.getFecha().getMonthValue()==mes && m.getFecha().getYear() == anio) {
				r+=m-getImporte
				movimiendosCred.remove(i);
			}*/
		for(Iterator it=movimientosCred.iterator();it.hasNext();){
			Movimiento m=(Movimiento)it.next();
			if(m.getFecha().getMonthValue()==mes && m.getFecha().getYear()== anio) {
				r+=m.getMiimporte();
				it.remove();
		}
		liq.setMiimporte(r);
		if(r!=0) {
		getCuentasoc().addMovimiento(liq);
			}
		}
	}
	

	@Override
	public void pagoEstablecimiento(String datos, double x) {
		// TODO Auto-generated method stub
		/*datos=("Pago con la tarjeta de credito: "+x);
		this.getCuentasoc().addMovimiento(datos, x);
		credito-=x;*/
		
	}

	@Override
	public double getSaldo()  {
		// TODO Auto-generated method stub
		return super.getSaldo();
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
		mov.setMiimporte(x);
		credito-=x;
		getCuentasoc().addMovimiento(mov);
		
    		
	}

	public List<Movimiento> getMovimientosCred() {
		return movimientosCred;
	}

	public void setMovimientosCred(List<Movimiento> movimientosCred) {
		this.movimientosCred = movimientosCred;
	}

	@Override
	public void retirar(double x)  {

	}

}
