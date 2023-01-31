package juegoNumAleatorio;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class JuegoContraMaquina {
	private static int mio;
	private static int robot;
	 public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
			
			System.out.println("ESTO ES UN JUEGO\n Introduce número: ");
			mio = teclado.nextInt(); 
			teclado.nextLine();
			robot=(int)(Math.random()*1000)+1;
			do {
			if(mio<robot) {
				System.out.println("el número es mayor");
				System.out.println("Vuelve a intentarlo: ");
				mio = teclado.nextInt(); 
				teclado.nextLine();
			}
			else {
				System.out.println("el número es menor");
				System.out.println("Vuelve a intentarlo: ");
				mio = teclado.nextInt(); 
				teclado.nextLine();
			}
			}
			while(mio!=robot);
			System.out.println("¡HAS GANADO AL ROBOT!: "+robot);
	    
	        
	 }
	 
}


