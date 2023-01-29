package src.primerosPasosJava;

import javax.swing.JOptionPane;

public class Practicando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre=JOptionPane.showInputDialog("Cual es tu nombre?");
		String entrada=JOptionPane.showInputDialog("¿Hoy que día estás cursando de curso?");
		int numdia=Integer.parseInt(entrada);
		String entrada1=JOptionPane.showInputDialog("Puntúa del 1 al 10 tu satisfacción: ");
		int puntuacion=Integer.parseInt(entrada1);
		String entrada2=JOptionPane.showInputDialog("¿Crees que vas a aprender mucho?");
		
		
		System.out.println("HOLA QUERIDO ALUMNO: "+nombre+"!!!");
		
		if(numdia>7) {
			System.out.println("FELICIDADES!!! HAS SUPERADO TU PRIMERA SEMANA");
		}else {
			System.out.println("Espero que te esté gustando la primera semana!!");
		}
		
		if(puntuacion>=5) {
			System.out.println("ME ALEGRO QUE ESTES SATISFECHO CON EL CURSO!!!");
		}else {
			System.out.println("Vaya, lamento que no estés satisfecho, espero que los próximos días te gusten más!!");
		}
		
		if(entrada2.equalsIgnoreCase("si")) {
			System.out.println("EXACTO!!!, VAS A SALIR MUY BIEN PREPARADO/A");
		}else {
			System.out.println("LO LAMENTAMOS, SEGUIREMOS TRABAJANDO PARA CAMBIAR TU OPINIÓN.");
		}

	}

}
