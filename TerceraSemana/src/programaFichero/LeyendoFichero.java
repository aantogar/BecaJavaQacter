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
	static String lectura="";
	static String nombre="";
	static String apellidos="";
	static StringBuilder cadena=new StringBuilder();
	static String nombreBuscar="nombre";
	static String apellidosBuscar="apellidos";

	public static void main(String[] args) throws IOException {
		/**
		 * Programa para leer el fichero e imprimir por pantalla sin saltos de línea
		 */
			File fichero=new File("C:\\Users\\andrea.anton.garcia\\OneDrive - Accenture\\Documents\\nombreape.txt");
			FileReader fr = new FileReader(fichero);
			//reemplazamos los saltos de linea por ""
			BufferedReader br = new BufferedReader(fr);
			while ((lectura=br.readLine())!=null) { //mientras no se llegue al final del fichero
		        //se lee una línea
		     String dato[]=lectura.split("=");
		     if(dato[0].equalsIgnoreCase(nombreBuscar)) {
				 nombre=dato[1];
				 cadena.append(nombre);
			 }
			 if(dato[0].equalsIgnoreCase(apellidosBuscar)) {
				 apellidos=dato[1];
				 cadena.append(" "+apellidos);
			 	} 
			}//Imprimimos por pantalla la cadena		
			System.out.println(cadena);
	}
}


