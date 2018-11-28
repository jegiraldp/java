/**
* CLASE MANEJADORA DE MATRICES
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
* Esta clase contienen los métodos utilizados en operaciones de matrices
*/


import java.io.*;//LIBRERIA NECESARIA PARA EL BUFFERED READER


public class ManejadorMatrices {

 
 //PROCEDIMIENTO QUE CALCULA PROMEDIO DE COLUMNAS Y FORMA VECTOR
 public void promc(int a[][],int n,int m, float vpc[])
  {
	int i,k;
	float suma;
	for(i=0; i< m; i++)
	 {
		   suma=0;
		   for(k=0; k<n; k++){
			suma=suma+a[k][i];
		   }
		   vpc[i]=suma/n;
	 }
  }

 //SUMA FILAS DE MATRIZ Y ENCUENTRA LA POSICION DEL ELEMENTO MAYOR
 public int sumaf(int ma[][],int nf, int nc, int vsf[], int posma)
  {
	int k,l;
	//posma= posmay(n,vec);
	for(k=0; k<nf;k++)
	 {
			   vsf[k]=0;
			   for(l=0; l< nc; l++){
				 vsf[k]=vsf[k]+ma[k][l];
			   }
		}
	posma=posmay(nf,vsf);
	return posma;
  }

  //FUNCION QUE ENCUENTRA LA POSICION DEL ELEMENTO MAYOR EN UN VECTOR
   public int posmay(int n, int vec[])
   {
	 int mayor=vec[0],i,pos=0;
	 for(i=1; i< n; i++){

	   if(mayor <= vec[i])
			   {
			   mayor=vec[i];
			   pos=i;
			   }
	 }
	 return pos;
   }

 //PROCEDIMIENTO QUE LEE LA MATRIZ
 public void lectura(int f,int matriz[][]) throws IOException
  {
   int i,j;
   BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
   String temporal;
   
   for(i=0; i< f; i++)
	{

	  for(j=0; j<10; j++)
	   {
		System.out.print("\nIngrese la cantidad de estudiantes de la facultad "+(i+1)+" nivel "+(j+1)+" :");
		temporal = lector.readLine();
		matriz[i][j]=Integer.parseInt(temporal);
	   }
	}
  }
  
 //PROCEDIMIENTO  QUE MUESTRA: PROMEDIO DE ESTUDIANTES POR NIVEL,
 //ESTUDIANTES POR FACULTAD Y LA FACULTAD CON MAYOR No DE ESTUDIANTES
 public void salida(int np, float vprom[],int nef,int vfac[],int mayf)
  {
	int i;
	System.out.println("\n\nUNIVERSIDAD DE ANTIOQUIA");
	System.out.println("\nPROMEDIO DE ESTUDIANTES POR NIVEL\n");
	System.out.print("NIVEL\t\t\tPROMEDIO"); 
	for(i=0; i<np; i++)
	  {
		System.out.print("\n"+(i+1)+"\t\t\t"+vprom[i]);
	  }
	System.out.println("\n\nTOTAL DE ESTUDIANTES POR FACULTAD");
	System.out.print("\nFACULTAD\t\t\tESTUDIANTES");
	for(i=0; i<nef; i++)
	 {
		System.out.println("\n"+(i+1)+"\t\t\t"+vfac[i]);
	 }
	
	System.out.print("LA FACULTAD CON MAYOR NUMERO DE ESTUDIANTES ES LA: "+(mayf+1));
  }

}
