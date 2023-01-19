package primerosEjercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PracticaUno {

	public static void main(String[] args) {
/**
 * Primera practica de colecciones
 */
		// Declaración el ArrayList
		List<String> nombreArrayList = new ArrayList<String>();

		// Añadimos 10 Elementos en el ArrayList
		for (int i=1; i<=10; i++){
			nombreArrayList.add("Elemento "+i); 
		}

		// Añadimos un nuevo elemento al ArrayList en la posición 2
		nombreArrayList.add(2, "Elemento 3");

		// Declaramos el Iterador e imprimimos los Elementos del ArrayList
		Iterator<String> nombreIterator = nombreArrayList.iterator();
		while(nombreIterator.hasNext()){
			String elemento = nombreIterator.next();
			System.out.print(elemento+" / ");
		}

	}

}
