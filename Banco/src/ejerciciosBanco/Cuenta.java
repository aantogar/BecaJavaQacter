package ejerciciosBanco;

import java.util.ArrayList;
import bancoUtils.Filtros;
import java.util.Collection;
import java.util.List;

public  class Cuenta {

	private final int MIN_NAME=15;
	private final int MAX_NAME=40;
	
	
	private String titular;
	private String numero;
	private  List<Movimiento> movimientos=new ArrayList<Movimiento>();
	
	
	
	public Cuenta(String numero,String titular) {
		
		this.titular=titular;
		this.numero=numero;
		
	}
	public Cuenta() {
		
	}

	public  double getSaldo()  {
		double r=0.0;
				for(Movimiento m: movimientos) {
					r+=m.getMiimporte();
				}
				return r;		
	}
	public void setSaldo(double x) {
		Movimiento mov = new Movimiento();
		mov.setConcepto("Saldo ingresado: ");
		mov.setMiimporte(x);
		movimientos.add(mov);
	}

	public void ingresar(double x)throws Exception {
		if(x<=0)
			throw new Exception("No se ha podido ingresar la cantidad.");
		ingresar("Ingreso en efectivo: ",x);
	    }
		
	
	public void ingresar(String concepto, double x) throws Exception {
		Movimiento mov=new Movimiento();
		if(x<=0)
			throw new Exception("No se ha podido ingresar la cantidad.");
		mov.setConcepto(concepto);
		mov.setMiimporte(x);
		addMovimiento(mov);
	}
	public void retirar(double x) throws Exception  {  
		if(x>0 || getSaldo()>x)
		throw new Exception("No se ha podido ingresar la cantidad.");
		retirar("Retirada de efectivo",x);
    		
	}
	public void retirar(String concepto, double x) throws Exception {
		Movimiento mov=new Movimiento();
		//metemos en un bloque try catch la operación por si no hay saldo.
		try {
			if(x>0 || getSaldo()>x) {
			mov.setConcepto(concepto);
			mov.setMiimporte(x);
			addMovimiento(mov);
			}
		}catch(Exception e) {
			throw new Exception("No hay saldo suficiente en la cuenta para realizar la operación");
		}
	}
	

	public String getTitular()  {
		return titular;
	}

	public void setTitular(String titular)  {
	
		this.titular = titular;
		
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	public List<Movimiento> getMovimientos() {
		return movimientos;
	}
	public void setMovimientos(List<Movimiento> movimientos) {
	
		this.movimientos = new ArrayList<Movimiento>(movimientos);	// pointer.
	}

	@Override
	public String toString() {
		return "Cuenta del titular: " + getTitular() + ", nº de cuenta" + numero + "\n"+
				".Ha realizado los siguientes movimientos: \n"+getMovimientos();
	}

	public void setMovimientos(List<Movimiento> movimientos,Movimiento m) {
		this.movimientos=movimientos;
	
		
	} 
	protected void addMovimiento(Movimiento m) {
		List<Movimiento>mov=getMovimientos();
		mov.add(m);
		
		
	}

}
