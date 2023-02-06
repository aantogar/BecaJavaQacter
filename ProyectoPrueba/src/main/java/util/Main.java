package util;

import java.util.List;

import ficherosControler.CountryController;
import rf.curso.maven.ProyectoPrueba.Country;

public class Main {

	public static void main(String[] args) throws Exception {
		CountryController cc=new CountryController();
		List<Country>ll=cc.leerTodos();
		listarCtr(ll);
		Country aborrar=cc.leerUno("BR");
		System.out.println("Registros afectatos: "+cc.delete(aborrar));

	}	
	public static void listarCtr(List<Country>ctr) {
		ctr.stream().forEach(System.out::println);
	}

}
