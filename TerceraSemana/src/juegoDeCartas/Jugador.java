package juegoDeCartas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Jugador {
	private static String nombre;
	private static int edad;
	private static Carta Carta;
	private static List<Jugador>players;
	private static List<Carta>baraja;


	public Jugador(String nombre,int edad) {
		this.nombre=nombre;
		this.edad=edad;
		this.players=new ArrayList<Jugador>();
		this.baraja=new ArrayList<Carta>();
	
	}


	public static void setMano(List<Jugador> players) {
		this.players = players;
	}

	public static List<Jugador> getPlayers() {
		return players;
	}

	@Override
	public String toString() {
		return "Jugador [getNombre()=" + getNombre() + ", getEdad()=" + getEdad() + "]";
	}


	public void robar(Carta carta){
		    this.baraja.add(carta);
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
