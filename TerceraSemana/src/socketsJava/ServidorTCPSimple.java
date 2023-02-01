package socketsJava;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class ServidorTCPSimple {
	public static final String SALUDO="Servidor esperando a puerto";
	public static final int TIMEOUT=10000;
	public static final int PUERTO=6003;
	
	static ServerSocket serverSocket;
	

	public static void main(String[] args) throws Exception {
		serverSocket=new ServerSocket(PUERTO);
		serverSocket.setSoTimeout(TIMEOUT);
		
		while(true) {
			try {
				System.out.println(SALUDO+ serverSocket.getLocalPort()+"...");
				Socket server=serverSocket.accept();
				DataInputStream in=new DataInputStream(server.getInputStream());
				System.out.println(in.readUTF());
				DataOutputStream out=new DataOutputStream(server.getOutputStream());
				out.writeUTF("Gracias por conectarte a " +server.getLocalSocketAddress()+" Chao!!");
				server.close();
				break;
			}catch(SocketTimeoutException s) {
				System.out.println("Socked timeout");
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			
		}
		
		

	}


}
