/**
* EJERCICIO RESUELTO No. 5
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*/

import java.io.*;//LIBRERIA NECESARIA PARA EL BUFFERED READER
import java.lang.Math; //LIBRERIA NECESARIA PARA FUNCIONES MATEMATICAS
public class Num05
{
	public static void main(String ar[]) 
			throws IOException//MANEJA LAS EXEPCIONES DEL READLINE
	{
	 double suma=0,x=20,y=40;
      suma=suma+x;
      x=Math.pow(y,2)+x;
      suma=suma+(double)x/y;
      System.out.println("EL VALOR DE LA SUMA ES");             
      System.out.println(suma);
     }
}  
 