package ejercicioNumRandomHilos;

public class PresentaNumero implements Runnable {
	SaveBuffer buf;
	
	public void setBuf(SaveBuffer buf) {
		this.buf=buf;
	}

	@Override
	public void run() {
		while(true) {
			synchronized(buf) {
				while(!buf.isDisponible()) {
					System.out.println("Esperando número");
						try {
							buf.wait();
						}catch(InterruptedException e) {
							e.printStackTrace();
						
					}
				}
				System.out.println(buf.getNumero());
				buf.setDisponible(false);
				buf.notifyAll();
			}
		}
	}

}
