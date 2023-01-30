package es.rf.tienda.dominio;

import es.rf.tienda.util.ErrorMessages;
import es.rf.tienda.util.Validator;

public class Direccion {
	//Atributos de la clase Direccion
	private String dir_nombre;
	private String dir_direccion;
	private String dir_poblacion;
	private String dir_cPostal;
	private String dir_provincia;
	private String dir_pais;
	private String dir_correoE;
	
	//generamos constantes necesarias para aplicar a los filtros.
	private static int MIN_CARAC=5;
	private static int MAX_CARAC=5;
	
	
	
	//generamos un constructor vacio
	public Direccion() {
		
	}
	//generamos constructor con sus parámetros
	public Direccion(String dir_name,String dir_direc, String dir_pobl, String cPos,
			String prov, String pais, String corr) throws Exception {
		//la damos el valor a las variables  de los atributos
		this.dir_direccion=dir_direc;
		this.dir_poblacion=dir_pobl;
		this.dir_cPostal=cPos;
		this.dir_provincia=prov;
		this.dir_pais=pais;
		this.dir_correoE=corr;
		
		//(DIR_NOMBRE)Aplicamos el filtro a para saber si cumple con max y min de longitud
		if(Validator.cumpleLongitud(dir_name, MIN_CARAC, MAX_CARAC)) {
			this.dir_nombre=dir_name;
		}else // si no se cumple devolvemos la excepción
			throw new Exception(ErrorMessages.PROERR_002);	
	}

		
		
		
}
