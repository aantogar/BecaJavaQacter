package juegoDeCartas;

import java.util.Set;

public class Juego {
	private int CARTAS=5;
	static Paquete paq;
	static Set<Carta>baraja;
	static Set<Jugador>jugador;
	
	

	public static void main(String[] args) {
		paq=new Paquete();
		baraja=paq.getBaraja();
		baraja.forEach(System.out::println);

	}

}
