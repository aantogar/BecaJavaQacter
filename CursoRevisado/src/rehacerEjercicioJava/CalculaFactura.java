package src.rehacerEjercicioJava;

public class CalculaFactura {
	//variables estáticas
	static int cantidad=3;
	static int unidades=12;
	static double precio=5.4;
	static double importe;
	static final int IVA=21;


	public static void main(String[] args) {
		/**
		 * Nombramos el ejercicio y llamamos a su
		 * metodo desde el main.
		 */
		System.out.println("EJERCICIO QUE CALCULA LA FACTURA"
				+ " CORRESPONDIENTE CON EL IVA:\n");
		//metodo
		operaciones();
		
	}
	public static void operaciones() {
		//asignamos el valor correspondiente a las variables
		importe=(cantidad*unidades)*precio;
		double iva=importe*IVA/100;
		//hacemos un cast para cambiar int a double
		double totalRes=importe+iva;
		
		//Imprimimos por consola los resultados
		System.out.println("Cantidad: "+cantidad);
		System.out.println("Unidades: "+unidades);
		System.out.println("Precio : "+precio);
		System.out.println("Importe "+importe);
		System.out.println("Iva : "+iva);
		System.out.println("El TOTAL ascienda a  : "+totalRes);	
	}

}
