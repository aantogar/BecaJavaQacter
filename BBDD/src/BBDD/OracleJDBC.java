package BBDD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class OracleJDBC {
	private static Connection con; 
	private final static String JDBC_DRIVER="oracle.jdbc.driver.OracleDriver";
	private final static String URL="jdbc:oracle:thin:@95.17.8.252:1521:xe";
	private final static String DATA_BASE="";
	private final static String USUARIO="hr";
	private final static String PASSWORD="hr";
	public final static String LEERTODOS="Select * from Employees";
	public final static String LEERTODOS_COUNTRY="Select * from Countries";
	public static void main(String[] args) throws SQLException {
		
		
		try {
			Class.forName(JDBC_DRIVER);
		}catch(ClassNotFoundException e){
			System.out.println("Where is your Oracle driver");
			e.printStackTrace();
			return;
			
		}System.out.println("JDDB DRIVER is registred");
		con=null;
		try {
			con=DriverManager.getConnection(URL+DATA_BASE,USUARIO,PASSWORD);
		}catch(SQLException e) {
			System.out.println("Connection failed! Check output your console");
			e.printStackTrace();
			return;
			
		}
		lecturaCountry();
		lecturaEmployees();
		if(con!=null) {
			System.out.println("You made it,take control your database");
			con.close();
		}else {
			System.out.println("Failed to make conection");
		}
	}
	
	/**
	 * leyendo base de datos desde Java
	 * @throws SQLException
	 */
	public static void lecturaEmployees() throws SQLException {
		ResultSet rs = null;
		try {
		Statement stm=con.createStatement();
		 rs=stm.executeQuery(LEERTODOS);
		
		while(rs.next()) {
			System.out.println(rs.getString("First_name")+ " "+ rs.getString("last_name"));
		}
		}catch(SQLException e) {
			System.out.println(LEERTODOS+ " "+e.getMessage());
		}finally {
			if(rs!=null) {
				rs.close();
			}
		}
	}
	

	public static void lecturaCountry() throws SQLException {
		ResultSet rs = null;
		try {
		Statement stm=con.createStatement();
		 rs=stm.executeQuery(LEERTODOS_COUNTRY);
		
		while(rs.next()) {
			Country ctr=new Country();
			ctr.setCountry_id(rs.getNString("country_id"));
			ctr.setCountry_id(rs.getNString("country_name"));
			ctr.setCountry_id(rs.getNString("region_id"));
			listarCtr(ctr);
		}
		}catch(SQLException e) {
			System.out.println(LEERTODOS_COUNTRY+ " "+e.getMessage());
		}finally {
			if(rs!=null) {
				rs.close();
			}
		}
		
	}
	public static void listarCtr(Country ctr) {
		
	}
}
		
	

