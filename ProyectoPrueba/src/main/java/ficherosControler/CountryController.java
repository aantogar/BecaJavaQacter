package ficherosControler;

import java.sql.SQLException;
import java.util.List;

import ficherosDao.CountryDao;
import rf.curso.maven.ProyectoPrueba.Country;

public class CountryController {
	CountryDao cDao;
	
	public CountryController()throws SQLException{
		cDao=new CountryDao();
	}
	
	public List<Country> leerTodos() throws Exception {
		
		return cDao.leerTodos();
	}
	public Country leerUno(String country_id) throws Exception {
		
		return cDao.leerUno(country_id);
	}
	public int delete(String country_id) throws Exception {

		return cDao.delete(country_id);
	}
	public int delete(Country country) throws Exception {

		return cDao.delete(country);
	}
	
	
}
