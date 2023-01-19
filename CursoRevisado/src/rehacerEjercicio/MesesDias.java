package rehacerEjercicio;

public class MesesDias {
	static int dia=20;
	static int mes=8;
	static int año=2015;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("EJERCICIO DE FECHAS");
		System.out.println("\nComprobar que un año es correcto:");
		validaFecha2();
		validafechaReal();
		comprobarArray();
		Bisiesto();
	}
	public static void validaFecha2() {
		if(año<=0 && año>2023) {
			if(mes>=1 && mes<=12) {
				if(dia>=1 && dia<=31) {
					System.out.println("La fecha es correcta");
				}else {
					System.out.println("El dia no es correcto");
				}
			}else {
				System.out.println("El mes no es correcto");
			}
		}System.out.println("El año no es correcto");
	}
	public static void validafechaReal() {
		
		switch(mes) {
 	   case 1: case 3: case 5: case 7: case 8: case 10: case 12:
 		   if(dia<=31 && año<2023 && año>0) {
 			   System.out.println("La fecha es correcta");
 		   }else {
 			   System.out.println("La fecha no es correcta.");
 		   }
 		   break;
 	   case 2:
 		   if(dia<=28 && año<2023 && año>0) {
 			   System.out.println("La fecha es correcta");
 		   }else {
 			   System.out.println("La fecha no es correcta.");
 		   }
 		   break;

 	   case 4: case 6: case 9: case 11:
 		   if(dia<=30 && año<2023 && año>0) {
 			   System.out.println("La fecha es correcta");
 		   }else {
 			   System.out.println("La fecha no es correcta.");
 		   }
 		   break;
 	   }
	}

    
	public static void comprobarArray() {
		int []mes1= {31,28,31,30,31,30,31,31,30,31,30,31};
		boolean diaok=false;
		if(mes >=1 && mes<=12) {
			if(año!=0) {
				if(dia>0 && dia<=mes1[mes-1]) {
					System.out.println("Fecha correcta");
				}else {
					System.out.println("día incorrecto");
				}
				
			}else {
				System.out.println("año incorrecto");
			}
		}else {
				System.out.println("mes incorrecto");
			}
			
		}
	public static void Bisiesto() {
		
		int []mes1= {31,28,31,30,31,30,31,31,30,31,30,31};
		boolean diaok=false;
		if(mes >=1 && mes<=12) {
			if(año!=0) {
				if(dia>0 && dia<=mes1[mes-1]) {
					System.out.println("Fecha correcta");
				}else if((año % 4 == 0) &&(año % 400 == 0)&&(año % 100 != 0)){
					if(dia>0 && dia<=mes1[mes-1] && mes1[1]==29) {
					System.out.println("fecha correcta");
					}else{
					System.out.println("Dia incorrecto");	
					}	
				
			}else {
				System.out.println("año incorrecto");
			}
		}else {
				System.out.println("mes incorrecto");
			}
			
		}
	}

}
	


