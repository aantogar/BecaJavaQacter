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
					System.out.println("Mi número es mayor");
				}
				
				else {
					System.out.println("Mi número es menor");

				}
			}
			while(mio!=robot);
			System.out.println("¡LOS NÚMEROS SON IGUALES!: "+robot);
	    
	        
	 }
	 
}


