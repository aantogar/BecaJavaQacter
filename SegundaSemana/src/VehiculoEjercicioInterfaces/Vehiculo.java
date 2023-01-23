package VehiculoEjercicioInterfaces;

public class Vehiculo implements interfazDos {
	private int numMarchas;
	private int velocMax;
	private int numChasis;
	private int numRuedas;
	
	public Vehiculo(int numMarchas,int velocidad,int numCh,int ruedas) {
		this.numMarchas=numMarchas;
		this.velocMax=velocidad;
		this.numChasis=numCh;
		this.numRuedas=ruedas;
	}

	public int getNumMarchas() {
		return numMarchas;
	}

	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}

	public int getVelocMax() {
		return velocMax;
	}

	public void setVelocMax(int velocMax) {
		this.velocMax = velocMax;
	}


	public int getNumChasis() {
		return numChasis;
	}

	public void setNumChasis(int numChasis) {
		this.numChasis = numChasis;
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}



	@Override
	public void grabar(String dato) {
		// TODO Auto-generated method stub
		System.out.println("Grabando: "+dato);
		
	}

	@Override
	public void leer(String dato) {
		// TODO Auto-generated method stub
		System.out.println("Leyendo: "+dato);
		
	}

}
