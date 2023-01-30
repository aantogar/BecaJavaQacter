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
		this.id_tipo=tipo;
		this.user_envio=envio;
		this.user_pago=pago;
		
		//(USER_NAME)aplicamos el filtro para saber si cumple el max longitud
		if(Validator.cumpleLongitudMax(name,MAX_CARAC)) {
			this.user_nombre=name;
		}else//si no se cumple lanzamos el mensaje de error
			throw new Exception(ErrorMessages.PROERR_002);
		
		//a(USER_EMAIL)plicamos el filtro para saber si cumple el formato de email
		if(Validator.isEmailValido(email)) {
			this.user_email=email;
		}else//si no se cumple lanzamos el mensaje de error
			throw new Exception(ErrorMessages.PROERR_001);
		
		//(USER_DNI)aplicamos el filtro para saber si se cumple el formato
		if(Validator.cumpleDNI(dni)) {
			this.user_dni=dni;
		}else//si no se cumple lanzamos el mensaje de error
			throw new Exception(ErrorMessages.PROERR_012);
			
		//(USER_PASS)aplicamos el formato de password valida
		if(Validator.esPasswordValida(pass)){
			this.user_pass=pass;
		}else //si no se cumple lanzamos el mensaje de error
			throw new Exception(ErrorMessages.PROERR_012);
		
		//(USER_FECALTA)aplicamos filtro para comprobar que la fecha es igual a la actual
		if(fech_alt.equals(FECHA_ACTUAL)) {
			this.user_fecAlta=fech_alt;
		}else//si no se cumple lanzamos el mensaje de error
			throw new Exception(ErrorMessages.PROERR_009);
		
		//(USER_FECCONFIRMACIONaplicamos filtro para comprobar que la fecha es igual a la actual
		if(fech_conf.equals(FECHA_ACTUAL)) {
			this.user_fecConfirmacion=fech_conf;
		}else//si no se cumple lanzamos el mensaje de error
			throw new Exception(ErrorMessages.PROERR_009);
			
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

	public void setUser_nombre(String user_name) {
		this.user_nombre = user_nombre;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_pass() {
		return user_pass;
	}

	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}

	public String getUser_dni() {
		return user_dni;
	}

	public void setUser_dni(String user_dni) {
		this.user_dni = user_dni;
	}

	public LocalDate getUser_fecAlta() {
		return user_fecAlta;
	}

	public void setUser_fecAlta(LocalDate user_fecAlta) {
		this.user_fecAlta = user_fecAlta;
	}

	public LocalDate getUser_fecConfirmacion() {
		return user_fecConfirmacion;
	}

	public void setUser_fecConfirmacion(LocalDate user_fecConfirmacion) {
		this.user_fecConfirmacion = user_fecConfirmacion;
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
