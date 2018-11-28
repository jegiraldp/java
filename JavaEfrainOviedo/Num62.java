/**
* EJERCICIO RESUELTO No. 62
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
*/
  
import java.io.*;//LIBRERIA NECESARIA PARA EL BUFFERED READER

public class Num62
{
	static int busquedasec(int n, double vec[], int valorb)
   {
     int i=0;
     while((i<n) && (valorb !=vec[i]))
       i++;
     if(i < n)
       return i;
      else
       return 0;
   }
  
	
	
	public static void main(String ar[]) 
			throws IOException//MANEJA LAS EXEPCIONES DEL READLINE
	//FUNCION PRINCIPAL DEL PROGRAMA
    {
	
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		String temporal;
		

		Num62 objeto=new Num62();
		int n, posicion;  
		double vec[]=new double[100];
		int valorb, valor;
	    System.out.print("ENTRE LA CANTIDAD DE ELEMENTOS DEL VECTOR:     ");
	    temporal = lector.readLine();
	    n=Integer.parseInt(temporal);
	    System.out.println(""); 
		
		for (int i=0; i<n; i++){
			System.out.print("INGRESE EL ELEMENTO DE LA POSICION "+(i+1)+" :");
			temporal = lector.readLine();
			valor=Integer.parseInt(temporal);
			vec[i]=valor;
			System.out.println("");	
		}
	    System.out.print("ENTRE EL VALOR A BUSCAR:         ");
	    temporal = lector.readLine();
	    valorb=Integer.parseInt(temporal);
	    System.out.println("");
	    posicion=objeto.busquedasec(n,vec,valorb);
	
	    if(posicion !=-1)
	    {
	      System.out.println("EL VALOR: "+ valorb+" ESTA EN LA POSICION "+(posicion+1));
	    }
	    else
	    {
	      System.out.println("EL VALOR: "+  valorb + " NO ESTA EN EL VECTOR");
	      
	    }
	  
	    System.out.println("PRESIONE TECLA PARA TERMINAR");
	   
	}
}

   