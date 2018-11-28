/**
 * EJERCICIO RESUELTO No. 2 GENERALIZADO
 * @autor	Efrain Oviedo
 * @libro	Logica de Programación
 */

import java.io.*;	//LIBRERIA NECESARIA PARA EL BUFFERED READER

public class Num02g
{
	public static void main(String ar[]) 
			throws IOException   //MANEJA LAS EXEPCIONES DEL READLINE
	{

		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		String temporal;
		int AINICIO,AFINAL,NATRAN,NMESES;
	    System.out.println("ENTRE EL AÑO INICIAL ");
		temporal = lector.readLine();
		AINICIO=Integer.parseInt(temporal);
	    System.out.println("ENTRE EL AÑO FINAL ");
		temporal = lector.readLine();
		AFINAL=Integer.parseInt(temporal);
		NATRAN = AFINAL - AINICIO;
	    NMESES=NATRAN*12;
	    
		System.out.println("LOS MESES TRANSCURRIDOS ENTRE "+AINICIO+" Y "+AFINAL +" SON "+NMESES);
		
	}
}



	

	
	