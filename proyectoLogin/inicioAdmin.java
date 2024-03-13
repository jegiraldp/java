import java.time.*;

public class inicioAdmin {

    public static void main(String[] args) {
        saludar("hola");
    }
    static void saludar(String usuario){
        System.out.println("Hola Admin "+usuario);
        String ingreso = LocalDate.now()+"-"+LocalTime.now()+"-"+usuario;
        escribirTxt.escribir(ingreso);
    }
}
