package Herencias;

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
	public String comprobarTemp(String forma) {
		if(this.forma.equals("agua")) {
			System.out.println("  Se ha congelado mediante agua ,75% de nitrogeno, 20% de oxigeno,15%de dioxido, 15% vapor de agua");
		}else if(this.forma.equalsIgnoreCase("aire")) {
			System.out.println(" Se ha congelado mediante aire, Han habído 60 gramos de sal por litro de agua");
		}else if(this.forma.equalsIgnoreCase("nitrogeno")) {
			System.out.println("Se ha congelado mediante nitrógeno y el tiempo ha sido de 10 horas.");
		}return forma;
		
	}
}
