package productosEjercicio;

public class Productos {
	private String fechaCaduc;
	private int numLote;
	private static int num=0;
	private boolean isFilled;
	
	
	public Productos(String fecha, int num) {
		
		this.fechaCaduc=fecha;
		setNumLote();
		
		
	}
	public Productos() {
		setNumLote();
	}

	public String getFechaCaduc() {
		return fechaCaduc;
	}

	public void setFechaCaduc(String fechaCaduc) {
		this.fechaCaduc = fechaCaduc;
	}

	public  int getNumLote() {
		return num;
	}

	public void setNumLote() {
		num++;

		
	}
	

}
