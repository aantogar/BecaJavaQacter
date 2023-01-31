package programaFichero;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class DatosPorTeclado {

	public static void main(String[] args) {
		/**
		 * Programa que pide datos por teclado los almacena y vuelca a un fichero
		 */
		System.out.println("Hola.\nPor favor, introduce tu nombre: ");
		Scanner entrada=new Scanner(System.in);
		String nombre=entrada.nextLine();
		System.out.println("\n¡Muy bien! Ahora introduce tus apellidos: ");
		String apellidos=entrada.nextLine();
		//Creamos el nuevo fichero
	
		        FileWriter fichero = null;
		        PrintWriter pw = null;
		        try
		        {
		            fichero = new FileWriter("C:\\Users\\andrea.anton.garcia\\OneDrive - Accenture\\Documents\\nombreape.txt");
		            pw = new PrintWriter(fichero);
		                pw.println("Nombre=" + nombre);
		                pw.println("Apellidos=" + apellidos);

		        } catch (Exception e) {
		            e.printStackTrace();
		        } finally {
		           try {
		           // Nuevamente aprovechamos el finally para 
		           // asegurarnos que se cierra el fichero.
		           if (null != fichero)
		              fichero.close();
		           } catch (Exception e2) {
		              e2.printStackTrace();
		           }
		        }
		    }
		

}
