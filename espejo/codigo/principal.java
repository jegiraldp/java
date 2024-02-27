import java.sql.*;

public class principal {

    public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        int codigo = 0;
        String nombre = "";


        ///////////// conexión

        System.out.println("Base de datos");
        Connection  ObjetoConector = conectar.nuevaConexion();
        System.out.println("Conectado a "+ObjetoConector.getCatalog());

        ///////////////////// insertar

        int code = 9096;
        String name = "jean";

        insert.nuevo(ObjetoConector,code,name);
        System.out.println("Dato registrado");

        ////////////////// listar


        ResultSet resultado = selectmysql.listar(ObjetoConector);

        while(resultado.next()) {
            codigo = resultado.getInt("codigo");
            nombre = resultado.getString("nombre");
            System.out.println(codigo + " | " + nombre);

        }//while

        //////////////////////////
        ObjetoConector.close();
        System.out.println("Close");

    }
}
