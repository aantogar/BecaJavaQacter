package ejercicioSincronizado;

public class NoSincro implements Runnable{
	static Integer n=1;
	private String mensaje;
	
	public void setMensaje(String mensaje) {
		this.mensaje=mensaje;
	}

	@Override
	public void run() {
		
		for(int i=0; i<10; i++) {
			synchronized(n) {
			System.out.println(mensaje + " " +n);
			n++;
			}
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
