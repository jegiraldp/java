/**
* EJERCICIO RESUELTO No. 42
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
*/

import java.io.*;//LIBRERIA NECESARIA PARA EL BUFFERED READER

public class Num42
{
	
  //PROTOTIPO DE LA FUNCION 
   //CODIFICACION DE LA FUNCION

    static float mayor(float N1,float N2, float N3)
     {
       float VALMAY;
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
		Num42 objeto=new Num42();
	    Number f;
		float NUM1,NUM2,NUM3,NUM_MAYOR;
	    
	    System.out.println("ENTRE EL PRIMER VALOR :"); 
	    temporal=lector.readLine();f =  Float.valueOf(temporal); NUM1= f.floatValue();
	    System.out.println("ENTRE EL SEGUNDO VALOR:"); 
	    temporal=lector.readLine();f =  Float.valueOf(temporal); NUM2= f.floatValue();
	    System.out.println("ENTRE EL TERCER VALOR :"); 
	    temporal=lector.readLine();f =  Float.valueOf(temporal); NUM3= f.floatValue();
	    NUM_MAYOR=objeto.mayor(NUM1,NUM2,NUM3);
	    System.out.println("EL VALOR MAYOR ENTRE: "+NUM1+" , "+NUM2+" Y "+NUM3+" ES: "+NUM_MAYOR);
	    System.out.println("PRESIONE TECLA PARA TERMINAR");
	       
	}
}


