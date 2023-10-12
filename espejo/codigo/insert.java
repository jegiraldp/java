import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.util.*;	


public class insert{

	public static void nuevo(Connection conn, int codigo, String nombre) throws IllegalAccessException, ClassNotFoundException, SQLException, InstantiationException{
		
	String  SQLInsert = "insert into productos (codigo, nombre) values ("+codigo+",\""+nombre+"\")";
	Statement s = conn.createStatement();
	s.executeUpdate(SQLInsert);


	}
	}