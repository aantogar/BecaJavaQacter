package ejercicioCorregidoNumRandomHilos;


import java.util.Random;

public class GeneradorNum implements Runnable{
	Buffer buf;
	public void setBuf(Buffer buf) {
		this.buf=buf;
	}
	
	
	@Override
	public void run() {
		Random rn=new Random();
		while(true) {//para asegurarnos de que está corriendo y no pare
			buf.setNumero(rn.nextInt());
			}
		}
	
}


