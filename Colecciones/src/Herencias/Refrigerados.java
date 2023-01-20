package Herencias;

public class Refrigerados extends Productos{
	private String codOrg;
	
	
	public Refrigerados(String codigo) {
		super("10-20-2020", "1020");
		this.codOrg=codigo;
	}


	@Override
	public String toString() {
		return "Productos refrigerados su código de organización es :" + codOrg +
				", su fecha de caducidad :" + getFechaCaduc() + "y su número de lote: "
				+ getNumLote() + "";
	}


	public String getCodOrg() {
		return codOrg;
	}


	public void setCodOrg(String codOrg) {
		this.codOrg = codOrg;
	}

}
