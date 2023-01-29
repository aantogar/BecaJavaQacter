package src.ejerciciosPrimerosDiasJava;

public class MultiplosdeCinco {
	static int num1=5;
	static final int num2=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Función realizada para calcular la suma ´
		 * de los primeros diez múltiplos de 5.
		 */
		System.out.println("CALCULAR LA SUMA DE LOS PRIMEROS 10 NÚMEROS DE 5: \n");
		for (int i=num1; i<=(num1*num2);i+=num1 ) {
			System.out.println("Múltiplo: "+i +",");
		}
		int total=((num2*num2*5)+(num2*5))/2;
		System.out.println(total);
		
	}

}
