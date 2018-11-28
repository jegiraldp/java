/**
* CLASE MANEJADORA DE VECTORES
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
* Esta clase contienen los métodos utilizados en operaciones de vectores
*/

import java.io.*;

public class ManejadorVectores{

/*
 * PROCEDIMIENTO QUE LEE EL VECTOR
 */	
	public void leer_vec(int n, double vec[]) 
			throws NumberFormatException, IOException
	  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int h; 
		for(h=0; h<n;h++)
	  	{
	  		System.out.print("\nInserte el elemento "+(h+1)+" : ");
			vec[h]= Integer.parseInt(in.readLine());
	  		
	  	}
		
	 }  


/*
 * 	SUBPROGRAMA QUE IMPRIME EL VECTOR
 */

	public void imprimir_vec(int n, double vec[])
	{
		int h;
		System.out.println("CONTENIDO DEL VECTOR");
		for(h=0; h<n; h++)
	  	{
			System.out.print(vec[h]+"    ");
	  	}
	 }
	 

/*
 * 	FUNCION QUE BUSCA UN VALOR EN UN VECTOR, USANDO EL METODO DE
 *	BUSUEDA BINARIA, RETORNA LA POSICION DONDE ESTA EL VALOR BUSCADO
 *	O -1 SI NO LO ENCUENTRA.
 */

   public int busquedabin(int n, double a[], double valorbuscado)
	 {
	   int p=0, u=n-1, sw=0, mitad=0;
	   while((p <= u) && (sw==0))
		 {
			mitad=(p + u)/2;
			if(a[mitad] == valorbuscado)
			   sw=1;
			 else
			   if(valorbuscado < a[mitad])
				  u=mitad-1;
				else
				  p=mitad+1;
		 }
	   if(valorbuscado==a[mitad])
		  return mitad+1;
		else
		  return -1;
	 }
	 
	 
	/*
	 * PROCEDIMIENTO QUE ORDENA UN VECTOR POR EL METODO DE BURBUJA
	 * 
	 */
	 public void ordenburbuja(int n, double a[])
	  {
		int i, j; double aux;
		for(i=0; i< (n-1); i++)
		  for(j=0; j < (n-(i+1)); j++)
			if(a[j] > a[j+1])
			  {
				 aux=a[j];
				 a[j]=a[j+1];
				 a[j+1]=aux;
			  }
	  }


/*
 * PROCEDIMIENTO QUE ORDENA UN VECTOR POR EL METODO DE BURBUJA-
 * MEJORADO 
 */

 public void ordenburbuja_mejorado(int n, double a[])
  {
	int i=0, ban, j; double aux;
	do
	  {
		 ban=1;
		 for(j=0; j< n-(i+1); j++)
		  {
			if(a[j] > a[j+1])
			  {
				aux=a[j];
				a[j]=a[j+1];
				a[j+1]=aux;
				ban=0;
			  }
		  }
		 i++;
	  }while(ban !=1);
  }

/*
 * PROCEDIMIENTO QUE ORDENA UN VECTOR POR EL METODO DE SELECCION
 * 
 */

 public void ordenseleccion(int n, double a[])
  {
	 int i, k, pos; double aux,menor;
	 for(i=0; i< n-1; i++)
	  {
		 menor=a[i];
		 pos=i;
		 for(k=i+1; k<n; k++)
		  if(menor > a[k])
			{
			   menor=a[k];
			   pos=k;
			}
		 aux=a[i];
		 a[i]=menor;
		 a[pos]=aux;
	  }
  }


	/*
	 * PROCEDIMIENTO QUE ORDENA UN VECTOR POR EL MÈTODO DE LA BARAJA
	 */
	public void ordenbaraja(int tv, double a[])
	 {
	   int k,i,ban;  double aux;
	   for(k=1; k<tv; k++)
		{
		 i=k; aux=a[k]; ban=0;
		 while((i > 0) && (ban==0))
		  {
			if(a[i-1] > aux)
			  {
			   a[i]=a[i-1];
			   i--;
			  }
			else
			  ban=1;
		  }
		 a[i]=aux;
		}
	 }	 
	 
	/*
	 * PROCEDIMIENTO QUE INSERTA UN VALOR EN UN VECTOR DESORDENADO
	 */
	
	public int insertar_desordenado(int tv, double a[], double vin)
	 {
	   if(tv<100)
		{
		  tv++;
		  a[tv-1]=vin;
		}
	   else
		{
		  System.out.println("EL VECTROR ESTA LLENO");
		
			  System.out.println("PRTESIONE TECLA PARA TERMINAAR");
		
		}
		return tv;
	 }


	/*
	 * PROCEDIMIENTO QUE INSERTA UN VALOR EN UN VECTOR ORDENADO
	 * SIN DAÑAR EL ORDENAMIENTO
	 */
	 public int insertar_ordenado(int tv, double a[], double valin)
	  {
		int i=0, k;
		if(tv<100)
		 {
		   while((i< tv) && (valin > a[i]))
			 i++;
		   tv++;
		   for(k=(tv-1); k > i; k--)
			 a[k]=a[k-1];
		   a[i]=valin;
		 }
		else
		 {
		
		   System.out.println("EL VECTOR ESTA LLENO");
		   System.out.println("PRESIONE TECLA PARA TERMINAR");
		
		 }
		 return tv;
	  }
	 
	/*
	 * PROCEDIMIENTO QUE BORRA UN VALOR EN UN VECTOR
	 */
	
	 public int borrar_elemento(int tv, double a[], double valorb)
	  {
		int i=0, k;
		if(tv > 0)
		  {
			while((i < tv) && (valorb != a[i]))
			  i++;
			if(i < tv)
			 {
			   for(k=i; k < (tv-1); k++)
				 a[k]=a[k+1];
			   tv--;
			 }
			else
			 {
		
				   System.out.println(valorb);
				   System.out.println(" NO ESTA EN EL ARREGLO");
		
			 }
		  }
		  else
		   {
		
				   System.out.println(" EL VECTOR ESTA VACIO");
		   }
		
		   System.out.println("PRESIONE TECLA ");
		return tv;
		
	  }
	 
	  
}	  
	 