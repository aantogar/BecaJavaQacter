package ficherosDao;

import java.sql.SQLException;
import java.util.List;

import rf.curso.maven.ProyectoPrueba.Country;

public interface CountryDaoI {
	public Country leerUno(int country_id);
	public List<Country>leerTodos()throws  Exception ;
	public int actualizar(Country country) throws SQLException;
	public int delete(Country country) throws Exception;
	public int delete(String country_id) throws Exception;
	public Country insert(Country country);
	public Country leerUno(String country_id) throws Exception;
	
	

	
	

}
