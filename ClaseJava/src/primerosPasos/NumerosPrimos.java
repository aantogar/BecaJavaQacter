package primerosPasos;

public class NumerosPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 boolean primo;
	        System.out.println("Son números primos del 1 al 100:\n");
	        // Estructura for
	        int contador=0;
	        for (int num = 2; num <= 100; num++) {
	            primo = true;

	            for (int i = num - 1; i > 1; i--) {
	                if (num % i == 0) {
	                    primo = false;
	                    break;
	                }//fin if
	            }//fin for
	            if (primo) {
	            	contador++;
	                System.out.println(num + " es primo");
	            }//fin if
	        }//fin for
	        System.out.println("El total de números primos es: "+contador);
	    }//fin main


	

}
