/**
* EJERCICIO RESUELTO No. 4
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*/

import java.io.*;//LIBRERIA NECESARIA PARA EL BUFFERED READER

public class Num04
{
	public static void main(String ar[]) 
			throws IOException//MANEJA LAS EXEPCIONES DEL READLINE
	{
	
	  BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
	  String temporal;
	  int edjuan,edalber,edana,edmama;
 	  System.out.println("ENTRE LA EDAD DE JUAN ");
 	  temporal = lector.readLine();
	  edjuan=Integer.parseInt(temporal);
 	  
      edalber=(2*edjuan)/3; 
      edana=4*edjuan/3;
      edmama=edjuan+edalber+edana;
      System.out.println("LAS EDADES SON:\n\n");
      System.out.println("ALBERTO "+edalber);  
      System.out.println("JUAN    "+edjuan);
      System.out.println("\nANA    "+edana+"\nMAMA   "+edmama);
      System.out.println("PRESIONE TECLA PARA TERMINAR ");
      
	}
}



