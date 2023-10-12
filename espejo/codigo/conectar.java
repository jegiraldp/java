import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class conectar{
	
	public static void main (String arg[]) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
	
	String url = "jdbc:mysql://127.0.0.1:3306/tienda?user=root&password=manthaAll1*";
    Driver d = (Driver)Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
	Connection conn = DriverManager.getConnection(url);

	if(!conn.isClosed()){
	
	System.out.println("Connected to "+ conn.getCatalog());

	}
	//conn.close()
	if(conn.isClosed()){
	
	System.out.println("BYE !!!");
	}
	
	}//main 
	}



