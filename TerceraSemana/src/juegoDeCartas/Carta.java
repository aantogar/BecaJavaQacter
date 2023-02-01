package juegoDeCartas;

public class Carta {
	private int num;
	private String palo;
	public int getNum() {
		return num;
	}
	

	public void setNum(int num) {
		this.num = num;
	}
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	@Override
	public String toString() {
		return "[ CARTA: " + num + " PALO: " + palo + "]";
	}

}
