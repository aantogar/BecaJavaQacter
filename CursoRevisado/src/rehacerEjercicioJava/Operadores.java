package src.rehacerEjercicioJava;

public class Operadores {
	static int precio=5;
	static boolean resultado=true;
	static String nombre="Hola amiga";

	public static void main(String[] args) {
		/**
		 * Creamos un método y lo llamamos desde el main.
		 */
		System.out.println("EJERCICIO DE OPERADORES: \n");
		//llamamos al método.
		operadores();
	}
	public static void operadores() {
		if(precio>0 && resultado) {
			System.out.println("CORRECTO");
		}else {
			System.out.println("NO ES CORRECTO");
		}//comprobamos que nombre no es null y su longitud
		if(nombre!=null && nombre.length()<=10 ) {
			System.out.println("Contiene 10 o  más de 10 carácteres");
		}else {
			System.out.println("Tiene menos del 10 carácteres");
		}//expresión condicional booleana
		int valor=resultado?precio: 50;
		System.out.println(valor);
		
	}

}
