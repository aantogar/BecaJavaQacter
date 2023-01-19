package primerosPasos;

public class argsCuadrado {
	int number;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,cuadrado;
		System.out.println("Convierte a String los argumentos y calcula su cuadrado: ");
		for(String nums: args)
		{
			num=Integer.parseInt(nums);
			cuadrado=num*num;
			System.out.println("Cuadrado de "+num+ " es = "+cuadrado);
		}
	  
	}

}
