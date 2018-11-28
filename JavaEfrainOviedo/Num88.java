/**
* EJERCICIO RESUELTO No. 88
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
* Este ejercicio utiliza el archivo de texto num88.txt 
*/
import java.io.*;
import java.util.*;

public class Num88 {

    private boolean salir = false;
    BufferedReader in;
    
    public Num88() throws IOException {
    	//verifico que el archivo exista
        File f = new File("num88.txt");
        if (f.exists() == false) {
            f.createNewFile();
        }
        
        in = new BufferedReader(new InputStreamReader(System.in));
        
        while (salir == false) {
            System.out.println(" * * * * * * * * * * * * * * * * *");
            System.out.println("Por favor seleccione una opcion:");
            System.out.println("\t1. Adicionar un estudiante");
            System.out.println("\t2. Modificar un estudiante");
            System.out.println("\t3. Eliminar un estudiante");
            System.out.println("\t4. Mostrar estudiantes");
            System.out.println("\t5. Salir");
            System.out.println("");
            System.out.print("\tPor favor seleccion una opcion: ");
            String entra = in.readLine();
            if (entra.equals("1")) {
                adicionarEstudiante();
            } else if (entra.equals("2")) {
                modificarEstudiante();
            } else if (entra.equals("3")) {
                eliminarEstudiante();
            } else if (entra.equals("4")) {
              mostrarEstudiantes();  
            } else if (entra.equals("5")) {
                salir = true;
            }
        }
    }
    
    private Num88_Estudiante[] leerEstudiantes() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("num88.txt")));
        int cantEstudiantes = 0;
        while (reader.readLine() != null) {
            cantEstudiantes = cantEstudiantes + 1;
        }
        
        reader.close();
        reader = new BufferedReader(new InputStreamReader(new FileInputStream("num88.txt")));
		Num88_Estudiante estudiantes[] = new Num88_Estudiante[cantEstudiantes];
        String linea;
        int i = 0;
        while ((linea = reader.readLine()) != null) {
            StringTokenizer tokens = new StringTokenizer(linea, ",");
            String codigo = tokens.nextToken();
            String nombre = tokens.nextToken();
            String direccion = tokens.nextToken();
            int estado = Integer.parseInt(tokens.nextToken());
			Num88_Estudiante est = new Num88_Estudiante(codigo, nombre, direccion, estado);
            estudiantes[i] = est;
            i = i + 1;
        }
        reader.close();
        return estudiantes;
    }
    
    private void guardarEsudiantes(Num88_Estudiante[] arreglo) throws IOException {
        PrintWriter out = new PrintWriter(new FileOutputStream("num88.txt"));
        for (int i = 0; i < arreglo.length; i++) {
			Num88_Estudiante est = arreglo[i];
            out.println(est.getCodigo() + "," + est.getNombre() + "," + est.getDireccion() + "," + est.getEstado());            
        }
        out.flush();
        out.close();
    }
    
    private void adicionarEstudiante() throws IOException {
        System.out.print("Entre el codigo: ");
        String codigo = in.readLine();
        boolean existe = false;
		Num88_Estudiante estudiantes[] = leerEstudiantes();
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getCodigo().equals(codigo) && estudiantes[i].getEstado() == 1) {
                existe = true;
                break;
            }
        }
        
        if (existe) {
            System.out.println("El estudiante ya existe!");
        } else { 
	        System.out.print("Entre el nombre: ");
	        String nombre = in.readLine();
	        System.out.print("Entre la direccion: ");
	        String direccion = in.readLine();
			Num88_Estudiante estudiante = new Num88_Estudiante(codigo, nombre, direccion, 1);
	        PrintWriter out = new PrintWriter(new FileOutputStream("num88.txt", true));
	        out.println(estudiante.getCodigo() + "," + estudiante.getNombre() + "," + estudiante.getDireccion() + "," + estudiante.getEstado());
	        out.flush();
	        out.close();
        }
    }
    
    private void modificarEstudiante() throws IOException {
        System.out.print("Entre el codigo: ");
        String codigo = in.readLine();
		Num88_Estudiante[] estudiantes = leerEstudiantes();
        int posModificar = -1;
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getCodigo().equals(codigo) && estudiantes[i].getEstado() == 1) {
                posModificar = i;
            }
        }
        if (posModificar == -1) {
            System.out.println("Codigo no encontrado!");
        } else {
            System.out.println("Entre el nombre:");
            String nombre = in.readLine();
            System.out.println("Entre la direccion:");
            String direccion = in.readLine();
            estudiantes[posModificar].setNombre(nombre);
            estudiantes[posModificar].setDireccion(direccion);
            guardarEsudiantes(estudiantes);
        }
    }
    
    private void eliminarEstudiante() throws IOException {
        System.out.print("Entre el codigo: ");
        String codigo = in.readLine();
		Num88_Estudiante[] estudiantes = leerEstudiantes();
        int posModificar = -1;
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getCodigo().equals(codigo) && estudiantes[i].getEstado() == 1) {
                posModificar = i;
            }
        }
        if (posModificar == -1) {
            System.out.println("Codigo no encontrado!");
        } else {
            estudiantes[posModificar].setEstado(0);
            guardarEsudiantes(estudiantes);
            System.out.println("Estudiante Eliminado!");
        }
    }
    
    private void mostrarEstudiantes() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("num88.txt")));
        String linea;
        
        while ((linea = reader.readLine()) != null) {
			StringTokenizer tokens = new StringTokenizer(linea, ",");
			String codigo = tokens.nextToken();
			String nombre = tokens.nextToken();
			String direccion = tokens.nextToken();
			String estado = tokens.nextToken();
			if(estado.equals("1"))
				 System.out.println(linea);
        }
        reader.close();
    }
    
    
    public static void main(String[] args) throws IOException {
        new Num88();
    }
    
  
    
}
