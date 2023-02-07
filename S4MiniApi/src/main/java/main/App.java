package main;

import java.util.List;

import s4MiniApi.rf.miniapi.modelos.Country;
import s4MiniApi.rf.miniapi.controller.CountryController;

public class App {
	
	  public static void main( String[] args ) throws Exception
	    {
	    	CountryController cc = new CountryController();
			List<Country> listCountry = cc.leerTodos();
			listarCtr(listCountry);
			
			System.out.println("------------------------------------------------------------------");
			System.out.println(cc.leerUno("BR"));
			
			System.out.println("------------------------------------------------------------------");
			Country country = cc.leerUno("BR");
			country.setCountry_name("El nombre ha variado");
			cc.actualizar(country);
			System.out.println(cc.leerUno("BR"));
			
			System.out.println("------------------------------------------------------------------");
			Country countryDelete = cc.leerUno("BR");
			cc.delete(countryDelete);
			System.out.println("Afectados borrados: ");
			
		}
		
		public static void listarCtr(List<Country> ctr) {
			ctr.stream().forEach(System.out::println);
		}
}
