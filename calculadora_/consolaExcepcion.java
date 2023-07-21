import java.util.*;
public class consolaExcepcion {

    static double resultado;
    static int opcion;
    static Scanner scn;

    public static void main(String[] args) {
        scn = new Scanner(System.in);
        opcion=0;
        System.out.print(menu());

        if(scn.hasNextInt()) {
            opcion = scn.nextInt();
            if (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4) {
                proceder();
            } else if (opcion == 9) {
                System.out.print("\tGracias por utilizar nuestros servicios");
                scn.close();
                System.exit(0);
            } else {
                System.out.println("\tOpción incorrecta");
                main(null);
            }
        }else{
            System.out.println("Debes digitar números");
            main(null);
        }
    }//main

    public static String menu(){
        return  "\n\t ---Calculadora T2000 ---"+
                "\n\t1.Sumar\n\t2.Restar\n\t3.Multiplicar\n\t4.Dividir\n\t9: Salir"+
                "\n\tDigite Opción : --> ";

    }

    static void proceder(){
        resultado=0;
        System.out.print("\tDigite número 1 : --> ");
        int numUno = scn.nextInt();
        System.out.print("\tDigite número 2 : --> ");
        int numDos = scn.nextInt();

        if (opcion == 1) resultado = suma.calcular(numUno, numDos);
        if (opcion == 2) resultado = resta.calcular(numUno, numDos);
        if (opcion == 3) resultado = multiplicacion.calcular(numUno, numDos);
        if (opcion == 4) resultado = division.calcular(numUno, numDos);
        System.out.println("\tResultado es " + resultado);
        main(null);
    }



}
