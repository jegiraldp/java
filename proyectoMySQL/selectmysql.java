import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;	


public class selectmysql{
	
	public static void main (String arg[])throws ClassNotFoundException, SQLException, InstantiationException,IllegalAccessException{

		String url = "jdbc:mysql://127.0.0.1:3306/truckdb?user=root&password=manthaAll1*";
		Driver d = (Driver)Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection(url);
	
	String  SQLSelect = "select * from elementos";
	Statement s = conn.createStatement();
	ResultSet resultado = s.executeQuery(SQLSelect);
	String str = "xx",str2 = "xx";
	
	while(resultado.next()) {
    str = resultado.getString("id");
    str2 = resultado.getString("nombre");
    
   	System.out.println(str + " | " + str2);
   
	}//while
	

	
	conn.close();
		
	}//main
	}