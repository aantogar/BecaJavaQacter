package src.VehiculoEjercicioInterfaz;

public class accesoBBDD {
	
	public void Accesoleer(interfazLeerGrabar leido) {
		//ABRE BBDD
		//PREPARA SQL
		//EJECUTA SQL
		System.out.println("Estamos leyendo..."+leido);
	}
	public void Accesograbar(interfazLeerGrabar grabado) {
		//ABRE BBDD
		//PREPARA SQL
		//EJECUTA SQL
		grabado.leer();
		System.out.println("Estamos leyendo..."+grabado);
	}
	

}
