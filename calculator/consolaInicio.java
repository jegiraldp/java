import java.util.*;

public class consolaInicio {
    static Scanner scn;
    static int opcion;

    public static void main(String[] args) {
        scn = new Scanner(System.in);
        opcion=0;
        System.out.print(menu());

        if(scn.hasNextInt()){
            opcion=scn.nextInt();
            proceder();
        }else{
            System.out.println("Digite solo números");
            main(null);
        }

    }

    static String menu(){
        return
        "\t\n--- Calculator T2000 ---\t"
        +"\t\n1. Sumar ---"
        +"\t\n2. Restar ---"
        +"\t\n3. Multiplicar ---"
        +"\t\n4. División ---"
        +"\t\n5. Salir ---"
        +"\t\nDigite opción => ";
    }

    static void proceder(){

        if(opcion==5){
            System.out.print("\tGracias por utilizar nuestros servicios");
            scn.close();
            System.exit(0);
        }else {
            System.out.print("\n\tDigite número 1 -> ");
            int numUno = scn.nextInt();
            System.out.print("\n\tDigite número 2 -> ");
            int numDos = scn.nextInt();

            if (opcion == 1) {
                System.out.println("\n\tResultado ="
                        + suma.calcular(numUno, numDos));
            }
        }
    }
}
