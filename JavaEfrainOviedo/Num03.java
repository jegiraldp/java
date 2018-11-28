
/**
* EJERCICIO RESUELTO No. 3
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*/


import java.io.*;//LIBRERIA NECESARIA PARA EL BUFFERED READER

public class Num03
{
	public static void main(String ar[]) 
			throws IOException//MANEJA LAS EXEPCIONES DEL READLINE
	{
	
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		String temporal;
		int l1,l2,p,area;
	    System.out.println("ENTRE EL LADO 1:       ");
	  	temporal = lector.readLine();
		l1=Integer.parseInt(temporal);
	    System.out.println("ENTRE EL LADO 2:       ");
	    temporal = lector.readLine();
		l2=Integer.parseInt(temporal);
	    p=(2*l1)+(2*l2);
	    area=l1*l2;
	    System.out.println("EL PERIMETO ES:   "+p);
	    System.out.println("EL AREA ES: "+area);
	    System.out.println("PRESIONE TECLA PARA TERMINAR ");
	}
}
