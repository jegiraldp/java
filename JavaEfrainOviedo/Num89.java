/**
* EJERCICIO RESUELTO No. 89
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
* Este ejercicio utiliza el archivo de texto A3.txt 
*/
import java.io.*;
import java.util.*;

public class Num89 {

	
	private Num89_Empleado[] insertar() 
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
      
    
}
