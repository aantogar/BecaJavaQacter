package ejercicioCorregidoNumRandomHilos;

public class testNumRandom {
	static Buffer buf;

	public static void main(String[] args) {
	buf=new Buffer();
	buf.setDisponible(false);
	
	GeneradorNum gn=new GeneradorNum();
	gn.setBuf(buf);
	PresentaNumero pn=new PresentaNumero();
	pn.setBuf(buf);
	
	Thread tgn=new Thread(gn);
	Thread tpn=new Thread(pn);
	
	tgn.start();
	tpn.start();
	}

}
