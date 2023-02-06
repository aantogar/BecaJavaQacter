package util;

public class MontadorSQL {
	public static String addSalida(String salida, String nombreCampo,int valor,String separador) {
		return addSalidaSencilla(salida,nombreCampo,""+valor,separador);
	}
	public static String addSalida(String salida, String nombreCampo,double valor,String separador) {
		return  addSalidaSencilla(salida,nombreCampo,""+valor,separador);
	}
	public static String addSalida(String salida, String nombreCampo,long valor,String separador) {
		return  addSalidaSencilla(salida,nombreCampo,"" +valor,separador);
	}
	public static String addSalida(String salida, String nombreCampo,String valor,String separador) {
		return  addSalidaSencilla(salida,nombreCampo,"'"+ valor +"'",separador);
	}
	
	
	public static String addSalidaSencilla(String salida, String nombreCampo,String valor,String separador) {
		if(salida.length()>0) {
			salida+=" "+separador+" ";
		}
		if(nombreCampo!=null && nombreCampo.compareTo("")>0) {
			salida+=nombreCampo +" = ";
		}
		salida+=valor;
		return salida;

		
	}

}
