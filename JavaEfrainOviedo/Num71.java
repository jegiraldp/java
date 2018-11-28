/**
* EJERCICIO RESUELTO No. 71
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
* Este ejercicio utiliza los métodos de la clase manejadora de vectores
*/

import java.io.*;
public class Num71 {

	public Num71() throws IOException {
		
	    int n = 0; //tamaño del vector
	    ManejadorVectores manejador = new ManejadorVectores();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Digite el tamaño del vector: ");
		n = Integer.parseInt(in.readLine());
		double a[] = new double[100]; //El vector es maximo de 100 posiciones
		int op, op1;
		int vin1, vin2, valbo, valbus;
		int resp;
	
		//Se muestra el menu
		do {
			System.out.println("\nMENU");
			System.out.println("1: LEER VECTOR");
			System.out.println("2: IMPRIMIR  VECTOR");
			System.out.println("3: INSERTAR  DESORDENADO ");
			System.out.println("4: ORDENAR EL VECTOR");
			System.out.println("5: INSERTAR ORDENADO");
			System.out.println("6: BUSCAR UN VALOR");
			System.out.println("7: BORRAR UN ELEMENTO");
			System.out.println("8: TERMINAR PROGRAMA");
			System.out.print("DIGITE OPCION:  ");
			op= Integer.parseInt(in.readLine());
			System.out.print("\n");
			switch (op)
			 {
			   case 1: 	manejador.leer_vec(n,a); break;
			   case 2: 	manejador.imprimir_vec(n,a); break;
			   case 3: 	System.out.print("ENTRE EL VALOR A INSERTAR: ");
			   			vin1= Integer.parseInt(in.readLine());  
						n=manejador.insertar_desordenado(n,a,vin1);
			    		break;
			   case 4:  do
					    {
							System.out.println("MENU");
							System.out.println("1: BURBUJA");
							System.out.println("2: BURBUJA_MEJORADO");
							System.out.println("3: SELECCION");
							System.out.println("4: BARAJA");
							System.out.println("5: VOLVER AL MENU PPAL");
							System.out.print("DIGITE OPCION:  ");
							op1= Integer.parseInt(in.readLine());
							System.out.print("\n");
							switch (op1){
								  case 1: 	manejador.ordenburbuja(n,a);
											break;
								  case 2: 	manejador.ordenburbuja_mejorado(n,a);
											break;
								  case 3: 	manejador.ordenseleccion(n,a);
											break;
								  case 4: 	manejador.ordenbaraja(n,a);
											break;
								  case 5:
											break;
								 } //FIN CASOS
					   }while(op1 !=5);
						break;
			   case 5:
			   			System.out.print("ENTRE EL VALOR A INSERTAR: ");
				 		vin2= Integer.parseInt(in.readLine());  
						n=manejador.insertar_ordenado(n,a,vin2);
						break;
				case 6: System.out.print("ENTRE EL VALOR A BUSCAR: ");
						valbus= Integer.parseInt(in.readLine());
						resp=manejador.busquedabin(n,a,valbus); 
						if(resp !=-1)
						{
							System.out.print(valbus + " ESTA EN LA POSICION: "+resp+"DEL VECTOR");
					    }else
						{
							System.out.print(valbus + " NO ESTA EN EL VECTOR");
						}
						 break;
				case 7:  System.out.print("ENTRE EL VALOR A BORRAR: ");
						 valbo= Integer.parseInt(in.readLine());
						 n=manejador.borrar_elemento(n,a,valbo);
						 break;
				case 8:  break;					
						
			 }
			  }while(op !=8);
	}
	
	public static void main(String[] args) throws IOException {
		   new Num71();
	   }
      
}
