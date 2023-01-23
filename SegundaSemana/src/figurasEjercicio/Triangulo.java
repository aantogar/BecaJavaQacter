package figurasEjercicio;

import java.util.Scanner;

public class Triangulo extends Figura{
	
		 
		private double base;
		private double altura;
		private double lado1;
		private double lado2;
		private double lado3;
	 
		public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
			this.base = base;
			this.altura = altura;
			this.lado1 = lado1;
			this.lado2 = lado2;
			this.lado3 = lado3;
			calcularArea();
			calcularPerimetro();
		}
	 
		public void calcularArea() {
			System.out.println("Introduzca la altura: ");
	        Scanner alt= new Scanner(System.in);
	        this.altura = alt.nextDouble();
	        System.out.println("Introduzca la base: ");
	        Scanner bas= new Scanner(System.in);
	        this.base = bas.nextDouble();
			altura = base * altura / 2;
		}
	 
	
		public void calcularPerimetro() {
			System.out.println("Introduzca lado 1: ");
	        Scanner l1= new Scanner(System.in);
	        this.lado1 = l1.nextDouble();
	        System.out.println("Introduzca lado 2: ");
	        Scanner l2= new Scanner(System.in);
	        this.lado2 = l1.nextDouble();
	        System.out.println("Introduzca lado 3: ");
	        Scanner l3= new Scanner(System.in);
	        this.lado2 = l1.nextDouble();
			ancho = lado1 + lado2 + lado3;
		}
	 
	    public double getBas() {
	        return base;
	    }
	 

	}


