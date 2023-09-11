import java.util.Scanner;
import java.time.Year;
public class seis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite año de nacimiento");
        String anio = sc.nextLine();
        try {
            System.out.print(seis.ingresa(Integer.parseInt(anio)));
        }catch(Exception e){
            System.out.print("Repetir proceso");
        }

        System.out.print(" -- bye");
    }

    static String ingresa(int anioNacimiento){
        Year anio = Year.now();
        int edad=anio.getValue()-anioNacimiento;
        String retorno= (edad<18) ? "Rechazado" : "Admitido";
        return "Edad: "+edad+" --- "+retorno;
    }
}
