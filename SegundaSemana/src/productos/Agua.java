package productos;

import java.util.Scanner;

public class Agua extends Congelados{
	private String nitro;
	private String oxigeno;
	private String dioxido;
	private String vapor;

	public Agua(String ox, String diox, String vap, String nitro) {
		super("-4", "agua");
		this.oxigeno=ox;
		this.dioxido=diox;
		this.vapor=vap;
		this.nitro=nitro;

	}

	public String getNitro() {
		return nitro;
	}
	public void setNitro(String nitro) {
		this.nitro = nitro;
		
	}
	public String getOxigeno() {
		return oxigeno;
	}
	public void setOxigeno(String oxigeno) {
		this.oxigeno = oxigeno;
	}
	public String getDioxido() {
		return dioxido;
	}
	public void setDioxido(String dioxido) {
		this.dioxido = dioxido;

	}
	public String getVapor() {
		return vapor;
	}
	public void setVapor(String vapor) {
		this.vapor = vapor;

	}

	@Override
	public String toString() {
		return "Congelados por agua % de nitrogeno: " + nitro +
				"%, oxigeno: " + oxigeno + "%, dioxido:" + dioxido + 
				"% y de  vapor:" + vapor + 
				". Temperatura recomendada: " + temprecomen + "y la forma:" + forma + ".";
	}

	

}
