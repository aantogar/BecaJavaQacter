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
		
		//setters de los filtros aplicados
		setDir_nombre(dir_name);
		
			
	}
	public String getDir_nombre() {
		return dir_nombre;
	}
	public void setDir_nombre(String dir_nombre) throws Exception {
		//Aplicamos el filtro a para saber si cumple con max y min de longitud
		if(Validator.cumpleLongitud(dir_nombre, MIN_CARAC, MAX_CARAC)) {
			this.dir_nombre=dir_nombre;
		}else // si no se cumple devolvemos la excepción
			throw new Exception(ErrorMessages.PROERR_002);
	}
	public String getDir_direccion() {
		return dir_direccion;
	}
	public void setDir_direccion(String dir_direccion) {
		this.dir_direccion = dir_direccion;
	}
	public String getDir_poblacion() {
		return dir_poblacion;
	}
	public void setDir_poblacion(String dir_poblacion) {
		this.dir_poblacion = dir_poblacion;
	}
	public String getDir_cPostal() {
		return dir_cPostal;
	}
	public void setDir_cPostal(String dir_cPostal) {
		this.dir_cPostal = dir_cPostal;
	}
	public String getDir_provincia() {
		return dir_provincia;
	}
	public void setDir_provincia(String dir_provincia) {
		this.dir_provincia = dir_provincia;
	}
	public String getDir_pais() {
		return dir_pais;
	}
	public void setDir_pais(String dir_pais) {
		this.dir_pais = dir_pais;
	}
	public String getDir_correoE() {
		return dir_correoE;
	}
	public void setDir_correoE(String dir_correoE) {
		this.dir_correoE = dir_correoE;
	}
	public static int getMIN_CARAC() {
		return MIN_CARAC;
	}
	public static void setMIN_CARAC(int mIN_CARAC) {
		MIN_CARAC = mIN_CARAC;
	}
	public static int getMAX_CARAC() {
		return MAX_CARAC;
	}
	public static void setMAX_CARAC(int mAX_CARAC) {
		MAX_CARAC = mAX_CARAC;
	}

		
		
		
}
