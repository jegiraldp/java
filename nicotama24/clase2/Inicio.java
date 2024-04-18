import java.util.Scanner;
public class Inicio {

    static Scanner scn;
    static Estudiante[] listaE;
    static int codigo, carnet;
    static String nombreC;


    public static void main(String[] args) {
        listaE = new Estudiante[10];
        scn = new Scanner(System.in);
        while(true) {
            System.out.print(menu());
            String op = scn.next();
            operar(op);
        }

    }

    static void operar(String opcion){
        System.out.println("\n--- Registrar Estudiante ---- ");
        if(opcion.equals("1")){
            System.out.print("\nDigite Código de Estudiante -> ");
            codigo= scn.nextInt();

            System.out.print("\nDigite Nombre Completo Estudiante -> ");
            nombreC = scn.next();

            System.out.print("\nDigite Carnet Estudiante -> ");
            carnet = scn.nextInt();


            listaE[0]= gestionEstudiantes.nuevoEstudiante(codigo,nombreC,carnet);
            System.out.println("Estudiante Creado con éxito");
        }

        if(opcion.equals("2")){
            System.out.println("\n-- Lista de estudiantes --");
            System.out.println("Carnet\tNombre Completo");
            for (int i = 0; i < 1; i++) {
                System.out.println(listaE[i].getCarnet()+"\t"+listaE[i].nombreCompleto);
            }
        }

        if(opcion.equals("9")){
            System.out.println("Gracias por utilizar nuestros servicios");
            System.exit(1);
        }

    }


    static String menu(){
        return "\n\n ----------- Menú ---------------" +
                "\n1. Registrar Estudiante" +
                "\n2. Listar Estudiantes" +
                "\n--------------------------" +
                "\n3. Registrar Docentes" +
                "\n4. Listar Docentes" +
                "\n--------------------------" +
               "\n9. Salir "+
                "\nDigite Opción -> ";
    }


}
