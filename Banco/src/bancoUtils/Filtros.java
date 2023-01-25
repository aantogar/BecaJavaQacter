package bancoUtils;

import java.time.LocalDate;

public class Filtros {
	
	public static boolean Filtername(String name,int min, int max) {
		if(name.length() < min || name.length() >max )
			return false;
		return true;
	}
	
	public static boolean FilterDate(LocalDate fecha) {
		fecha=LocalDate.now();
		if(fecha.getYear()< fecha.getYear()-3 || fecha.getYear() >fecha.getYear()+5)
			return false;
		return true;
	}
	
	public static boolean Filterconcept(String concepto, int min,int max) {
		if(concepto.length()< min || concepto.length()> max)
			return false;
		return true;
	}
	public static boolean FilterIngresarCantidad(double x, double y)  {
		return x > y;
		
	}

}
