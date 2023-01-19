package primerosPasos;

import java.util.Scanner;

public class DeNumerosaLetras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*String unidades[] = new String[]{"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis",
	                "siete", "ocho", "nueve"};

	        String especiales[] = new String[]{"diez","once", "doce", "trece", "catorce", "quince", "dieciseis",
	                "diecisiete", "dieciocho", "diecinueve"};

	        String decenas[] = new String[]{ "veinte", "treinta", "cuarenta", "cincuenta", "sesenta",
	                "setenta", "ochenta", "noventa"};
	        System.out.println("Introduce el numero en INTEGER: ");
	        Scanner entrada=new Scanner(System.in);
	        int numero=entrada.nextInt();

	        if (numero < 10) {
	           System.out.println(unidades[numero]);
	        }
	        if (numero < 20) {
	            System.out.println(especiales[numero - 10]);
	            
	        }
	        if (numero < 100 && numero % 10 == 0) {
	            int index = (numero / 10) - 2;
	            System.out.println(decenas[index]);
	        }

	        if(numero<100){
	            int dIndex = (numero/10)-2;
	            int uIndex = (numero%10);
	            System.out.println(decenas[dIndex] + " y " + unidades[uIndex]);
	        }
	        else {
	        	System.out.println("El numero no es valido");
	        }
	        //si retorna null es porque el numero  no es valido
	     
	        
	        /**
	         * Otra manera de solucionarlo
	         *
	         */
	    	System.out.println("EJERCICIO DE CONVERSIÓN A LETRAS: \n");
	        int unidads,decens;
	        String[]parte1= new String[]{"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis",
	                "siete", "ocho", "nueve"};
	        String[]parte2= new String[]{"diez","once", "doce", "trece", "catorce", "quince", "dieciseis",
                "diecisiete", "dieciocho", "diecinueve"};
	        String []part3 = new String[]{ "veinte", "treinta", "cuarenta", "cincuenta", "sesenta",
	                "setenta", "ochenta", "noventa"};
	        System.out.println("Introduce el numero en INTEGER: ");
	        Scanner entrada1=new Scanner(System.in);
	        int numero1=entrada1.nextInt();
	        int dIndex = (numero1/10)-2;
            int uIndex = (numero1%10);
            if(numero1<10) {
            	System.out.println(parte1[numero1]);
            }else if(numero1<20) {
            	System.out.println(parte2[numero1 -10]);
            }else if(numero1<100) {
            	System.out.println(part3[dIndex]+ " y "+parte1[uIndex]);
            }
	        

	}
	

}
