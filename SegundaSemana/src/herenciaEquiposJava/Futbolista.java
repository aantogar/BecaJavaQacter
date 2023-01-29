package src.herenciaEquiposJava;

public class Futbolista extends Trabajador{
	private int dorsal=0;
	private String demarcacion;
	
	
	public Futbolista(String nombre, String apellidos, int edad, int dorsal,String demarcacion) {
		super(nombre, apellidos,edad);
		this.dorsal=dorsal;
		this.demarcacion=demarcacion;
	}


	public int getDorsal() {
		return dorsal;
	}


	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}


	public String getDemarcacion() {
		return demarcacion;
	}


	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}
	public void jugarPartido() {
		System.out.println("El jugador "+getNombre()+" "+getApellidos()+
				"está jugando ahora mismo un partido.");
	}
	public void entrenar() {
		System.out.println("El jugador "+getNombre()+" "+getApellidos()+
				" está entrenando en estos momentos. ");
	}


	@Override
	public String toString() {
		return "El futbolista " + dorsal + ", con demarcacion: " + demarcacion + ",con ID: " + getId()
				+ ", apellidos: " + getApellidos() + ", nombre: " + getNombre() + ", su edad es: " + getEdad()
				+ ".";
	}

}
