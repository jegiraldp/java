/**
* EJERCICIO RESUELTO No. 7
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*/

import java.io.*;//LIBRERIA NECESARIA PARA EL BUFFERED READER

public class Num07
{
	public static void main(String ar[]) 
			throws IOException//MANEJA LAS EXEPCIONES DEL READLINE
	{
	  float a,b;
	  BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
	  String temporal;
	  System.out.println("ENTRE EL VALOR DE A:     ");
      temporal = lector.readLine();
	  a=Integer.parseInt(temporal);
      System.out.println("\n\nENTRE EL VALOR DE B:    ");
      temporal = lector.readLine();
	  b=Integer.parseInt(temporal);
      if(a>b){
         	System.out.println("A ES MAYOR QUE B ");
      }
      else
      {
	  	if(a==b)
	  	  	System.out.println("A ES IGUAL A B ");
	   	else
	    	System.out.println("A ES MENOR QUE B ");
	      
      }
	
	}
}





