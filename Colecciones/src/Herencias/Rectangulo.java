package Herencias;

import java.util.Scanner;

public class Rectangulo extends Figura{

    //atributos
    double alto;
    double ancho;
 
 
    //constructor
    //creo el objeto
 
 
    public Rectangulo(double alto, double ancho, double area, double perimetro) {
        super(area, perimetro);
        System.out.println("Introduzca el alto");
        Scanner sc= new Scanner(System.in);
        this.alto = sc.nextDouble();
        System.out.println("Introduzca el ancho");
        this.ancho = sc.nextDouble();
    }
 
 
    // Getter y setter
    public double getArea() {
 
        return alto*ancho;
    }
 
    public void setArea(double area) {
        this.area = area;
    }
 
    public double getPerimetro() {
        return alto*2.0+ancho*2.0;
    }
 
 
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
 
    public double getAlto() {
        return alto;
    }
 
    public void setAlto(double alto) {
        System.out.println("Introduzca el alto");
        Scanner sc= new Scanner(System.in);
        this.alto = sc.nextDouble();
    }
 
    public double getAncho() {
        return ancho;
    }
 
    public void setAncho(double ancho) {
        System.out.println("Introduzca el ancho");
        Scanner sc= new Scanner(System.in);
        this.ancho = sc.nextDouble();
    }

}
