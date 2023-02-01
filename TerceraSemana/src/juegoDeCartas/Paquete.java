package juegoDeCartas;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Paquete {
	//atributos de la clase paquete(baraja)
	private static final int TOTALCARTAS=52;
	private static final String[]PALOS= {"CORAZONES","DIAMANTES","PICAS","TRÉBOL"};
	private static Set<Carta>baraja=new HashSet<Carta>();
	
	public Paquete(){

		for (String palos : PALOS) {
			for (int i = 1; i < 13; i++) {
				Carta carta= new Carta();
				carta.setNum(i);
				carta.setPalo(palos);
				baraja.add(carta);
			}
		}
	}
	
	


	public void mezclar(int cantidad){
	  List<Carta> baraja1 = baraja.stream().collect(Collectors.toList());
		Carta carta;
	    int numVeces = cantidad * baraja1.size();
	    Random rn = new Random();
	    int indice = 0;
	    for(int i = 0; i < numVeces; i++){
	      indice = rn.nextInt(baraja1.size());
	      carta = baraja1.remove(indice);
	      indice = rn.nextInt(baraja1.size());
	      baraja1.add(indice,carta);
	      Set<Carta> baraja2 = new HashSet<>(baraja1);
	      this.baraja=baraja2;
	    }
	  }
	public Set<Carta> getBaraja() {
		Iterator itr = baraja.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }return this.baraja;
	}
	public static int getTotalcartas() {
		return TOTALCARTAS;
	}
	@Override
	public String toString() {
		return "Paquete " + baraja.size() + ", getBaraja()=" + getBaraja() + "]";
	}
	public void setBaraja(Set<Carta> baraja) {
		this.baraja = baraja;
	}
	public static String[] getPalos() {
		return PALOS;
	}

}
