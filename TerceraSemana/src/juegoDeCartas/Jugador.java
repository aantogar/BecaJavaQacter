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
	private static List<Carta>mano=new ArrayList <Carta>();
	private static List<Jugador>jugadores=new ArrayList <Jugador>();
	private static Paquete baraja;


	public static void setMano(List<Carta> mano) {
		Jugador.mano = mano;
	}

	public static List<Carta> getMano() {
		return mano;
	}
	public Jugador(String nombre,int edad) {
		this.nombre=nombre;
		this.edad=edad;
		this.jugadores=new ArrayList<Jugador>();
	}
	
	 public static List<Jugador> getJugadores() {
		return jugadores;
	}

	public static void setJugadores(List<Jugador> jugadores) {
		Jugador.jugadores = jugadores;
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

	@Override
	public String toString() {
		return "Jugador [getNombre()=" + getNombre() + ", getEdad()=" + getEdad() + "]";
	}

	

}
