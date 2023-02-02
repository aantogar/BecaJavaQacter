package juegoDeCartas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Paquete {
	//atributos de la clase paquete(baraja)
	private static  Carta [] totalcartas = new Carta[53];
	private static final String[]PALOS= {"CORAZONES","DIAMANTES","PICAS","TRÉBOL"};
	private static Set<Carta>baraja=new HashSet<Carta>();
	private static int sigCarta;
	private static final String POKER = "POKER";
	private static int cartaActual = 0;
	private static List<Jugador>jugadores=Jugador.getJugadores();
	
	
	public Paquete(){
		//llamamos al método para construir la baraja
		construirBaraja();
		
	}
	/**
	 * Método para construit la baraja y llamarla desde el constructor
	 */
	public  void construirBaraja() {
		for (String palos : PALOS) {
			for (int i = 1; i < totalcartas.length; i++) {
				Carta carta= new Carta();
				carta.setNum(i);
				carta.setPalo(palos);
				baraja.add(carta);
			}
		}
	}
	
	
	public void mezclar(){
		//borramos el contenido de la baraja
		for(int i=0;i < this.baraja.size();i++) {
		baraja.remove(i);
		}
		//llamamos al método construir baraja
		construirBaraja();
	  }
	
	public static Set<Carta> getBaraja() {
		//utilizamos iterator para reorrer la baraja e imprimirla
		Iterator itr = baraja.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }return baraja;
	}


	public void mostrarBaraja() {
		for(Carta carta : baraja) {
			System.out.println(carta.toString());
		}
	}
	public void setBaraja(Set<Carta> baraja) {
		this.baraja = baraja;
	}
	public static String[] getPalos() {
		return PALOS;
	}

}
