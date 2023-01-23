package figurasEjercicio;

import java.util.Scanner;

public class Punto extends Figura{
	private int x;
	private int e;
	private int y;
	
	public Punto(int x, int e , int y) {
		this.x=x;
		this.e=e;
		this.y=y;
	}
	
	public void cambiarCoordenadas(int num1, int num2 , int num3) {
		this.x=num1;
		this.e=num2;
		this.y=num3;
		System.out.println(" El valor de X es: "+x);
		System.out.println(" El valor de E es: "+e);
		System.out.println(" El valor de Y es: "+y);
		
		
		
	}
	public Punto() {
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
