package src.primerosPasosJava;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int precio=5;
		boolean resultado=true;
		String nombre="Hola amiga";
		if(precio>0 & resultado) {
			System.out.println("CORRECTO");
		}else {
			System.out.println("NO ES CORRECTO");
		}
		if(nombre!=null & nombre.length()<=10 ) {
			System.out.println("Contiene 10 o  más de 10 carácteres");
		}else {
			System.out.println("Tiene menos del 10 carácteres");
		}//expresión condicional booleana
		int valor=resultado?precio: 50;
		System.out.println(valor);

	}

}
