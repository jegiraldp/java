import java.sql.*;
<<<<<<< HEAD
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;	


public class selectmysql{
	
	public static void main (String arg[])throws ClassNotFoundException, SQLException, InstantiationException,IllegalAccessException{

		String url = "jdbc:mysql://127.0.0.1:3306/tienda?user=root&password=manthaAll1*";
		Driver d = (Driver)Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection(url);
	
	String  SQLSelect = "select * from productos";
	Statement s = conn.createStatement();
	ResultSet resultado = s.executeQuery(SQLSelect);
	String str = "xx",str2 = "xx";
	
	while(resultado.next()) {
    str = resultado.getString("codigo");
    str2 = resultado.getString("nombre");
    
   	System.out.println(str + " | " + str2);
   
	}//while
	

	
	conn.close();
=======

public class selectmysql{
	
	public static ResultSet listar(Connection conn)throws ClassNotFoundException, SQLException, InstantiationException,IllegalAccessException{

	String  SQLSelect = "select * from productos";
	Statement s = conn.createStatement();
	ResultSet resultado = s.executeQuery(SQLSelect);
	return resultado;
>>>>>>> 03a49bee4ff221dea3c81330d4c3ab67932944a8
		
	}//main
	}