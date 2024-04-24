import java.sql.*;

public class conectar {

public static Connection conexion() throws ClassNotFoundException, SQLException,InstantiationException,IllegalAccessException{
        String url = "jdbc:mysql://127.0.0.1:3306/poo2?user=root&password=manthaAll1*";
        Driver d = (Driver)Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        Connection conn = DriverManager.getConnection(url);

    //System.out.println("Conectado");
//    System.out.println("Connected to "+ conn.getCatalog());
    return conn;
    }
}
