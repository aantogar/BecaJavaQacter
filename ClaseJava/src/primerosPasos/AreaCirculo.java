package primerosPasos;


public class AreaCirculo {
	static int radio=23;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double area=Math.PI * Math.pow(radio, 2);
		double longitud;
		System.out.println("El área de un círculo con el radio: "+
		radio+" es : "+area);
		longitud= (2* Math.PI)*radio;
		System.out.println("La longitud de la circunferencia es: "+longitud);

	}

}
