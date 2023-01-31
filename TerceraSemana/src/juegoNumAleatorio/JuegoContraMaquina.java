package juegoNumAleatorio;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class JuegoContraMaquina {
	static Scanner scan=new Scanner(System.in);
	static Random rn=new Random();
	static int mipartida = rn.nextInt(1000);
	static boolean fin=true;
	static final String MAYOR="m";
	static final String MENOR="n";
	static final String FIN="f";
	static int numrobot=rn.nextInt(1000);
	static int min=0;
	static int max=1000;

	public static void main (String[]args) {
		System.out.println("Comienza el juego contra la máquina.");
			do {
			Adivina();
			}while(!fin);
	}
	
	public static void Adivina() {
		int result;
		do {
			System.out.print("Introduce cual es mi numero?");
			result = scan.nextInt();
			scan.nextLine();
			if (result < mipartida) {
				System.out.println("Error el número es mayor!!!");
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

	public static void Robot() {
		String respuesta;
		int mitad=2;
		do {
		System.out.print("Soy el robot y digo que el número es: " + numrobot );
		System.out.println("Responde (M)ayor,(M)enor y (F)in");
		respuesta = scan.nextLine();
		if(respuesta.equalsIgnoreCase(MAYOR)) {
			min=(numrobot+1);
			System.out.println("El número es menor");
			Adivina();
		}else if (respuesta.equals(MENOR)){
			max = (numrobot - 1);
			System.out.println("El número es mayor");
		}else {
			numrobot=(min+max)/mitad;
			fin = true;
			System.out.println("La maquina ha adivinado el número.");
			}
		}while(!fin);
		
	}
}


