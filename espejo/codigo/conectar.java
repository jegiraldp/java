import java.sql.*;
public class conectar{
	
	public static Connection nuevaConexion() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
	
	String url = "jdbc:mysql://127.0.0.1:3306/espejo?user=root&password=123456";
    Driver d = (Driver)Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
	Connection conn = DriverManager.getConnection(url);

	return conn;

	}//main 
	}



