package ejercicioNumRandomHilos;

import java.nio.Buffer;
import java.util.Random;

public class GeneradorNum implements Runnable{
	SaveBuffer buf;
	public void setBuf(SaveBuffer buf) {
		this.buf=buf;
	}
	
	
	@Override
	public void run() {
		Random rn=new Random();
		while(true) {//para asegurarnos de que está corriendo y no pare
			synchronized(buf) {//sincronizamos
				while(buf.isDisponible()) {//cuando esté disponible
					//lanzamos mensaje
					System.out.println("Esperando espacio...");
					try {//si está disponible esperamos
						buf.wait();
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				}
				buf.setNumero(rn.nextInt());
				buf.setDisponible(true);
				System.out.println("Numoero disponible");
				buf.notifyAll();
			}
		}
	}
	
}
