package ejercicioCorregidoNumRandomHilos;

public class Buffer {
	private boolean disponible;
	private int numero;
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public synchronized int getNumero() {
		while(!this.isDisponible()) {
			System.out.println("Esperando número");
			try {
				this.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		setDisponible(false);
		this.notifyAll();
		return numero;
	}
	public synchronized void setNumero(int numero) {
		while(this.isDisponible()) {
			System.out.println("Esperando espacio....");
			try{
				this.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.numero=numero;
		setDisponible(true);
		this.notifyAll();
	}
	


}
