package juegoNumAleatorio;

import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {
     
	public void Adivina()
	{     
	int numero;
	int recibido;
	Random aleatorio = new Random();
	Scanner entrada = new Scanner(System.in);
	 
	numero = aleatorio.nextInt(1000)+1;;
	 
	System.out.printf("\nTengo un numero ");
	System.out.println("Puede adivinarlo?");
	System.out.println("\nIntroduce número: \n");
	recibido = entrada.nextInt();
	while ( recibido != numero )
	{   
	if ( recibido > numero )
	{ 
	System.out.println("\nEl numero es menor.");
	recibido = entrada.nextInt();
	}   else{ 
	 System.out.println("\nEl es mayor.");
	 recibido = entrada.nextInt();
	}  
	}   

	System.out.println("\nHAS ADIVINADO EL NUMERO!");

	}           
	

}
