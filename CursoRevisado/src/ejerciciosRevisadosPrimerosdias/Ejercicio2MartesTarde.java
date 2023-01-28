package ejerciciosRevisadosPrimerosdias;

public class Ejercicio2MartesTarde {
	static int nota=2;
	static String nota3= "Tu nota ";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("EJERCICIO DE VALORACIÓN DE NOTA\n");
		calcula();
		
		
		
	}
	public static void calcula() {
		if(nota<5) {
			System.out.println(nota3 +nota+ "es insuficiente");
		}else if(nota==5) {
			System.out.println (nota3+nota+ " es suficiente");
		}else if(nota==6) {
			System.out.println(nota3 +nota+ " es un bien");
		}else if(nota==7 || nota==8) {
			System.out.println(nota3+nota+ " es un notable");
		}else {
		}System.out.println(nota3 +nota+ " es un sobresaliente");
	}

}
