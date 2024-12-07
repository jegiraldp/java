import java.sql.*;

public class insertar {
    public static void main(String[] args) throws ClassNotFoundException, SQLException,InstantiationException,IllegalAccessException{
        Connection cnx = conectar.conexion();
        int cod=5;
        String nom="silla redonda";
        String insertar="insert into productos (codigo, nombre) values ("+cod+",\""+nom+"\")";
        System.out.println(insertar);

        Statement s = cnx.createStatement();
        s.executeUpdate(insertar);
        System.out.println("Producto Registrado");

        cnx.close();

    }

}
