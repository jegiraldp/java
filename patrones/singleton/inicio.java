public class inicio {
    public static void main(String[] args) {
        conexionDB objMySQL = conexionDB.getObjeto("1");
        objMySQL.conectar();

        conexionDB objMySQL2 = conexionDB.getObjeto("2");
        objMySQL2.conectar();

    }
    
}
