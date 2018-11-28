/**
* EJERCICIO RESUELTO No. 77
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
*/


import java.io.*;//LIBRERIA NECESARIA PARA EL BUFFERED READER

public class Num77 
{
	
	
	public static void main(String ar[]) 
	throws IOException//MANEJA LAS EXEPCIONES DEL READLINE
	{
	
		//Variables
		int numeroPreguntas=100;
		int n=0; //Cantidad de estudianes
		int puntajeParaGanar=60;
		int VRC[];
		int MR[][];
		String NOM[];
		int pun=0, np=0;
				
		//Se ingresan la cantidad de estudiantes
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		String temporal;
		System.out.print("Ingrese la cantidad de estudiantes:");
		temporal = lector.readLine();
		n=Integer.parseInt(temporal);
		
		VRC = new int[100];
		MR = new int[n][100];
		NOM = new String[n];
		
				
		System.out.println("\n\nIngrese las respuestas correctas");
		// Se ingresan las respuestas corrrectas
		for(int i=0; i<numeroPreguntas; i++){
			System.out.print("\nRespuesta a la pregunta "+ (i+1)+": ");		
			temporal = lector.readLine();
			VRC[i]=Integer.parseInt(temporal);
		}
		
				
		//Se ingresan los nombres de los estudiantes y sus respuestas
		for(int i=0; i<n; i++){
			System.out.print("\nIngrese el nombre del estudiante:");
			temporal = lector.readLine();
			NOM[i]=temporal;
			for(int j=0; j<numeroPreguntas; j++){
				System.out.print("\nRespuesta a la pregunta"+ (j+1)+": ");		
				temporal = lector.readLine();
				MR[i][j]=Integer.parseInt(temporal);
			}	
			
		}
		
		// Se muestran los resultados
		System.out.println("\n\nRESULTADOS");
		System.out.println("Nombres de los Ganadores");
		for(int i=0; i<n; i++){
			pun=0;
			for(int j=0; j<numeroPreguntas; j++){
				if(MR[i][j] == VRC[j]){
					pun++;
				}
			}
			if(pun >= puntajeParaGanar){
				System.out.println(NOM[i]);
			}else{
				np++;
			}	
			
		}
		System.out.print("\nNumero de perdedores:"+np);
	
	}
}


	
	
	
	
	