package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import rf.curso.maven.ProyectoPrueba.Country;
public class OracleJDBC {
	private static Connection con; 
	private final static String JDBC_DRIVER="oracle.jdbc.driver.OracleDriver";
	private final static String URL="jdbc:oracle:thin:@95.17.8.252:1521:xe";
	private final static String DATA_BASE="";
	private final static String USUARIO="hr";
	private final static String PASSWORD="hr";

	
	
	public Connection abrir() throws SQLException {
		
		try {
			Class.forName(JDBC_DRIVER);
		}catch(ClassNotFoundException e){
			System.out.println("Where is your Oracle driver");
			e.printStackTrace();
			return null;
			
		}System.out.println("JDDB DRIVER is registred");
		con=null;
		try {
			con=DriverManager.getConnection(URL+DATA_BASE,USUARIO,PASSWORD);
		}catch(SQLException e) {
			System.out.println("Connection failed! Check output your console");
			e.printStackTrace();
			return null;	
		}
		con.setAutoCommit(false);
		return con;
	}
	public void cerrarConec() throws SQLException {
		if(con!=null) {
			System.out.println("You made it,take control your database");
			con.rollback();
			con.close();
		}else {
			System.out.println("Failed to make conection");
		}
		
	}
	

}
		
	

