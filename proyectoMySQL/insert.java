import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.util.*;	


public class insert{
	
	public static void main (String arg[])throws IllegalAccessException, ClassNotFoundException, SQLException, InstantiationException{
		
	String url = "jdbc:mysql://127.0.0.1:3306/tienda?user=root&password=manthaAll1*";
	
	Driver d = (Driver)Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
    Connection conn = DriverManager.getConnection(url);
		
	String  SQLInsert = "insert into productos (codigo, nombre) values (998,'silla')";
	Statement s = conn.createStatement();
	s.executeUpdate(SQLInsert);
	
	conn.close();
	
	System.out.println("Desconectado!!");
	
	}
	}