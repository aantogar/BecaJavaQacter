package juegoNumAleatorio;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class JuegoContraMaquina {
	private static String mayor="m";
	private static String menor="n";
	private static String f="f";
	private static String respuesta="";
	 public static void main(String[] args) {
	        // Generar número aleatorio entre 1 y 100
		  	Random r = new Random();
		  	int valorX= r.nextInt(100)+1;
		  	int numeroElegido;
		  	int maquina;
		  	//instanciamos el scanner
	        Scanner sc = new Scanner(System.in);
	        //Enunciado para el juego
	        System.out.println("Esto es un JUEGO\n ");
	        //Comienza el bucle hasta que se acierte
	        do {
	            System.out.println("Piensa un número");
	            System.out.println("Es mayor o es menor ? el de la máquina ");
	            maquina=valorX;
	            numeroElegido = sc.nextInt();
	            Scanner entrada=new Scanner(System.in);
	            respuesta=entrada.nextLine();
	            if(respuesta.equalsIgnoreCase("m")) {
	            	if(maquina<numeroElegido) {
	            		System.out.println("No es menor");
	            		System.out.println(maquina);
	            	}
	            }else if(respuesta.equalsIgnoreCase("n")) {
	            	if(maquina>numeroElegido) {
	            		System.out.println("No es mayor");
	            		System.out.println(maquina);
	            	}
	            	else if(respuesta.equalsIgnoreCase("f")) {
		            	if(maquina==numeroElegido) {
		            		System.out.println("Nada que no ganaste!!");
		            		System.out.println(maquina);
		            	}
	            }
	            }
	        } while (maquina != numeroElegido);
	        // Si termina el ciclo while es porque los números son iguales. Felicitamos al usuario
	        System.out.println("HAS GANADO!!!");
	    
	        }
	
	 
}


