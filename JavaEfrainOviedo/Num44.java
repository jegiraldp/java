/**
* EJERCICIO RESUELTO No. 44
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
*/

import java.io.*;    //LIBRERIA NECESARIA PARA EL BUFFERED READER


public class Num44
{
    static BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
	static String temporal;
	static float sum,promedio;
	
    public  static void sumprom(int n)	throws IOException
     {
       Number f;
       float num; 
       sum=0;  
       int i;
       for(i=1;i<=n;i=i+1)
	   {
	   System.out.println("ENTRE EL NUMERO "+i +":" );
	   temporal=lector.readLine();
	   num= Float.parseFloat(temporal);
	   sum+=num;
	   }
       promedio=sum/n;
     }

	public static void main(String ar[]) 
			throws IOException//MANEJA LAS EXEPCIONES DEL READLINE
    {
      int cn;  
    
      System.out.println("CUANTOS NUMEROS ?      ");
      temporal=lector.readLine();
      cn=Integer.parseInt(temporal);
      sumprom(cn);
      System.out.println("LA SUMA DE LOS "+cn+" NUMEROS ES:"+sum);
      System.out.println("EL PROMEDIO ES: "+promedio);
      System.out.println("PRESIOINE TECLA");
     }
}
