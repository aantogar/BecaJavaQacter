package bancoUtils;

import java.time.LocalDate;

public class Filtros {
	
	//Filtro utilizado para String
	public static boolean Filtername(String name,int min, int max) {
		return name.length() >min || name.length() < max;
	}
	
	//Filtro utilizado para comprobacion de fechas
	public static boolean FilterDate(LocalDate fecha, int min_anio,int max_anio) {
		fecha=LocalDate.now();
		return fecha.getYear()> fecha.getYear()-min_anio || fecha.getYear() <fecha.getYear()+max_anio;
	}
	
	//Filtro utilizado para comprobar longitudes de String
	public static boolean Filtercncept(String concepto, int min_con,int max_con) {
		return concepto.length()> min_con || concepto.length()< max_con;
	}
	//Filtro utilizado para comprobar x sea mayor que y
	public static boolean FilterIngresarCantidad(double x, double y)  {
		return x > y;
	}
	//Filtro utilizado para comprobar x sea menor que y
	public static boolean FilterRetirarCantidad(double x, double y){
		return x < y;
	}

}
