package primerosEjercicios;

public abstract class Persona implements Cosas{
	private String nombre;
	private String direccion;
	private String correo;
	
	//public abstract String aString();
	
	public String aString() {
		return "nombre: " +nombre+" " + " y correo: "+ correo;
	}
	
	public Persona() {
		correo="andrea@gmail.com";
		nombre="Andrea";
		direccion="Madrid";
		
	}

	public String getCorreo() {
		return correo;
	}
	public String getNombre(){
		return nombre;
	}
	public String getDireccion(){
		return direccion;
	}
	public void setNombre(String nom) {
		this.nombre=nom;
		
	}
	public void setDirec(String direc) {
		this.direccion=direc;
		
	}
	public void setCorreo(String correo) {
		this.correo=correo;
	}
	
	public void crear() {
		System.out.println("Estamos creando a la persona");
	}
	public void borrar() {
		System.out.println("Estamos borrando a la persona");
	}
	public void enviarMensaje() {
		System.out.println("Estamos enviando un mensaje");
	}
	

}
