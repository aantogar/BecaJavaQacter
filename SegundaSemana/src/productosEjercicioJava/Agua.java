package src.productosEjercicioJava;

import java.util.Scanner;

public class Agua extends Congelados{
	private String nitro;
	private String oxigeno;
	private String dioxido;
	private String vapor;
	private String forma;
	public Agua(String fecha,String forma,String temp,String ox, String diox, String vap, String nitro) {
		super(fecha, temp);
		this.forma=forma;
		this.oxigeno=ox;
		this.dioxido=diox;
		this.vapor=vap;
		this.nitro=nitro;

	}
	@Override
	public String toString() {
		return "Alimentos congelados por : "+getForma()+" Porcentajes, nitrógeno: " 
	+ nitro + ", oxigeno: " + oxigeno + ", dioxido: " + dioxido + ", vapor: " + vapor
				+ ". Su temperatura recomendada es: " + getTemprecomen() + ", Fecha de caducidad: "
				+ getFechaCaduc() + "y su número de lote es : " + getNumLote() + ".";
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

}
