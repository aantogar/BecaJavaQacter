package VehiculoEjercicioInterfaces;

public class Moto extends Vehiculo {
	private int deposito;
	
	public Moto(int numMarchas,int velocidad,int numCh,int ruedas,int deposito) {
		super(numMarchas,velocidad,numCh,ruedas);
		this.deposito=deposito;
		
	}

	@Override
	public String toString() {
		return "El vehículo es una moto con: " + deposito + " litros de capacidad de depósito. Tiene: " + getNumMarchas() + " marchas, su velocidad máxima es de : "
				+ getVelocMax() + " km/h, nº de chasis: " + getNumChasis() + " y tiene: " + getNumRuedas() + "ruedas.";
	}

	public int getDeposito() {
		return deposito;
	}

	public void setDeposito(int deposito) {
		this.deposito = deposito;
	}

}
