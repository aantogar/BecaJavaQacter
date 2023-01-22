package rehacerEjercicio;

public class ArgumCuadrado {
	static int num;
	static int cuadrado;
	public static void main(String[] args) {
		System.out.println("EJERCICIO CALCULA MEDIDAS DEL CUADRADO: \n");
		/**
		 * Solicitamos número por comando y 
		 * y realizamos función para calcular medidas.
		 */
		System.out.println("Convierte a String los argumentos y calcula su cuadrado: ");
		for(String nums: args)
		{
			num=Integer.parseInt(nums);
			cuadrado=num*num;
			System.out.println("Cuadrado de "+num+ " es = "+cuadrado);
		}
	  
	}

}
