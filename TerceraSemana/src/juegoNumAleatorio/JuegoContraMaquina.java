package juegoNumAleatorio;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class JuegoContraMaquina {
	static Scanner scan=new Scanner(System.in);
	static int result=(int)(Math.random()*10)+1;
	static int mipartida = (int)(Math.random()*10)+1;
	static boolean fin=true;
	static final String MAYOR="m";
	static final String MENOR="n";
	static final String FIN="f";
	static int numrobot;
	static int min=0;
	static int max=10;

	public static void main (String[]args) {
		System.out.println("START GAME\n"
				+ "Humano vs Robot. ADIVINA EL NÚMERO: \n");
			do {//se ejecuta el bucle hasta que se cumpla la condición
				Adivina();
			}while(!fin);
	}
	
	/**
	 * Metodo para ejecutar mi turno si no se cumple se llama 
	 * al metodo ROBOT(turno ROBOT)
	 */
	public static void Adivina() {
		//mientras sea distinto a fin se ejecuta
		do {
			System.out.print("Humano introduce cual es mi numero?");
			result = scan.nextInt();
			scan.nextLine();
			if (result < mipartida) {
				System.out.println("Error el número es mayor!!!");
				//llamamos al metodo de la máquina
				Robot();
			}else if(result>mipartida) {
				System.out.println("Error el número es menor!!!");
				Robot();
			}else{
				System.out.println("Me has ganado!!!!");
				fin=true;
				}
		}while(!fin);
	}
	/**
	 * Método ROBOT si no se cumple se llama al método ADIVINA(turno humano)
	 */
	public static void Robot() {
		numrobot=(int)(Math.random()*10)+1;
		String respuesta;
		int mitad=2;
		//mientras !fin se ejecuta el metodo
		do {
			System.out.print("Soy el robot y digo que el número es: " 
			+ numrobot );
			System.out.println("\nResponde (M)ayor,me(N)or y (F)in");
			respuesta = scan.nextLine();
			if(respuesta.equalsIgnoreCase(MAYOR)) {
				min=(numrobot+1);
				numrobot=(min + max)/2;
				System.out.println("El número es menor");
				Adivina();
			}else if (respuesta.equals(MENOR)){
				max = (numrobot - 1);
				numrobot=(max+min)/2;
				System.out.println("El número es mayor");
				Adivina();
			}else {
				fin = true;
				System.out.println("La maquina ha adivinado el número.");
				}
		}while(!fin);
	}
}


