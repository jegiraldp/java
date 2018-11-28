/**
* EJERCICIO RESUELTO No. 50
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
*/
 

import java.io.*;//LIBRERIA NECESARIA PARA EL BUFFERED READER

public class Num50
{
	
	 static long fac(int n)
    {
      long facto=1; int i;
      for(i=1; i<=n; i=i+1)
	facto*=i;
      return facto;
    }
	
	public static void main(String ar[]) 
			throws IOException//MANEJA LAS EXEPCIONES DEL READLINE
	{
	
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		String temporal;
		
	Num50 objeto=new Num50();
     int n,i;
     System.out.println("ENTRE CANTIDAD DE NUMEROS:    ");
     temporal = lector.readLine();
	 n=Integer.parseInt(temporal);
 
     for(i=1; i<=n; i++)
      {
		 long facto;
		 facto=objeto.fac(i);
		 System.out.println("EL FACTORIAL DE: "+i+" ES: "+facto);
      }
    
	}
}
