package src.productosEjercicioJava;

public class Aire extends Congelados{
	private String gramosSal;
	private String temp;
	private String forma;


	public Aire(String gramos,String temp, String forma) {
		super(temp,forma);
		this.gramosSal=gramos;
		// TODO Auto-generated constructor stub
	}

	public String getGramosSal() {
		return gramosSal;
	}

	@Override
	public String toString() {
		return " Los productos han sido congelados mediante el método: "+
	getForma()+", contiene: " + gramosSal + 
				"gramos de sal. Su temperatura recomendada es: "+getTemprecomen()+". Su fecha de caducidad es :"+
	getFechaCaduc()+ " y su número de lote es: "+getNumLote()+".";
	}

	public void setGramosSal(String gramosSal) {
		this.gramosSal = gramosSal;
	}

}
