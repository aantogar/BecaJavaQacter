package juegoNumAleatorio;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class JuegoContraMaquina {
	static Random generador = new Random();
	static Scanner scan=new Scanner(System.in);
	static int mipartida=(int)generador.nextInt(10)+1;
	static int robot=(int)generador.nextInt(10)+1;
	static String mayor="m";
	static String menor="n";
	static String fin="f";

	public static void main (String[]args) {
			do {
			Adivina();
			}while(mipartida==robot);
	 
	}
	
	public static void Adivina() {
		System.out.println("Soy el humano y estoy pensando un número");
		System.out.println("Soy la máquina y creo que es: "+robot);
		System.out.println("Máquina tú piensas que es menor o mayor?");
		String respuesta=scan.nextLine();
		if(respuesta.equalsIgnoreCase(mayor)&& mipartida<robot && mipartida!=robot ) {
			System.out.println("es menor");
			System.out.println("Mi turno.");
			Robot();
			
		}else if (respuesta.equalsIgnoreCase(menor)&& mipartida>robot && mipartida!=robot){
			System.out.println("es mayor");
			System.out.println("Mi turno. ");
			Robot();
		}else if(respuesta.equalsIgnoreCase(fin)&& mipartida!=robot && mipartida!=robot){
			System.out.println("ME EQUIVOQUÉ!!!");
			Robot();
		}else {
			System.out.println("ME GANASTE!!!!");
	}
	}
	public static void Robot() {
		System.out.println("Humano introduce el número: ");
		mipartida=scan.nextInt();
		System.out.println("Soy el humano y creo que es: "+mipartida);
		System.out.println("Humano tú piensas que es menor o mayor?");
		String respuesta=scan.nextLine();
		if(respuesta.equalsIgnoreCase(mayor)&& robot<mipartida  && mipartida!=robot) {
			System.out.println("es menor");
			System.out.println("Tu turno. ");
			Adivina();
		}else if (respuesta.equalsIgnoreCase(menor)&& robot>mipartida && mipartida!=robot){
			System.out.println("es mayor");
			System.out.println("Tu turno: ");
			Adivina();
		}else if(respuesta.equalsIgnoreCase(fin)&& robot!=mipartida && mipartida!=robot){
			System.out.println("TE EQUIVOCASTE, NO ACABASTE");
			System.out.println("Tu turno.");
			Adivina();
		}else {
			System.out.println("ME GANASTE!!!!");
		}
}
}


