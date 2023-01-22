package productosEjercicio;

import java.util.Scanner;

public class Congelados extends Productos{
	protected String temprecomen;
	protected String forma;


	

	public Congelados(String temp, String forma) {
		super("10-09-2022", "1331");
		this.temprecomen=temp;
		this.forma=forma;
		
	}



	public String getTemprecomen() {
		return " El tiempo recomendado ha sido : "+temprecomen;
	}



	@Override
	public String toString() {
		return "Estos productos han sido congelados  con el método=" + forma + ", su temperatura reocmendada es"+ getTemprecomen()
				+ "y su forma de congelación ha sido: " + getForma() + ", fecha de caducidad: " + getFechaCaduc() + "y su número de lote: "
				+ getNumLote() + "";
	}



	public void setTemprecomen(String temprecomen) {
		this.temprecomen = temprecomen;
	}



	public String getForma() {
		return comprobarTemp(forma);
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public String comprobarTemp(String forma) {

		if(this.forma.equalsIgnoreCase("agua")) {
			Agua ag=new Agua("75","30","40","25");
			System.out.println(ag.toString());
		}else if(this.forma.equalsIgnoreCase("aire")) {
			Aire air=new Aire("200");
		}else if(this.forma.equalsIgnoreCase("nitrogeno")) {
			Nitrogeno n1=new Nitrogeno("metodo 2","15");
			System.out.println(n1.toString());
		}else{
			System.out.println("La forma de congelación introducida no es correcta.");
					
		}return forma;
		
	}
}
