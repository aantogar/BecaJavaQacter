package Herencias;

public class Productos {
	private String fechaCaduc;
	private String numLote;
	
	public Productos(String fecha, String num) {
		this.fechaCaduc=fecha;
		this.numLote=num;
		
	}

	public String getFechaCaduc() {
		return fechaCaduc;
	}

	public void setFechaCaduc(String fechaCaduc) {
		this.fechaCaduc = fechaCaduc;
	}

	public String getNumLote() {
		return numLote;
	}

	public void setNumLote(String numLote) {
		this.numLote = numLote;
	}
	

}
