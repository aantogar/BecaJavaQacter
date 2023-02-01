package socketsJava;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

public class ClienteUrlSocketAdress {

	public static void main(String[] args) {
		/**
		 * Practicando una forma de acceder URL por socket
		 */
		try {
            // socket
            SocketAddress sockaddr = new InetSocketAddress(
                    "www.google.com", 80);
            // Creación del nuevo socket
            Socket s = new Socket();
            s.connect(sockaddr, 10000);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(s.getInputStream()));
            PrintWriter socketOut = new PrintWriter(
                    s.getOutputStream());
            StringBuffer req = new StringBuffer();
            req.append("GET / HTTP/1.1\n");
            req.append("Host: www.yahoo.com\n");
            req.append("Accept-Language: en-US,en;q=0.5\n");
            req.append("\n\n");
            socketOut.print(req);
            socketOut.flush();
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
            socketOut.close();
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
