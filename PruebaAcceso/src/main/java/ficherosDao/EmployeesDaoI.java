package ficherosDao;

import java.util.List;

import rf.curso.maven.ProyectoPrueba.Employees;

public interface EmployeesDaoI {
	public Employees leerUno(int employes_id);
	public List<Employees>leerTodos();
	public int actualizar(Employees iemployees);
	public int delete(Employees employees);
	public int delete(int employees_id);
	public Employees insert(Employees employees);

}
