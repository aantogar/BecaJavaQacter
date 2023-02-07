package s4MiniApi.rf.miniapi.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import s4MiniApi.rf.miniapi.dao.CountryDao;
import s4MiniApi.rf.miniapi.interfaces.RequestHandler;
import s4MiniApi.rf.miniapi.modelos.Country;


public class CountryController {
CountryDao cDao;
	
	public CountryController() throws SQLException {
		cDao = new CountryDao();
	}
	
	public List<Country> leerTodos() throws Exception {
		return cDao.obtenerCountries();
		
	}
	
	public Country leerUno(String country_id) throws Exception {
		return cDao.buscar(country_id);
	}
	
	public void actualizar(Country country) throws Exception {
		cDao.editar(country);
		
	}
	
	 public void delete(Country country) throws Exception {
		cDao.eliminar(country);
	 
	 }
	 
	public void delete(String country_id) throws Exception {
		cDao.eliminar(country_id);
		
	}
	
}
