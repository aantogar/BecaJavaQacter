package primerosPasos;

import java.util.Arrays;

public class Array_rellenado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]elMes= new int[5][7];
   
   
        //Mostramos el arreglo
        int contador=0;
        for (int n = 0; n < elMes.length;n++)
        { //Columnas
            for(int i = 0;i < elMes[n].length;i++) { //Filas
            	if(contador<31) {
            		elMes[n][i]=++contador;
            	}
               // System.out.println(" | " +elMes[n][i] + " | " );  
                //System.out.println("\n-----------------------");
            	}
            System.out.println(Arrays.deepToString(elMes));
        	}
        System.out.println();
    
		}
}
