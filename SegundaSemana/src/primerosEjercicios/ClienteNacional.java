package src.primerosEjercicios;

public class ClienteNacional extends Cliente {
	private String nif;

	
	
	public ClienteNacional(){
		super();
		nif="";
		
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif=nif;
	}

}

