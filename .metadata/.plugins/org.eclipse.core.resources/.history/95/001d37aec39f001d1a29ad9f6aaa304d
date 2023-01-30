package StreamsPruebas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Ficheros {

	public static void main(String[] args) throws IOException {
		//Stream ficheros=Files.walk(Paths.get("C:\\Users\\andrea.anton.garcia\\AreadeTrabajo"));
		Stream ficheros=Files.walk(Paths.get("C:\\Users\\andrea.anton.garcia\\AreadeTrabajo"));
		ficheros
		.filter(x-> x.toString().endsWith(".java"))
		.forEach(System.out::println);
		
		
		
	}

}
