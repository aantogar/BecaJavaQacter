package teoriayPracticas;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CreandoFicheros {

	public static void main(String[] args) throws IOException {
		/**
		 * Utilizando path para origen y destino
		 */
		//ruta al fichero origen
		//para copiar un fichero
		Path pathsource=Paths.get("C:\\Users\\andrea.anton.garcia\\OneDrive - Accenture\\Documents\\","Prueba.txt");
		Path pathsource2=Paths.get("C:\\Users\\andrea.anton.garcia\\OneDrive - Accenture\\Documents\\","probandoFile.txt");
		Path target=Files.copy(pathsource, pathsource, StandardCopyOption.REPLACE_EXISTING);
		System.out.println(target.getFileName());
		
		//para mover un fichero
		Path origen=Paths.get("C:\\Users\\andrea.anton.garcia\\OneDrive - Accenture\\Documents\\","Prueba.txt");
		Path destino=Paths.get("C:\\Users\\andrea.anton.garcia\\OneDrive - Accenture\\Documents\\","movido.txt");
		Files.move(origen, destino, StandardCopyOption.REPLACE_EXISTING);
		
		
		//Crear un fichero con path
		File fichero = new File ("C:\\Users\\andrea.anton.garcia\\OneDrive - Accenture\\Documents\\","creado.txt");
		
	
		
		
	}
	
	

}
