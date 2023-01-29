package src.pruebaInterfacesJava;

public interface InterfazUno {
	public int cuenta(int a, int b);
	
	public default int resuelto(int a) {
		return a*2;
	}
	public default String  holi() {
		return "Hola como estas";
	}
	
}
