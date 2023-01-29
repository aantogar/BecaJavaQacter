package src.primerosEjercicios;

import java.util.ArrayList;

public class Intercambio<T>{
	private T ele1;
	private T ele2;
	 private ArrayList < T > lista = new ArrayList < T >(); 
	
	public Intercambio(T a, T b) {
		ele1=a;
		ele2=b;
	}
	
	public T getUno() {
		return ele1;
	}
	
	public T getDos() {
		return ele2;
		
	}
	public  void setEle1(T ele1) {
		this.ele1=ele1;
	}
	public  void setEle2(T ele2) {
		this.ele2=ele2;
	}
	public void add() {
		lista.add(ele1);
		lista.add(ele2);	
		}
	public void intercambio() {
		T temp=getDos();
		}
	 public ArrayList<T> getProducts(){ 
		    return lista; 
		 } 
	

}
