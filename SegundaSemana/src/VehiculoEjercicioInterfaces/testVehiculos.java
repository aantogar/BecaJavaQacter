package VehiculoEjercicioInterfaces;

public class testVehiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo[]lista=new Vehiculo[3];
		
		lista[0]=new Coche(5, 230, 13311331, 4, "azul", 5);
		lista[1]=new Moto(5, 230, 13311331, 4, 200);
		lista[2]=new Camion(5, 230, 13311331, 4, 3000, 18000);
		System.out.println(lista[0]);
		System.out.println(lista[1]);
		System.out.println(lista[2]);
		Coche ch=new Coche(5, 230, 13311331, 4, "rosa", 5);
		ch.reductora(false);
		
		

	}


}
