public class Usuarios {

    public static void main(String[] args) {
        System.out.println(validarUsuario("dd","cf"));
    }

    static boolean validarUsuario(String usuario, String password){
        boolean bnd=false;
        String usuarios = leerTxt.leer("usuarios.txt");
        String[] usuarioclave= usuarios.split(";");
        String[] us;

        for (int i = 0; i < usuarioclave.length; i++) {
            us=usuarioclave[i].split(",");
            System.out.println(us[0]);

        }

        return bnd;
    }


}
