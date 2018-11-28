/**
* EJERCICIO RESUELTO No. 11
* @autor	Efrain Oviedo
* @libro	Logica de Programación
* 
*/


import java.io.*;//LIBRERIA NECESARIA PARA EL BUFFERED READER

public class Num21
{
	public static void main(String ar[]) 
			throws IOException//MANEJA LAS EXEPCIONES DEL READLINE
	{
	
		 BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		 String temporal;
		 int nt, ter=17, cont=1, ban=1;
	     System.out.println("ENTRE LA CANTIDAD DE TERMINOS:    ");
	     temporal = lector.readLine();
	     nt=Integer.parseInt(temporal);
	     while(cont<=nt)
	     {
			System.out.println(ter+"   ");
			if(ban==1)
		 	{
			   ter-=2;
			   ban=2;
			}
		 	else
		  	{
			   ter+=3;
			   ban=1;
			}
			cont++;
	     }
	 		
	}
}

 
 
