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
	private static final int TOTALCARTAS = 13;
	private static final int AREPARTIR = 5;
	private static final String[]PALOS= {"CORAZONES","DIAMANTES","PICAS","TRÉBOL"};
	private static Set<Carta>baraja=new HashSet<Carta>();
	private static int sigCarta;
	private static final String POKER = "POKER";
	private static int cartaActual = 0;


	
	
	public Paquete(){
		//llamamos al método para construir la baraja
		construirBaraja();
		
	}
	/**
	 * Método para construit la baraja y llamarla desde el constructor
	 */
	public  void construirBaraja() {

			for (String palo : PALOS) {
				for (int i = 1; i < TOTALCARTAS; i++) {
					Carta carta= new Carta();
					carta.setNum(i);
					carta.setPalo(palo);
					baraja.add(carta);
			}
		}
	}
	

	

	
	public static Set<Carta> getBaraja() {

        return baraja;
	}

	public void setBaraja(Set<Carta> baraja) {
		this.baraja = baraja;
	}
	public static String[] getPalos() {
		return PALOS;
	}
	

}
