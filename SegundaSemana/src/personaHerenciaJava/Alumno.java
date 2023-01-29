package personaHerencia;

import java.util.ArrayList;
import java.util.List;

public class Alumno extends Persona{
	private int curso;
	private List<String> lista=new ArrayList<String>();
	
	public Alumno(String codigo, String nombre,int edad, String telefono,int curso) {
		super(codigo,nombre,edad,telefono);
		this.curso=curso;
		this.lista=getLista();
		
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		super.mostrar();
		System.out.print("Está cursando :"+getCurso()+ 
				"º y ha añadido de asignaturas: "+getLista());
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public List<String> getLista() {
		return lista;
	}

	public void setLista(List<String> lista,String asignatura) {
		this.lista = lista;
		lista.add(asignatura);
	}
	public void addLista(String asignatura) {
		lista.add(asignatura);
		
	}

}
