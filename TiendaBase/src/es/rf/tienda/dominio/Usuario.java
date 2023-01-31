package es.rf.tienda.dominio;
import es.rf.tienda.util.*;
import java.time.LocalDate;

public class Usuario {
	//declaramos los atributos de la clase Usuario
	private static int id_usuario;
	private String user_nombre;
	private String user_email;
	private String user_pass;
	private int id_tipo;
	private String user_dni;
	private LocalDate user_fecAlta;
	private LocalDate user_fecConfirmacion;
	private String user_pago;
	private String user_envio;
	
	//variables generadas para aplicar los filtros
	private final LocalDate FECHA_ACTUAL=LocalDate.now();
	private final int MAX_CARAC=200;
	
	//iniciamos un contador para autoincrementar el ID
	private static int contador=0;
	
	//generamos constructor vacio
	public Usuario() {
		
	}
	
	//generamos constructor con sus atributos
	public Usuario(String name,String email, String pass,int tipo,String dni,
			LocalDate fech_alt,LocalDate fech_conf,String pago,
			String envio)throws Exception{
		//autoincrementamos el ID
		setId_usuario();
		
		//atribuimos los parámetros a sus atributos
		this.id_tipo=tipo;
		this.user_envio=envio;
		this.user_pago=pago;
		
		//llamamos a los setter que hemos aplicado los filtros.
		setUser_nombre(name);
		setUser_email(email);
		setUser_dni(dni);
		setUser_pass(pass);
		setUser_fecAlta(fech_alt);
		setUser_fecConfirmacion(fech_conf); 
			
	}
	

	public static int getId_usuario() {
		return contador;
	}

	public static void setId_usuario() {
		contador++;
	}

	public String getUser_name() {
		return user_nombre;
	}

	public void setUser_nombre(String user_name) throws Exception {
		//(aplicamos el filtro para saber si cumple el max longitud
		if(Validator.cumpleLongitudMax(user_name,MAX_CARAC)) {
			this.user_nombre=user_name;
		}else//si no se cumple lanzamos el mensaje de error
			throw new Exception(ErrorMessages.PROERR_002);
		
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) throws Exception {
		//aplicamos el filtro para saber si cumple el formato de email
		if(Validator.isEmailValido(user_email)) {
			this.user_email=user_email;
		}else//si no se cumple lanzamos el mensaje de error
			throw new Exception(ErrorMessages.PROERR_001);
	}

	public String getUser_pass() {
		return user_pass;
	}

	public void setUser_pass(String user_pass) throws Exception {
		//(aplicamos el formato de password valida
		if(Validator.esPasswordValida(user_pass)){
			this.user_pass=user_pass;
		}else //si no se cumple lanzamos el mensaje de error
			throw new Exception(ErrorMessages.PROERR_012);
	}

	public String getUser_dni() {
		return user_dni;
	}

	public void setUser_dni(String user_dni) throws Exception {
		//aplicamos el filtro para saber si se cumple el formato
		if(Validator.cumpleDNI(user_dni)) {
			this.user_dni=user_dni;
		}else//si no se cumple lanzamos el mensaje de error
			throw new Exception(ErrorMessages.PROERR_012);
	}

	public LocalDate getUser_fecAlta() {
		return user_fecAlta;
	}

	public void setUser_fecAlta(LocalDate user_fecAlta) throws Exception {
		//aplicamos filtro para comprobar que la fecha es igual a la actual
		if(user_fecAlta.equals(FECHA_ACTUAL)) {
			this.user_fecAlta=user_fecAlta;
		}else//si no se cumple lanzamos el mensaje de error
			throw new Exception(ErrorMessages.PROERR_009);
	}

	public LocalDate getUser_fecConfirmacion() {
		return user_fecConfirmacion;
	}

	public void setUser_fecConfirmacion(LocalDate user_fecConfirmacion) throws Exception {
		//(USER_FECCONFIRMACIONaplicamos filtro para comprobar que la fecha es igual a la actual
		if(user_fecConfirmacion.equals(FECHA_ACTUAL)) {
			this.user_fecConfirmacion=user_fecConfirmacion;
		}else//si no se cumple lanzamos el mensaje de error
			throw new Exception(ErrorMessages.PROERR_009);
	}

	public String getUser_pago() {
		return user_pago;
	}

	public void setUser_pago(String user_pago) {
		this.user_pago = user_pago;
	}

	public String getUser_envio() {
		return user_envio;
	}

	public void setUser_envio(String user_envio) {
		this.user_envio = user_envio;
	}
	
	
	
	

	
	
}
