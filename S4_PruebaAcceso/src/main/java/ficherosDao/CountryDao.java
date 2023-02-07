package ficherosDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import rf.curso.maven.ProyectoPrueba.Country;
import rf.curso.maven.ProyectoPrueba.OracleJDBC;
import util.MontadorSQL;

public class CountryDao implements CountryDaoI {
	private MontadorSQL sql;
	private  Connection con;
	public final static String LEERTODOS_COUNTRY="Select * from Countries";
	public final static String LEERTODOS_COUNTRY_POR_ID="Select * from Countries where country_id= ";
	public final static String LEERTODOS_COUNTRY_POR_ID2="Select * from countries where country_id= ?";
	public final static String DELETE_COUNTRY="Delete Countries where country_id= ?";
	
	
	public CountryDao() throws SQLException {
		OracleJDBC ora=new OracleJDBC();
		con=ora.abrir();
		
	}

	@Override
	public Country leerUno(int country_id) {
		return null;
	}

	@Override
	public List<Country> leerTodos() throws Exception  {
		ResultSet rs = null;
		List<Country> salida=new ArrayList<>();
		try {
		Statement stm=con.createStatement();
		 rs=stm.executeQuery(LEERTODOS_COUNTRY);
		while(rs.next()) {
			salida.add(carga(rs));
			}
		}catch(SQLException e) {
			throw new Exception(LEERTODOS_COUNTRY+ " "+e.getMessage());
		}
		return salida;
	}
	public Country leerUno(String country_id) throws Exception {
		ResultSet rs=null;
		try {
			Statement stm=con.createStatement();
			rs=stm.executeQuery(LEERTODOS_COUNTRY_POR_ID +"'"  +country_id+"'");
			rs.next();
			return carga(rs);
			
		}catch(SQLException e) {
			throw new Exception(LEERTODOS_COUNTRY_POR_ID+ " "+e.getMessage());
		}
	}
	
	
	public Country leerUnoOtraOpcion(String country_id) throws Exception {
		ResultSet rs=null;
		try {
			//Statement stm=con.createStatement();
			PreparedStatement ps=con.prepareStatement(LEERTODOS_COUNTRY_POR_ID2);
			ps.setString(1, country_id);
			rs=ps.executeQuery();
			
			rs.next();
			return carga(rs);
			
		}catch(SQLException e) {
			throw new Exception(LEERTODOS_COUNTRY_POR_ID+ " "+e.getMessage());
		}
	}
	public String montaSQLU(Country country) {
		String salida="";
		salida=MontadorSQL.addSalida(salida, "country_id", country.getCountry_id(),",");
		salida=MontadorSQL.addSalida(salida, "country_name", country.getCountry_name(),",");
		salida=MontadorSQL.addSalida(salida, "country_name", country.getRegion_id(),",");
		
		return salida;
		
	}
	public String montaSQLI(Country country) {
		String salida="";
		salida=MontadorSQL.addSalida(salida, "", country.getCountry_id(),",");
		salida=MontadorSQL.addSalida(salida, "", country.getCountry_name(),",");
		salida=MontadorSQL.addSalida(salida, "", country.getRegion_id(),",");
		
		return salida;
		
	}

	@Override
	public int actualizar(Country country) throws SQLException {
	String sql="Update countries set"+montaSQLU(country);
	sql+=" where ";
	sql=MontadorSQL.addSalida(sql,"country_id", country.getCountry_id(), " ");
	System.out.println(sql);
	Statement stm=con.createStatement();
	return stm.executeUpdate(sql);
	}

	@Override
	public int delete(Country country) throws SQLException {
		PreparedStatement ps=con.prepareStatement(DELETE_COUNTRY);
		ps.setString(1, country.getCountry_id());

		return ps.executeUpdate();
	}

	@Override
	public int delete(String country_id) throws Exception {
		PreparedStatement ps=con.prepareStatement(DELETE_COUNTRY);
		ps.setString(1, country_id);

		return ps.executeUpdate();
	}

	@Override
	public Country insert(Country country) {
		return null;
	}
	
	public Country carga(ResultSet rs) throws SQLException {
		Country ctr=new Country();
		ctr.setCountry_id(rs.getString("country_id"));
		ctr.setCountry_name(rs.getString("country_name"));
		ctr.setRegion_id(rs.getString("region_id"));
		return  ctr;
	}
	

}
