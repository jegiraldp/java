import java.sql.*;
<<<<<<< HEAD
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
	
=======
public class conectar{
	
	public static Connection nuevaConexion() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
	
	String url = "jdbc:mysql://127.0.0.1:3306/espejo?user=root&password=123456";
    Driver d = (Driver)Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
	Connection conn = DriverManager.getConnection(url);

	return conn;

>>>>>>> 03a49bee4ff221dea3c81330d4c3ab67932944a8
	}//main 
	}



