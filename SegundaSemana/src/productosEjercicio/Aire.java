package productosEjercicio;

public class Aire extends Congelados{
	private String gramosSal;

	public Aire(String gramos) {
		super("-16", "aire");
		this.gramosSal=gramos;
		// TODO Auto-generated constructor stub
	}

	public String getGramosSal() {
		return gramosSal;
	}


	
	@Override
	public String toString() {
		return " La congelación mediante aire contiene" + gramosSal + 
				"gramos de sal, temperatura recomendada: " + temprecomen + "y su forma de congelación: " + forma + ".";
	}

	public void setGramosSal(String gramosSal) {
		this.gramosSal = gramosSal;
	}

}
