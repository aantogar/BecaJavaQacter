package socketsJava;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClienteTCPSimple {
	public static final int PUERTO=6003;
	public static final String DIRECCION="localhost";

	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("Conectando a "+DIRECCION+ "por puerto "+PUERTO);
		Socket client =new Socket(DIRECCION,PUERTO);
		//Conseguimos un DataOutput Stream e imprimimos el mensaje
		System.out.println("conectando a "+client.getRemoteSocketAddress());
		OutputStream outToServer=client.getOutputStream();
		DataOutputStream out= new DataOutputStream(outToServer);
		out.writeUTF("Saludos "+client.getLocalSocketAddress());
		//esto es para recibir el mensaje lo leemos e imprimimos
		InputStream inFromServer=client.getInputStream();
		DataInputStream in= new DataInputStream(inFromServer);
		System.out.println(" Me han contestado "+in.readUTF());
		//ahora ya podemos cerrar el cliente
		client.close();
	
		

	}

}
