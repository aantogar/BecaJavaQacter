package juegoNumAleatorio;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class JuegoContraMaquina{
	static Scanner entrada=new Scanner(System.in);
	static int robot = (int) (Math.random() * 1000) + 1;
	static int mio = (int) (Math.random() * 1000) + 1;
	static int min = 0;
	static int max = 1000;
	static int respuesta = 0;
	static int mirespuesta = 0;
	static boolean finpartida;
	
	public static void ejecutaJuego() {
		do {
			System.out.println("Ingrese el número a adivinar");
			mirespuesta = entrada.nextInt();
			miTurno(mirespuesta);
			tiradaRobot();
		} while (finpartida);
		System.out.println("END GAME!!!");
	}	
	public static void tiradaRobot() {	
		do {
			System.out.print("El número que estás pensando es  : " + robot
					+ "? \nIntroduce 1-> Mayor \nIntroduce 2->menor"
					+ "\nIntroduce 3 si crees que acertaste: ");
			respuesta = entrada.nextInt();

			switch (respuesta) {
			case 1:
				min = robot;
				break;
			case 2:
				max = robot;
				break;
			case 3:
				respuesta = robot;
				break;
			case 4:
				System.out.println("Te gane !!");
			}
			robot = ((min +  max) / 2);
		} while (respuesta != robot);
	}

	public static boolean miTurno(int mirespuesta) {

		if (mirespuesta > mio)
			System.out.println("es menor");
		else if (mirespuesta < mio) {
			System.out.println("es mayor");
		} else if (mirespuesta == mio) {
			System.out.println("Acertaste !!");
			finpartida = true;
		}
		return finpartida;
		}
	}

