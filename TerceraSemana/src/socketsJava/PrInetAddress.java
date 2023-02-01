package socketsJava;

import java.net.InetAddress;

public class PrInetAddress {

	public static void main(String[] args) {
		try {
			InetAddress ip=InetAddress.getByName("recursosformacion.com");
			InetAddress ipMio=InetAddress.getLocalHost();
			
			System.out.println("Host Name: "+ ip.getHostName());
			System.out.println("IP Address: "+ ip.getHostAddress());
			
			System.out.println("Host Name local: "+ ipMio.getHostName());
			System.out.println("IP Address local: "+ ipMio.getHostAddress());
		}catch(Exception e){
			System.out.println(e);
		}

	}

}
