package figurasEjercicio;

import java.util.Scanner;

public class Circulo extends Figura{
	private double radio;
	 
	public Circulo(double radio) {
		this.radio = radio;
		calcularArea();
		calcularPerimetro();
	}
 
	public void calcularArea() {
		System.out.println("Introduzca el radio: ");
        Scanner rad= new Scanner(System.in);
        this.radio = rad.nextDouble();
		area = Math.PI * Math.pow(radio, 2);
	}
 
	public void calcularPerimetro() {
		perimetro = 2 * Math.PI * radio;
	}
	public void setCirculo(double radio) {
		System.out.println("Introduzca el alto");
        Scanner rad= new Scanner(System.in);
        this.radio = rad.nextDouble();
	}
	public double getRadio() {
		return radio;
	}

}
