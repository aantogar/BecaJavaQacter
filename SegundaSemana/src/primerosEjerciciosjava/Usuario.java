package primerosEjerciciosjava;

public  class Usuario extends Persona{
	private String codigo;
	
	public  Usuario() {
		super();
		codigo="12345";
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo=codigo;
	}

	@Override
	public String aString() {
		// TODO Auto-generated method stub
		return null;
	}

}
