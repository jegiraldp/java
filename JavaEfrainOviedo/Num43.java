/**
* EJERCICIO RESUELTO No. 43
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
*/

import java.io.*;//LIBRERIA NECESARIA PARA EL BUFFERED READER

public class Num43
{

   //CODIFICACION DE LA FUNCION
   static double mayor(float N1,float N2, double N3)
     {
       double VALMAY;
       if((N1>N2) && (N1>N3))
	  VALMAY=N1;
	 else
	  if(N2>N3)
	     VALMAY=N2;
	   else
	     VALMAY=N3;
       return VALMAY;
     }


	public static void main(String ar[]) 
			throws IOException//MANEJA LAS EXEPCIONES DEL READLINE
	{
	
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		String temporal;
		Number f;
		Num43 objeto=new Num43();
	    float NUM1,NUM2;
	    double NUM90=90.5;
		System.out.println("ENTRE EL PRIMER VALOR :");
		temporal=lector.readLine();f=Float.valueOf(temporal);NUM1=f.floatValue();
	    System.out.println("ENTRE EL SEGUNDO VALOR:");
	    temporal=lector.readLine();f=Float.valueOf(temporal);NUM2=f.floatValue();
	    double resultado=objeto.mayor(NUM1,NUM2,NUM90);
	    System.out.println("EL VALOR MAYOR ENTRE: "+NUM1+" , "+NUM2+" Y 90.5 ES: "+resultado); 
	    System.out.println("PRESIONE TECLA PARA TERMINAR");
	    
	}
}



