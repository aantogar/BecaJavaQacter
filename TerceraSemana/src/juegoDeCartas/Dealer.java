package juegoDeCartas;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Dealer {
	private static final int CANTIDADCARTAS=5;
	private static final int NUM_JUGADOR=4;
	private  static Paquete paquete=new Paquete();
	private static List<Jugador> jugadores = Jugador.getJugadores();
	private static Set<Carta> mano = Paquete.getBaraja();
	
	
	/**
	 * Método desde el cual vamos a invocar a los demás
	 * 
	 */
	
	public void comenzarPartida() {
		//llamamos al metodo de pedir los datos a los jugadores
		datosJugadores();
		//comprobamos que los jugadores sean 4
		if(jugadores.size()== 4) {
		this.paquete.construirBaraja();
		System.out.println("LOS JUGADORES QUE TENEMOS HOY EN LA MESA SON: \n");
		for(int i=0;i<jugadores.size(); i++) {
			System.out.println("Jugador "+(i+1)+" nombre--> "+jugadores.get(i).getNombre());
			}
		}//Visualizamos la baraja
		paquete.mostrarBaraja();
		//llamamos al método para repartir baraja
		repartir();
	}
	
	/**
	 * Aquí comienzan los metodos que necesita el DEALER para su partida
	 * de POKER
	 * 
	 */
	public void datosJugadores() {
		System.out.println("BIENVENIDOS AL CASINO!!\n Empezamos la partida de POKER."+
				"\nA continuación pediremos el nombre y la edad de cada participante: ");
		//metodo para cargar los jugadores
		Scanner entrada=new Scanner(System.in);
		 for (int i = 0; i < 4; i++) {
		        System.out.println("Introduzca el nombre jugador "+(i+1)+" : ");
		        String nombre = entrada.next();
		        System.out.println("Introduzca el edad jugador "+ (i+1)+" :");
		        int edad=entrada.nextInt();
		        entrada.nextLine();
		        Jugador jugador= new Jugador(nombre,edad);
		        jugadores.add(jugador);
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

	public void visualizarMano() {
		//aquí vamos a visualizar la mano que le ha tocado a cada uno
		for(Carta carta: this.mano)
			System.out.println(carta.toString());
			
		
	}
}
