package src.rehacerEjercicioJava;

public class TablasMultiplicar {
	//declaramos variables necesarias.
	static int tabla = 1;
    static int multiplicador = 1;
    static int resultado = 0;

	public static void main(String[] args) {
		/**
		 * Mostramos por pantalla el ejercicio
		 * y llamamos al método desde el main.
		 */
		System.out.println("Ejercicio de TABLAS DE MULTIPLICAR: \n");
		multiplicar();

	    
	  }
	public static void multiplicar() {
		//comprobamos que la tabla no llegue a 11
		 while (tabla < 11) {
		        if (multiplicador==1)
		            System.out.println("Tabla de multiplicar del " + tabla);
		         //operación para el resultado de cada tabla  
		        resultado = tabla * multiplicador;
		        System.out.println(tabla + " X " + multiplicador + " = " + resultado);
		        multiplicador = multiplicador + 1;
		        //cambia de tabla cuando llega a 10
		        if (multiplicador > 10) {
		            multiplicador = 1;
		            tabla = tabla + 1;
		            System.out.println("---------");
		        }
		  }
	}

}
