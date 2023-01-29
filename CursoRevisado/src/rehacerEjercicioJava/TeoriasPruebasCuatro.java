package rehacerEjercicio;

import java.time.LocalTime;

public class TeoriasPruebasCuatro {

	private boolean seguro=false;
	private int importe=0;
	private double cantidad=0d;
	public static String frase="Esto es una frase";
	public String HOLI="";
	
	
	public static void main (String[]ars) {
		contarFrase();
		Enlace enlace= new Enlace();
		enlace.hora=LocalTime.now();
		enlace.url="www.google.com";
		enlace.modificar();
		
		Enlace enlace1= new Enlace();
		enlace1.hora=LocalTime.now();
		enlace1.url="www.soundcloud.com";
		enlace1.modificar();
		
		Enlace enlace2= new Enlace();
		enlace2.hora=LocalTime.now();
		enlace2.url="www.abailar.com";
		enlace2.modificar();
		

		
	}
	
	public void setImport(int impor) {
		this.importe=impor;
	}
	public int getImporte() {
		return importe;
	}
	public void valores() {
		this.importe=123;
		this.cantidad=500;
		
		
	}
	public static void contarFrase() {
		System.out.println("La frase '"+ frase + "' tiene : "+frase.length()+
				" letras.");
	}
}
