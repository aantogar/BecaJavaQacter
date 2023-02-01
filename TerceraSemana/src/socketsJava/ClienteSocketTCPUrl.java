package socketsJava;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;

import javax.net.ssl.HttpsURLConnection;

public class ClienteSocketTCPUrl {
	public static final int PUERTO=443;
	public static final String DIRECCION="localhost";
	public static final String serverdirec="www.recursosformacion.com";

	public static void main(String[] args) throws UnknownHostException, IOException {
		/*try{
		System.out.println("Conectando a "+serverdirec+ "por puerto "+PUERTO);
		
		Socket client =new Socket(serverdirec,PUERTO);
		//Conseguimos un DataOutput Stream e imprimimos el mensaje
		System.out.println("conectando a "+client.getRemoteSocketAddress());
		OutputStream outToServer=client.getOutputStream();
		DataOutputStream out= new DataOutputStream(outToServer);
		out.writeUTF("Saludos "+client.getLocalSocketAddress());
		//esto es para recibir el mensaje lo leemos e imprimimos
		InputStream inFromServer=client.getInputStream();
		DataInputStream in= new DataInputStream(inFromServer);
		int lectura=in.read();
		while(lectura!=-1) {
			System.out.println(lectura);
			lectura=in.read();
		}
		//client.close();	
	}*/
		/**
		 * Otra forma de UrlConnection
		 */
		try {
		URL url=new URL("https://recursosformacion.com/wordpress");
		HttpsURLConnection huc=(HttpsURLConnection)url.openConnection();
		huc.addRequestProperty("User-Agent", "Mozilla/4.0(compatible; MSIE 6.0; Windows NT 5.0)");
		for (int i=1;i<=8;i++) {
			System.out.println(huc.getHeaderFieldKey(i)+ " = "+huc.getHeaderField(i));
		}
		huc.disconnect();
		
		}catch (Exception e) {
        e.printStackTrace();
	}
  }
}
