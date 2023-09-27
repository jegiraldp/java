import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class conectar{
	
	public static void main (String arg[]) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
	
	
	String url = "jdbc:mysql://127.0.0.1:3306/truckdb?user=root&password=";
    Driver d = (Driver)Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
	Connection conn = DriverManager.getConnection(url);

	if(!conn.isClosed()){
	
	System.out.println("Connected to "+ conn.getCatalog());


		DatabaseMetaData metaData = conn.getMetaData();

		// Obtener las tablas
		ResultSet resultSet = metaData.getTables(null, null, "%", new String[]{"TABLE"});

		// Iterar y mostrar el nombre de las tablas
		while (resultSet.next()) {
			String nombreTabla = resultSet.getString("TABLE_NAME");
			System.out.println("Tabla: " + nombreTabla);
		}
	}
	//conn.close()
	if(conn.isClosed()){
	
	System.out.println("BYE !!!");
	}
	
	}//main 
	}



