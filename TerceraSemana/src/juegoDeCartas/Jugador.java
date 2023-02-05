package juegoDeCartas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Jugador {
	@Override
	public String toString() {
		return "Jugador [getNombre()=" + nombre + ", edad" + edad + "]";
	}

	private static String nombre;
	private static int edad;
	private static Carta Carta;
	private static Set<Carta>mano;

	
	public Jugador() {
		this.mano=new HashSet<>();
		
	}
	
	public Jugador(String nombre,int edad,Set<Carta>mano) {
	super();
	this.nombre=nombre;
	this.edad=edad;

	}


	public static Set<Carta> getMano() {
		return mano;
	}


	public void robar(Carta carta){
		    this.mano.add(carta);
		  }

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}




	

}
