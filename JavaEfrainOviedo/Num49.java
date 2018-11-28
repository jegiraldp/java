/**
* EJERCICIO RESUELTO No. 49
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
*/


import java.io.*;//LIBRERIA NECESARIA PARA EL BUFFERED READER

public class Num49
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
		
	  Num49 objeto= new Num49();
	  int num; long factor;
      System.out.println("ENTRE EL NUMERO:     ");
 	  temporal = lector.readLine();
	  num=Integer.parseInt(temporal);
	  factor=objeto.fac(num);
      System.out.println("EL FACTORIAL DE: "+num+" ES: "+factor);
      System.out.println("PRESIONE TECLA PARA TERMINAR");
      
	}
}



