package programaFichero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LeyendoFichero {

	public static void main(String[] args) throws IOException {
		File fichero=new File("C:\\Users\\andrea.anton.garcia\\OneDrive - Accenture\\Documents\\nombre.txt");
		FileReader fr = new FileReader(fichero);
		String cadena="";
	    BufferedReader br = new BufferedReader(fr);
	    while((cadena = br.readLine())!=null){
	        cadena = cadena.replaceAll("\n", "");
	        System.out.print(cadena+" ");
	    }
	} 

}
