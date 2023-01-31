package juegoNumAleatorio;

import java.util.Random;
import java.util.Scanner;

public class JuegoNumeroAleat {
	  public static void main(String[] args) {
	        // Generar número aleatorio entre 1 y 100
		  	Random r = new Random();
		  	int valorX= r.nextInt(100)+1;
		  	//valorX=(int)(Math.random()*100)+1;
		  	//variable para el usuario
		  	int numeroElegido;
		  	//instanciamos el scanner
	        Scanner sc = new Scanner(System.in);
	        //Enunciado para el juego
	        System.out.println("Esto es un JUEGO\n Ganas cuando ACIERTES EL NÚMERO ? ");
	        //Comienza el bucle hasta que se acierte
	        do {
	            System.out.println("Introduce un número: ");
	            numeroElegido = sc.nextInt();
	            if (valorX > numeroElegido) {
	                System.out.println("EL NÚMERO INTRODUCIDO ES MENOR");
	            } else if(valorX < numeroElegido) {
	                System.out.println("EL NÚMERO INTRODUCIDO ES MAYOR.");
	            }
	        } while (valorX != numeroElegido);
	        // Si termina el ciclo while es porque los números son iguales. Felicitamos al usuario
	        System.out.println("HAS GANADO!!! EL NÚMERO CON PREMIO ES: "+valorX);
	    }
	
	

}
