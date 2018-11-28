/**
* EJERCICIO RESUELTO No. 23
* @autor	Efrain Oviedo
* @libro	Logica de Programación
* 
*/
		     

import java.io.*;//LIBRERIA NECESARIA PARA EL BUFFERED READER

public class Num23
{
	public static void main(String ar[]) 
			throws IOException//MANEJA LAS EXEPCIONES DEL READLINE
	{
	
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		String temporal;
		int nn,conta=1,encontrado=0,num;
	    System.out.println("ENTRE LA CANTIDAD DE NUMEROS:       ");
	    temporal = lector.readLine();
		nn=Integer.parseInt(temporal);
	    while((conta<=nn) && (encontrado==0))
	    {
			System.out.println("ENTRE UN NUMERO ENTERO:     ");
			temporal = lector.readLine();
			num=Integer.parseInt(temporal);
	  		if(num==0)
			  encontrado=1;
			 else
			  conta++;
        }
	    if(encontrado==1)
		System.out.println("SI HAY UN CERO ENTRE LOS NUMEROS");
	    else
		System.out.println("NO HAY UN CERO ENTRE LOS NUMEROS");
	    System.out.println("PRESIONE TECLA PARA TERMINAR");
	    
	}
}

