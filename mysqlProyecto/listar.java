import java.sql.*;

public class listar {

    public static void main(String[] args) throws ClassNotFoundException, SQLException,InstantiationException,IllegalAccessException{
        Connection cnx = conectar.conexion();
        String consulta= "select * from usuarios";

        String usuario="jorge1";
        String clave="111";

        Statement s = cnx.createStatement();
        ResultSet resultado = s.executeQuery(consulta);

        /*while(resultado.next()){
            System.out.print("\n"+resultado.getString("username")
                    +"\t"+resultado.getString("password")
                    +"\t"+resultado.getInt("id"));
        }*/
        boolean bnd=false;
        while(resultado.next()){
            if(resultado.getString("username").equals(usuario) && resultado.getString("password").equals(clave)){
                bnd=true;
            }
        }

        if(bnd){
            System.out.println("usuario bienvenido "+ usuario);
        }else{
            System.out.println("usuario no permitido");
        }

        cnx.close();

    }
}
