package programaFichero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class LeyendoFichero {
	static String linea;
	static String nombre="nombre";
	static String apellidos="";
	static String lectura="";

	public static void main(String[] args) throws IOException {
		/**
		 * Programa para leer el fichero e imprimir por pantalla sin saltos de línea
		 */
			File fichero=new File("C:\\Users\\andrea.anton.garcia\\OneDrive - Accenture\\Documents\\nombreape.txt");
			FileReader fr = new FileReader(fichero);
			String cadena="";
			//reemplazamos los saltos de linea por ""
			BufferedReader br = new BufferedReader(fr);
			while ((lectura=br.readLine())!=null) { //mientras no se llegue al final del fichero
		        //se lee una línea
		     System.out.println(lectura);
		     String dato[]=lectura.split("=");
		     if(dato[0].equalsIgnoreCase("nombre")) {
				 nombre=dato[1];
			 }
			 if(dato[0].equalsIgnoreCase("apellido")) {
				 apellidos=dato[1];
			 }
			 System.out.println(nombre+ " "+apellidos);
	}
}
}


