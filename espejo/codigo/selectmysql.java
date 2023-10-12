import java.sql.*;

public class selectmysql{
	
	public static ResultSet listar(Connection conn)throws ClassNotFoundException, SQLException, InstantiationException,IllegalAccessException{

	String  SQLSelect = "select * from productos";
	Statement s = conn.createStatement();
	ResultSet resultado = s.executeQuery(SQLSelect);
	return resultado;
		
	}//main
	}