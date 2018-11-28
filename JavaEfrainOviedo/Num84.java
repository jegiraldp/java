/**
* EJERCICIO RESUELTO No. 84
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
*/

import java.io.*;//LIBRERIA NECESARIA PARA EL BUFFERED READER

public class Num84
{
	public static void main(String ar[]) 
	throws IOException//MANEJA LAS EXEPCIONES DEL READLINE
	{
		int np,nf,nc,f,c,p,fm,cm,pm;
		double mayor;
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		String temporal;
	 	System.out.print("Ingrese el numero de planos: ");
	    temporal = lector.readLine();
		np=Integer.parseInt(temporal);
		System.out.print("\nIngrese el numero de filas: ");
		temporal = lector.readLine();
		nf=Integer.parseInt(temporal);
		System.out.print("\nIngrese el numero de columnas: ");
		temporal = lector.readLine();
		nc=Integer.parseInt(temporal);	
	  	double artd[][][] = new double[np][nf][nc];
	  	

		//Se llena el arreglo tridimensional
		for(p=0; p<np; p++)
		{
			for(f=0; f< nf; f++)
		 	{
		   		for(c=0; c< nc; c++)
				{
			  	  System.out.print("\nDigite el elemento del plano "+(p+1)+", fila "+(f+1)+" y columna "+(c+1)+" : ");
				  temporal = lector.readLine();
				  artd[p][f][c] = Double.parseDouble(temporal);
				}
		 	}
		}
		
		//Se busca el elemento mayor
		mayor=artd[0][0][0]; 
		fm=0; cm=0; pm=0;
		for(p=0; p<np; p++)
		   for(f=0; f<nf; f++)
		 		for(c=0; c< nc; c++)
			   		if(mayor<artd[p][f][c])
					{ 
				  		mayor=artd[p][f][c]; fm=f; cm=c; pm=p;
					}
			 
		 // Se muestran los resultados
		System.out.println("RESULTADOS");
		System.out.println("El valor mayor del arreglo es: "+mayor+" y esta ubicado");
		System.out.println("en el plano: "+(pm+1)+" fila: "+(fm+1)+" columna: "+(cm+1));
	}
}

 
 
   
