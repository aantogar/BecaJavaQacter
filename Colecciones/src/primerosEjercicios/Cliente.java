package primerosEjercicios;

public  class Cliente extends Persona{
	private String numeroCliente;
	private String fechaAlta;
	
	
	
	public static void main(String[]args) {
		
		
		
	}
	
	public Cliente() {
		super();
		numeroCliente="13";
		fechaAlta="24/02/2022";
	
	}

	public String getFecha() {
		return fechaAlta;
	}
	public String getNumeroCliente(){
		return numeroCliente;
	}

	public void setNumeroCliente(String fecha) {
		this.fechaAlta=fecha;
		
	}
	public void setNumero(String numero) {
		this.numeroCliente=numero;
	}
	public void setFecha(String fecha) {
		this.fechaAlta=fecha;
	}
	public void guardar() {
		System.out.println("Estamos guardando sus datos");
	}
	
	public void leyendo() {
		System.out.println("Leyendo datos...\n Nombre: " +getNombre()+
			"\nFecha de alta: "+getFecha()+ "\n su correo :"+getCorreo());
	}


	@Override
	public String aString() {
		String salida=super.aString();
		return "Cliente: " +getNombre()+ " y su numero de cliente : "+getFecha()+
				" \nmás los atributos del PADRE: "+salida;
	}
	

}
