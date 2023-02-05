package juegoDeCartas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Juego {
	private static final int NUM_CARTAS = 5;
	private static Paquete paquete;
	private static Jugador jugador;
	private static Set<Carta> baraja=Paquete.getBaraja();
	private static Set<Jugador> jugadores;
	
/**
 * 
 * Main, donde se va a ejecutar los métodos de la partida
 */
	public static void main(String[] args) {
		Set<Jugador> jugadores=new HashSet<Jugador>();
		paquete=new Paquete();
		paquete.construirBaraja();
		baraja.forEach(System.out::println);
		crearJugadores(jugadores);
		//repartirCartas(baraja,jugadores);
		visualizarJugadores(jugadores);
		//jugadores.forEach(System.out::println);

	}
	public static  void crearJugadores(Set<Jugador>jugadores) {
		Jugador j1=new Jugador();
		j1.setNombre("Andrea");
		j1.setEdad(29);
		jugadores.add(j1);
		
		Jugador j2=new Jugador();
		j2.setNombre("Luis");
		j2.setEdad(19);
		jugadores.add(j2);
		
		Jugador j3=new Jugador();
		j3.setNombre("Maria");
		j3.setEdad(22);
		jugadores.add(j3);
		
		Jugador j4=new Jugador();
		j4.setNombre("Mario");
		j4.setEdad(32);
		jugadores.add(j4);

		
	}
	
	public static void repartirCartas(Set<Carta> baraja,Set<Jugador> jugadores) {
		Iterator<Carta> iterator = baraja.iterator();
		for(int i = 0; i < NUM_CARTAS; i++) {
			for(Iterator<Jugador> jugad = jugadores.iterator();
					jugad.hasNext();) {
				Jugador actual = jugad.next();
				actual.robar(iterator.next());
				iterator.remove();
			}
		}
	}
	static void visualizarJugadores(Set<Jugador> jugadores) {
	    for(Jugador juga: jugadores)
	    	System.out.println(juga.toString());
	        }	

	}	    


