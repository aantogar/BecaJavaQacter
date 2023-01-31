package juegoDeCartas;

import java.util.HashSet;
import java.util.Set;

public class Paquete {
	static final String[]PALOS= {"oros","copas","espadas","bastos"};
	private Set<Carta>baraja=new HashSet<>();
	
	public Paquete(){
		
	}
	
	
	
	
	public Set<Carta> getBaraja() {
		return baraja;
	}
	public void setBaraja(Set<Carta> baraja) {
		this.baraja = baraja;
	}
	public static String[] getPalos() {
		return PALOS;
	}

}
