/**
* EJERCICIO RESUELTO No. 27
* @autor	Efrain Oviedo
* @libro	Logica de Programación
* 
*/

import java.io.*;//LIBRERIA NECESARIA PARA EL BUFFERED READER

public class Num27 extends Num24
{
	public static void main(String ar[]) 
			throws IOException//MANEJA LAS EXEPCIONES DEL READLINE
	{
	
	BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
	String temporal;
	Num27 objeto=new Num27();
	int n,con=1; String nc;
     	boolean sw=false;     
     	long fac=1;
     	do
      	{
		System.out.println("ENTRE EL NUMERO:       ");
		nc = lector.readLine();
		sw=objeto.valint(nc);
		if(sw==false)
	 	{
			System.out.println("            "); 
		}
     	 }while((sw==false) || (Integer.parseInt(nc) > 16));
     	n=Integer.parseInt(nc);
     	while(con <= n)
  	
		fac*=con++;
     	System.out.println("EL FACTORIAL DE "+n);
     	System.out.println(" ES: "+fac);
     	System.out.println("PRESIONE TECLA PARA TERMINAR");
	}
}

