package ejerciciosRevisadosPrimerosdias;

import java.util.Arrays;

public class ArrayRellenado {
	static int[][]elMes= new int[5][7];
	static int contador=0;

	public static void main(String[] args) {
		/**
		 * Definimos el ejercicio y llamamos al
		 * método desde el main para rellenar el array
		 */
		System.out.println("EJERCIO RELLENAR 'EL ARRAY'");
		devuelveArray();

   
   
	}
	public static void devuelveArray() {
		 //Bucle for
        for (int n = 0; n < elMes.length;n++)
        { //Columnas
            for(int i = 0;i < elMes[n].length;i++) { //Filas
            	if(contador<31) {
            		elMes[n][i]=++contador;
            	}
            }
            System.out.println(Arrays.deepToString(elMes));
        }
        System.out.println();	
	}
}
