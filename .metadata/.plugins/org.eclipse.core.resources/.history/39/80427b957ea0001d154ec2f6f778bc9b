package bancoUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Optional;

public class Filtros {
	
	//Filtro utilizado para String
	public static boolean Filtername(String name,int min, int max) {
		return name.length() >min && name.length() < max;
	}
	
	//Filtro utilizado para comprobacion de fechas
	public static boolean FilterDate(LocalDate fecha, int min_anio,int max_anio) {
		fecha=LocalDate.now();
		return fecha.getYear()> fecha.getYear()-min_anio && fecha.getYear() <fecha.getYear()+max_anio;
	}
	
	//Filtro utilizado para comprobar longitudes de String
	public static boolean Filtercncept(String concepto, int min_con,int max_con) {
		return concepto.length()> min_con && concepto.length()< max_con;
	}
	//Filtro utilizado para comprobar x sea mayor que y
	public static boolean FilterIngresarCantidad(double x, double y)  {
		return x > y;
	}
	//Filtro utilizado para comprobar x sea menor que y
	public static boolean FilterRetirarCantidad(double x, double y){
		return x < y;
	}
	//Filtro para comprobación de fechas correctas
	public static LocalDate fechaCorrecta(String fecha,String formato) {
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern(formato);
		Optional<LocalDate>date=Optional.empty();
		try {
			date=Optional.of(LocalDate.parse(fecha,formatter));
			if(date.isPresent()) {
				return date.get();
			}
		}catch(DateTimeParseException e){
				
		}
		return null;
	}
	//Mismo método que el anterior sin el OPTIONAL
	public static LocalDate fechaCorrectaDos(String fecha,String formato) {
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern(formato);
		LocalDate date=null;
		try {
			return LocalDate.parse(fecha,formatter);
		}catch(DateTimeParseException e){
				
	  }
		return null;
	}
	
	//Filtro de metodo sobrecargado con el método anterior.
	public static LocalDate fechaCorrecta(String fecha) {
	return fechaCorrecta(fecha,"dd-MM-yyyy");
	}

	
}
