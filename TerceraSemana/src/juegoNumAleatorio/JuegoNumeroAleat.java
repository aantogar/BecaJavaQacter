package juegoNumAleatorio;

import java.util.Random;
import java.util.Scanner;

public class JuegoNumeroAleat {
	private static int num = (int) ((Math.random() * 100) + 1);
	private static Scanner entrada=new Scanner(System.in);
	private static int numX=0;
	
public static void adivinaAdivinanza() {
	do {
		System.out.println("Introduce el NÚMERO que crees que es: ");
		numX = entrada.nextInt();
		if (numX > num)
			System.out.println(numX + " es menor");
		else if (numX < num) {
			System.out.println(numX + " es mayor");
		}else if(numX==num) {
			System.out.println("HAS ACERTADO!!!");
		}else {
			System.out.println("Lo que has introducido no cumple los criterios");
		}
	}while (numX != num);
  }
}

