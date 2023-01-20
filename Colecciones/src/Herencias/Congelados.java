package Herencias;

import java.util.Scanner;

public class Congelados extends Productos{
	private String temprecomen;
	private String forma;


	

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
	public void porcentaje() {
		String nitro="";
		String oxigeno="";
		String dioxido="";
		String vapor="";
		System.out.println("Introduzca el porcentaje de composición de nitrogeno: ");
        Scanner nt= new Scanner(System.in);
        nitro=nt.nextLine();
        System.out.println("Introduzca el porcentaje de composición de oxigeno: ");
        Scanner ox= new Scanner(System.in);
        oxigeno=ox.nextLine();
        System.out.println("Introduzca el porcentaje de composición de dioxido: ");
        Scanner diox= new Scanner(System.in);
        dioxido=diox.nextLine();
        System.out.println("Introduzca el porcentaje de composición de vapor de agua: ");
        Scanner vap= new Scanner(System.in);
        vapor=	vap.nextLine();
		System.out.println("  Se ha congelado mediante agua ,"+nitro+"% de nitrogeno, "+
				oxigeno+ "% de oxigeno, "+dioxido+"%de dioxido,y "+vapor+
				"% vapor de agua");
	}
	public void gramosSal() {
		String gramos="";
		System.out.println("Introduzca los gramos de sal en agua: ");
        Scanner gr= new Scanner(System.in);
        gramos=	gr.nextLine();
		System.out.println("  Se han utilizado "+gramos+"de sal por litro de agua para la salinización.");
	}
	public void metNitro() {
		String metodo="";
		String tiempo="";
		System.out.println("Introduzca el método de congelación de nitrógeno: ");
        Scanner met= new Scanner(System.in);
        metodo=	met.nextLine();
        System.out.println("Introduzca el método de congelación de nitrógeno: ");
        Scanner temp= new Scanner(System.in);
        tiempo=	temp.nextLine();
		System.out.println("  Se han utilizado el metodo"+metodo+" y el tiempo de congelación ha sido: "+tiempo);
	}
	public String comprobarTemp(String forma) {

		if(this.forma.equals("agua")) {
			porcentaje();
		}else if(this.forma.equalsIgnoreCase("aire")) {
			gramosSal();
		}else if(this.forma.equalsIgnoreCase("nitrogeno")) {
			metNitro();
		}else{
			System.out.println("La forma de congelación introducida no es correcta.");
					
		}return forma;
		
	}
}
