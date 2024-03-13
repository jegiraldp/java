public class Usuarios {

    static boolean validarUsuario(String usuario, String password){
        boolean bnd=false;
        String usuarios = leerTxt.leer("usuarios.txt");
        String[] usuarioclave= usuarios.split(";");
        String[] us;

        for (int i = 0; i < usuarioclave.length; i++) {
            us=usuarioclave[i].split(",");
            if(us[0].equals(usuario) && us[1].equals(password)){
                bnd=true;
            }
        }
        return bnd;
    }
}
