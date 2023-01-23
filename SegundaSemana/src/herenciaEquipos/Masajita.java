package herenciaEquipos;

public class Masajita extends Trabajador{
	private String titulacion;
	private int aniosExp;
	
	public Masajita(String nombre, String apellidos,int edad,String titulaciom , int anios) {
		super(nombre, apellidos, edad);
		this.titulacion=titulacion;
		this.aniosExp=anios;
	}

	@Override
	public String toString() {
		return "El masajita con titulación: " + titulacion + ", tiene: " + aniosExp + ", años de experiencia, su ID es: "
	+ getId()+ ", apellidos: " + getApellidos() + ", nombre: " + getNombre() + "y su edad: " + getEdad()
				+ ".";
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getAniosExp() {
		return aniosExp;
	}

	public void setAniosExp(int aniosExp) {
		this.aniosExp = aniosExp;
	}
	public void darMasaje() {
		System.out.println("El masajita: "+getNombre()+" "+getApellidos()+
				" está dando un masaje en este momento.");
	}

}
