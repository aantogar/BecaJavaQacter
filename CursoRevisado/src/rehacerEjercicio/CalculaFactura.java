package rehacerEjercicio;

public class CalculaFactura {
	final static int IVA=21;



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cantidad=3;
		int unidades=12;
		double precio=5.4;
		double importe;
		importe=(double)(cantidad*unidades)*precio;
		double iva=importe*IVA/100;
		double totalRes=(double)importe+iva;
		
		
		System.out.println("Cantidad: "+cantidad);
		System.out.println("Unidades: "+unidades);
		System.out.println("Precio : "+precio);
		System.out.println("Importe "+importe);
		System.out.println("Iva : "+iva);
		System.out.println("Total : "+totalRes);
		
		

	}

}
