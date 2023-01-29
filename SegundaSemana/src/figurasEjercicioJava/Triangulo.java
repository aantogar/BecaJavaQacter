package src.figurasEjercicioJava;

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
			calcularArea(altura,base);
			calcularPerimetro(lado1,lado2,lado3);
		}
	 
		public void calcularArea(double altura, double base) {
	        this.altura = altura;
	        this.base = base;
			altura = base * altura / 2;
		}
	 
	
		public void calcularPerimetro(double lado1,double lado2, double lado3) {
	        this.lado1 = lado1;
	        this.lado2 = lado2;
	        this.lado3 = lado3;
			ancho = lado1 + lado2 + lado3;
		}
	 
	    public double getBas() {
	        return base;
	    }
	 

	}


