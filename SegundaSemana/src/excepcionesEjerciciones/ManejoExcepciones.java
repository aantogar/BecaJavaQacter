package excepcionesEjerciciones;


public class ManejoExcepciones {

	
	
	public static void main (String[]args)throws Exception ,ArithmeticException{
		//primera opción
		int a=0;
		int b=300;
		int c;
		System.out.println("PRIMER BLOQUE DE EXCEPCIONES: ");
		try {
			c=a/b;
			System.out.println("El resultado es: "+c);
		}finally{
			System.out.println("Programa finalizado");
			
		}
		
		//segunda opción
		System.out.println("\nSEGUNDO BLOQUE DE EXCEPCIONES: ");
		int d=0;
		int g=300;
		int f;
		try {
			f=d/g;
			System.out.println("El resultado es: "+f);
			
		}catch(ArithmeticException e){
			System.out.println("Ha habido un error");
			e.printStackTrace();
			throw(new Exception());
		}finally{
			System.out.println("Programa finalizado");
		}
		
		System.out.println("\nTERCER BLOQUE DE EXCEPCIONES: ");
		//creando una clase de EXCEPCIÓN
		
		int x=0;
		int y=300;
		int w;
		try {
			w=y/x;
			System.out.println("El resultado es: "+w);
		}catch(ArithmeticException e){
			//throw new MiExcepcion("Se ha producido un error.");
			throw new MiExcepcion();
		}finally{
			System.out.println("Programa finalizado");
			
		}
		
		
		
	}


}
