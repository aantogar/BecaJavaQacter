package productos;

public class testHerencias2 {

	public static void main(String[] args) {
		Congelados cong1=new Congelados("10 horas", "nitrogeno");
		//System.out.println(cong1.toString());
		cong1.toString();
		Refrigerados r1= new Refrigerados("5008");
		System.out.println(r1.toString());
		Agua ar1=new Agua("70", "60", "40", "15");
		System.out.println(ar1.toString());
		


	}

}
