package s4MiniApi.rf.miniapi.dao;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import s4MiniApi.rf.miniapi.modelos.Country;
import s4MiniApi.rf.miniapi.services.JPAUtil;


public class CountryDao {
	EntityManager manager = JPAUtil.getEntityManager();

	// guardar Country
	public void guardar(Country country) {
		manager.getTransaction().begin();
		manager.persist(country);
		manager.getTransaction().commit();		
	}

	// editar Country
	public void editar(Country country) {
		manager.getTransaction().begin();
		manager.merge(country);
		manager.getTransaction().commit();
	}

	// buscar Country
	public Country buscar(String id) {
		
		Country c = manager.find(Country.class, id);
		return c;
	}

	/// eliminar Country
	public void eliminar(String id) {
		Country c = manager.find(Country.class, id);
		manager.getTransaction().begin();
		manager.remove(c);
		manager.getTransaction().commit();
	}
	
	public void eliminar(Country c) {
		eliminar(c.getCountry_id());
	}

	// obtener todos los Countries
	public List<Country> obtenerCountries() {
		List<Country> listaCountries = new ArrayList<>();
		Query q = manager.createQuery("SELECT c FROM Country c"); // No es el nombre de mi tabla de la bbdd, sino de la clase que he creado en Java
		listaCountries = (List<Country>) q.getResultList(); // No se está construyendo la categoría con los getters y los setters
		return listaCountries;
	}
}
