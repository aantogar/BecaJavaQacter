package VehiculoEjercicioInterfaces;

public class Camion extends Vehiculo{
	private int pesoMax;
	private int precio;
	
	public Camion(int numMarchas,int velocidad,int numCh,int ruedas,int pesoMax, int precio) {
		super(numMarchas,velocidad,numCh,ruedas);
		this.pesoMax=pesoMax;
		this.precio=precio;
		
	}

	@Override
	public String toString() {
		return "El vehículo es un camion con peso máximo de :" + pesoMax + "kgs,su  precio:" + precio + ", número de marchas: " + getNumMarchas()
				+ ", su velocidad máxima es de : " + getVelocMax() + ", nº de chasis: " + getNumChasis() + ", tiene: "
				+ getNumRuedas() + "total de ruedas.";
	}

	public int getPesoMax() {
		return pesoMax;
	}

	public void setPesoMax(int pesoMax) {
		this.pesoMax = pesoMax;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	

}
