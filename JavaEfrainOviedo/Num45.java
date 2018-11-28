/**
* EJERCICIO RESUELTO No. 45
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
*/

import java.io.*;//LIBRERIA NECESARIA PARA EL BUFFERED READER


public class Num45
{

 static BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
 static String temporal;
 static float prom, sum;
 	
  public static void sprom() throws IOException
   {
     int n=0;
     float num; 
     String sw="S";
     sum=0;
     while(sw.toUpperCase().equals("S"))
      {
      	 n++;
		 System.out.println("ENTRE EL NUMERO "+n+":");
		 temporal = lector.readLine();
		 num=Float.parseFloat(temporal);
		 sum+=num;
		 System.out.println("HAY MAS NUMEROS S/N   ");
		 sw = lector.readLine();
       }
     prom= (float) sum/n;
   }



	public static void main(String ar[]) 
			throws IOException//MANEJA LAS EXEPCIONES DEL READLINE
	{
     sprom();
     System.out.println("SUMA DEL CONJUNTO DE NUMEROS:"+sum);
     System.out.println("EL PROMEDIO ES: "+prom);
     System.out.println("PRESIOINE TECLA");
     

	}
}

