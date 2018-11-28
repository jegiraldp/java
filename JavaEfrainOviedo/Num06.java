/**
* EJERCICIO RESUELTO No. 6
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*/

import java.io.*;//LIBRERIA NECESARIA PARA EL BUFFERED READER

public class Num06
{
	public static void main(String ar[]) 
			throws IOException//MANEJA LAS EXEPCIONES DEL READLINE
	{
	
	  int X,Y,Z;
      BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
	  String temporal;
  	  System.out.println("ENTRE EL VALOR DE Y:     ");
      temporal = lector.readLine();
	  Y=Integer.parseInt(temporal);
      System.out.println("ENTRE EL VALOR DE Z:     ");
      temporal = lector.readLine();
	  Z=Integer.parseInt(temporal);
      if(Y > Z)
		X=1;
      else
		X=2;
      
      System.out.println("EL VALOR DE X ES:  ");
      System.out.println(X+"\n");
      System.out.println("PRESIONE TECLA PARA TERMINAR ");
      
	}
}
