package juegoDeCartas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Poker {
	private static final int CANTIDADCARTAS=5;
	private static final int NUM_JUGADOR=4;
	private  static Paquete paquete=new Paquete();
	private static List<Jugador> jugadores = new ArrayList<Jugador>();
	private static Set<Carta> mano = Paquete.getBaraja();

	
	
	/**
	 * Método desde el cual vamos a invocar a los demás
	 * 
	 */
	
	public void comenzarPartida() {
		System.out.println("BIENVENIDOS AL CASINO!!\n Empezamos la partida de POKER."+
		"\nA continuación pediremos el nombre y la edad de cada participante: ");
		datosJugadores();
		
		//comprobamos que los jugadores sean 4
		if(jugadores.size()== 4) {
		this.paquete.construirBaraja();
		System.out.println("LOS JUGADORES QUE TENEMOS HOY EN LA MESA SON: \n");
		visualizarJugador();
		}//Visualizamos la baraja
		//visualizarBaraja();
		//llamamos al método para repartir baraja
		repartir();
		//Visualizamos la mano de cada jugador llamando a su metodo
		//visualizarMano();
	}
	
	/**
	 * Aquí comienzan los metodos que necesita el DEALER para su partida
	 * de POKER
	 * 
	 */
	public void datosJugadores() {
		Jugador num1 = new Jugador("Andrea",29);
		Jugador num2 = new Jugador("Jose",30);
		Jugador num3 = new Jugador("Maria",40);
		Jugador num4 = new Jugador("Carlos",22);
		
	
		this.jugadores.add(num1);
		this.jugadores.add(num2);
		this.jugadores.add(num3);
		this.jugadores.add(num4);
	}
	
	/**
	 * metodo para visualizar jugadores
	 * 
	 */
	public void visualizarJugador() {
		for(Jugador j: jugadores) {
			System.out.println("Jugador -->"+j.toString());
			
		}
	}
	/**
	 * Método para repartir cartas
	 */
	public static void repartir() {
		Iterator<Carta> iterator = mano.iterator();
		for(Jugador jugador: jugadores){
		for (int i=0; i<CANTIDADCARTAS; i++) {
			jugador.robar(iterator.next()); 
			iterator.remove(); 
			}
		}
	}
	public void visualizarBaraja() {
	paquete.mostrarBaraja();
	}

	public void visualizarMano() {
		//aquí vamos a visualizar la mano que le ha tocado a cada uno
		for(int i=0;i<jugadores.size();i++) { //
			System.out.println("Jugador--> " + jugadores.get(i).getNombre()); 
			for(Carta card : jugadores.get(i).getMano()) { 
				System.out.println(card.toString()); 
				System.out.println("----------------------");
			}
			
		}
	}
}
