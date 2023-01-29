package src.personaHerenciaJava;

public class TestPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Profesor p1=new Profesor("B14","Antonio",41,"722450046",1900060,"01-02-2023");
		p1.mostrar();
		Alumno a1=new Alumno("B6542", "Andrea", 29,"722450046", 5);
		a1.addLista("matemáticas");
		a1.addLista("lengua");
		a1.addLista("informatica");
		a1.mostrar();

	}

}
