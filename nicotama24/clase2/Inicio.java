import java.util.Scanner;
public class Inicio {

    static Scanner scn;
    static Estudiante[] listaE;
    static int codigo, carnet, contadorEs, posicion, codigoBuscar;
    static String nombreC, nuevoNombre;


    public static void main(String[] args) {
        posicion=99;
        contadorEs=0;
        listaE = new Estudiante[3];
        scn = new Scanner(System.in);
        while(true) {
            System.out.print(menu());
            String op = scn.next();
            operar(op);
        }

    }

    static void operar(String opcion){

        if(opcion.equals("1")){
            if(contadorEs==listaE.length){
                System.out.println("No se pueden registrar más estudiantes");
            }else {
                System.out.println("\n--- Registrar Estudiante ---- ");

                System.out.print("\nDigite Código de Estudiante -> ");
                codigo = scn.nextInt();

                System.out.print("\nDigite Nombre Completo Estudiante -> ");
                nombreC = scn.next();

                System.out.print("\nDigite Carnet Estudiante -> ");
                carnet = scn.nextInt();


                listaE[contadorEs] = gestionEstudiantes.nuevoEstudiante(codigo, nombreC, carnet);
                System.out.println("Estudiante Creado con éxito");

                contadorEs++;
            }
        }

        if(opcion.equals("2")){
            System.out.println("\n-- Lista de estudiantes --");
            System.out.println("Codigo\tCarnet\tNombre Completo");
            for (int i = 0; i < contadorEs; i++) {
                System.out.println(listaE[i].getCodigo()+
                        "\t"+listaE[i].getCarnet()+
                        "\t"+listaE[i].nombreCompleto);
            }
        }

        if(opcion.equals("3")){
            System.out.println("\n-- Buscar estudiante --");
            System.out.println("Digite Código");
            codigoBuscar = scn.nextInt();
            posicion = gestionEstudiantes.buscarEstudiante(codigoBuscar,listaE,contadorEs);

            if(posicion==99){
                System.out.println("Estudiante NO encontrado");
            }else{
                System.out.println("Estudiante encontrado");
                System.out.println(listaE[posicion].getCodigo()+
                        "\t"+listaE[posicion].getCarnet()+
                        "\t"+listaE[posicion].nombreCompleto);
            }

        }
        //////////////////editar///////////////
        if(opcion.equals("4")){
            System.out.println("\n-- Editar nombre estudiante --");
            System.out.println("Digite Código");
            codigoBuscar = scn.nextInt();
            System.out.println("Digite Nuevo nombre");
            nuevoNombre = scn.next();

       if(gestionEstudiantes.editarNombreEstudiante(codigoBuscar,nuevoNombre,listaE,contadorEs)){
           
           System.out.println("Estudiante Editado");
       }else{
           System.out.println("Estudiante no existe");
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
                "\n3. Buscar Estudiante por código" +
                "\n4. Editar Nombre Estudiante" +
                "\n--------------------------" +
                "\n3. Registrar Docentes" +
                "\n4. Listar Docentes" +
                "\n--------------------------" +
               "\n9. Salir "+
                "\nDigite Opción -> ";
    }


}
