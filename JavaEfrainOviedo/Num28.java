/**
* EJERCICIO RESUELTO No. 28
* @autor	Efrain Oviedo
* @libro	Logica de Programación
* 
*/

import java.io.*;//LIBRERIA NECESARIA PARA EL BUFFERED READER

public class Num28
{
	public static void main(String ar[]) 
			throws IOException//MANEJA LAS EXEPCIONES DEL READLINE
	{
	
	BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
	String temporal;
	float x,ter=1; 
	int i=0    ; 
	long fac=1; 
	double FX=0;
        System.out.println("ENTRE EL VALOR DE X ");
		temporal=lector.readLine();
		x=Integer.parseInt(temporal);	
  	while(Math.abs(ter) >= Math.pow(10,-3))
      	{
	 	FX+=ter;
	 	i=i+1;
	 	fac =fac*i;
	 	ter=(float) (Math.pow(x,i)/fac*Math.pow(-1,i));
      	}
     	System.out.println("EL VALOR DE F(X) ES: "+FX);
     	System.out.println("PRESIONE TECLA PARA TERMINAR");
     	
	}
}


