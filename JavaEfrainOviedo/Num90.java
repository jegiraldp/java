/**
* EJERCICIO RESUELTO No. 90
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
* Este ejercicio utiliza los archivos de texto A3.txt y A4.txt
* También se utiliza la estructura de la clase Num89_Empleado
*/

import java.io.*;
import java.util.*;

public class Num90 {

    private boolean salir = false;
    
    public Num90() throws IOException {
        
        System.out.println("Creando A3\n");
        File f = new File("A3.txt");
        f.createNewFile();
        Num89_Empleado empleados[]= new Num89_Empleado[10];
        
        
		empleados[0] = new Num89_Empleado("15","Pedro",150,1);
		empleados[1] = new Num89_Empleado("10","Jose",220,1);
		empleados[2] = new Num89_Empleado("8","Martin",230,1);
		empleados[3] = new Num89_Empleado("5","Elias",120,1);
		empleados[4] = new Num89_Empleado("3","Ruben",100,1);
		empleados[5] = new Num89_Empleado("1","Maria",85,0);
		empleados[6] = new Num89_Empleado("20","Juliana",420,1);
		empleados[7] = new Num89_Empleado("9","Amparo",80,1);
		empleados[8] = new Num89_Empleado("17","Marcos",100,1);
		empleados[9] = new Num89_Empleado("22","Julia",160,1);
        
        guardarEmpleados(empleados, "A3.txt");
        
        mostrarEmpleados("A3.txt");
        
        System.out.println("\n\nGenerando A4 ordenado por nombre.");
        //ordenar el arreglo por el campo nombre.
        String menor = "";
        for (int i = 0; i < empleados.length - 1; i++) {
            for (int j = i; j < empleados.length; j++) {
                if (empleados[i].getNombre().compareTo(empleados[j].getNombre()) > 0) {
                    Num89_Empleado aux = empleados[i];
					empleados[i] = empleados[j];
					empleados[j] = aux;
                }
            }
        }
        guardarEmpleados(empleados, "A4.txt");
        System.out.println("Archivo Generado\n");
        mostrarEmpleados("A4.txt");
    }
    
    private Num89_Empleado[] leer() 
    		throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("A3.txt")));
        int cant = 0;
        while (reader.readLine() != null) {
            cant = cant + 1;
        }
        
        reader.close();
        reader = new BufferedReader(new InputStreamReader(new FileInputStream("A3.txt")));
        Num89_Empleado empleados[] = new Num89_Empleado[cant];
        String linea;
        int i = 0;
        while ((linea = reader.readLine()) != null) {
            StringTokenizer tokens = new StringTokenizer(linea, ",");
            String codigo = tokens.nextToken();
            String nombre = tokens.nextToken();
            long pago = Long.parseLong(tokens.nextToken());
            int estado = Integer.parseInt(tokens.nextToken());
            Num89_Empleado emp = new Num89_Empleado(codigo, nombre, pago, estado);
            empleados[i] = emp;
            i = i + 1;
        }
        reader.close();
        return empleados;
    }
    
    private void guardarEmpleados(Num89_Empleado[] arreglo, String nombreArchivo)
		throws IOException {
        PrintWriter out = new PrintWriter(new FileOutputStream(nombreArchivo));
        for (int i = 0; i < arreglo.length; i++) {
            Num89_Empleado emp = arreglo[i];
            out.println(emp.getCodigo() + "," + emp.getNombre() + "," + emp.getPago() + "," + emp.getEstado());            
        }
        out.flush();
        out.close();
    }
    
    private void mostrarEmpleados(String nombreArchivo) 
    		throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(nombreArchivo)));
        String linea;
        while ((linea = reader.readLine()) != null) {
			StringTokenizer tokens = new StringTokenizer(linea, ",");
			String codigo = tokens.nextToken();
			String nombre = tokens.nextToken();
			String pago = tokens.nextToken();
			String estado = tokens.nextToken();
			if(estado.equals("1"))
				 System.out.println(linea);
            
        }
        reader.close();
    }
    
    
    public static void main(String[] args) throws IOException {
        new Num90();
    }
    
    
    
}
