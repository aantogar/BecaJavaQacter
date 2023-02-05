package juegoNumAleatorio;
import  juegoNumAleatorio.JuegoNumeroAleat;
import  juegoNumAleatorio.JuegoContraMaquina;

import java.util.Scanner;

public class Main {
	static Scanner entrada=new Scanner(System.in);
	static int eleccion;
	static JuegoNumeroAleat juego;
	static int mirespuesta=0;
	static JuegoContraMaquina juego1;
	
	public static void main(String[]args) {
		System.out.println("JUEGOS DE ADIVINANZAS\n Elige una opción:\n1->jugar solo.\n"
				+"2->para jugar contra la maquina.");
		eleccion=entrada.nextInt();
		
		switch (eleccion) {
		case 1:
			juego.adivinaAdivinanza();
			break;
		case 2:
			juego1.ejecutaJuego();
			break;
		case 4:
			System.out.println("Tienes que ingresar una opción valida");
		}
	
	}
	

}



