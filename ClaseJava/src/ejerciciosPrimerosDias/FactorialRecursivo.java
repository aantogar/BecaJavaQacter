package ejerciciosPrimerosDias;

public class FactorialRecursivo {
	public static void main(String[]args) {
		/**
		 * Realizamos función para resolver factorial
		 */
		int fact=8;
		long factorial;
		factorial=1;
		for(int i=fact; i>0; i--) {
			factorial=factorial*i;
		}
		System.out.println("Ejercicio de factorial:\n");
		System.out.println("El factorial del num "+fact+
				" es: "+factorial);
		
	}

}
