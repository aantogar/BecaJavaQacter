package src.rehacerEjercicioJava;

public class Contadores {
	//inicializamos variable con un valor
	static int valor=23;

	public static void main(String[] args) {
		/**
		 * Imprimimos por pantalla desde el main y 
		 * llamamos a su metodo correspondiente
		 */
		System.out.println("EJERCICIO DE CONTADORES:\n");
		contando();
	}
	public static void contando() {

		//sumamos  el valor con el incremento
		valor+=10;
		//Imprimimos por consola con las diferentes operaciones
		System.out.println("Resultado a: " + --valor);//32
		System.out.println("Resultado b: " + ++valor);//33
		System.out.println("Resultado c: " + valor++);//33
		System.out.println("Resultado d: " + valor--);//34
		System.out.println("Resultado e: " + valor);//33
		
	}

}
