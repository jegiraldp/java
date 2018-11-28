/**
* EJERCICIO RESUELTO No. 86
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
* Este ejercicio utiliza la clase Num86_Est
*/

import java.io.*;


public class Num86 {

    
    //Programa principal
    public static void main(String[] args) 
    	throws IOException {
		//Se ingresan los datos
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Entre la cedula:");
        long cedula = Long.parseLong(in.readLine());
        System.out.print("\nEntre el nombre:");
        String nombre = in.readLine();
        System.out.print("\nEntre el pago:");
        long pago = Long.parseLong(in.readLine());
        
        //Se crea el primer registro
		Num86_Est est1 = new Num86_Est(cedula, nombre, pago);
		
		// Se crea el segundo registro y se copia la informacion
		Num86_Est est2 = new Num86_Est();
		est2= est1;
		
		//Se muestra el contenido del segundo registro
		System.out.println("\nSEGUNDO REGISTRO");
		System.out.print("\nCedula: "+est2.getCedula());
		System.out.print("\nNombre: "+est2.getNombre());
		System.out.print("\nPago: "+est2.getPago());
       
       
    }
}
