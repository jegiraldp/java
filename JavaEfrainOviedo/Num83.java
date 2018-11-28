/**
* EJERCICIO RESUELTO No. 83
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
* Este ejercicio utiliza los métodos de la clase manejadora de matrices
**/

import java.io.*;//LIBRERIA NECESARIA PARA EL BUFFERED READER


public class Num83
{
	static String temporal;
	static BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
	

	public static void main(String ar[]) throws IOException//MANEJA LAS EXEPCIONES DEL READLINE
	//FUNCION PRINCIPAL DEL PROGRAMA
    {
	 ManejadorMatrices manejador = new ManejadorMatrices();
	 
	 int nfac,fmayor=0;
	 System.out.print("\nIngrese la cantidad de facultades: ");
	 temporal = lector.readLine();
	 nfac=Integer.parseInt(temporal);
	 int nivel[][]=new int[nfac][10];
	 float vprom[]=new float[10];
	 int vepf[]= new int[nfac];
	 
     manejador.lectura(nfac,nivel);
	 manejador.promc(nivel,nfac,10,vprom);
	 fmayor=manejador.sumaf(nivel,nfac,10,vepf,fmayor);
	 manejador.salida(10,vprom,nfac,vepf,fmayor);
	  

	}
}



