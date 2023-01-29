package src.ejerciciosPrimerosDiasJava;

public class TablasMultiplicar {

	public static void main(String[] args) {
		int tabla = 1;
	     int multiplicador = 1;
	     int resultado = 0;

	     while (tabla < 11) {
	        if (multiplicador==1)
	            System.out.println("Tabla de multiplicar del " + tabla);
	            
	        resultado = tabla * multiplicador;
	        System.out.println(tabla + " X " + multiplicador + " = " + resultado);
	        multiplicador = multiplicador + 1;

	        if (multiplicador > 10) {
	            multiplicador = 1;
	            tabla = tabla + 1;
	            System.out.println("---------");
	        }
	     }
	  }

}
