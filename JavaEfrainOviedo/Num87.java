/**
* EJERCICIO RESUELTO No. 87
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
* Este ejercicio utiliza la estructura de la clase Num86_Est
*/

import java.io.*;
public class Num87 {

    private Num86_Est[] arreglo = new Num86_Est[100];
    int tamArreglo = 0;
    
    
    public Num87() throws IOException {
        
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Digite la cantidad de empleados: ");
		tamArreglo = Integer.parseInt(in.readLine());
		String sw="S";
		int op;
		
		//Se muestra el menu
		do {
			System.out.println("MENU");
			System.out.println("1: LEER VECTOR");
			System.out.println("2: IMPRIMIR  VECTOR");
			System.out.println("3: ORDENAR   VECTOR ");
			System.out.println("4: INSERTAR ELEMENTO");
			System.out.println("5: TERMINAR PROGRAMA");
			System.out.print("DIGITE OPCION:  ");
			op= Integer.parseInt(in.readLine());
			System.out.print("\n");
			switch (op)
			 {
			   case 1: leer(tamArreglo); break;
			   case 2: mostrarVector(); break;
			   case 3: ordenar(); break;
			   case 4: sw="S";
				  while(sw.toUpperCase()=="S")
				   {
				    insertar();
				    System.out.print("HAY MAS EMPLEADOS PARA ADICIONAR S/N  ");
				    sw=in.readLine();
				   }
				   break;
			   case 5:
				   System.out.println("FIN DEL PROGRAMA");
				   break;
			 }
			  }while(op !=5);
        
       
    }
    
	//Leer el arreglo de n registros
	void leer(int n) 
	throws NumberFormatException, IOException {
		 int k;   
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String temporal;
		for(k=0; k<n;k++)
		{
			System.out.print("\nDigite la cedula: ");
			temporal=in.readLine();
			arreglo[k]= new Num86_Est();
			arreglo[k].setCedula(Long.parseLong(temporal));
			System.out.print("\nDigite el nombre: ");
			arreglo[k].setNombre(in.readLine().toUpperCase());
			System.out.print("\nDigite el pago: ");
			temporal=in.readLine();
			arreglo[k].setPago(Long.parseLong(temporal));
				
		}
	  }
    
    //Insertar un nuevo registro ordenado por el campo nombre
    private void insertar() 
    	throws NumberFormatException, IOException{
	  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	  System.out.print("Entre la cedula:");
	  long cedula = Long.parseLong(in.readLine());
	  System.out.print("\nEntre los nombres:");
	  String nombres = in.readLine().toUpperCase();
	  System.out.print("\nEntre el pago:");
	  long pago = Long.parseLong(in.readLine());

	  Num86_Est nuevo = new Num86_Est(cedula, nombres, pago);

	  int i;
	  for (i = 0; i < tamArreglo; i++) {
		  if (arreglo[i].getNombre().compareTo(nuevo.getNombre()) > 0) {
			  for (int j = tamArreglo - 1; j >= i; j--) {
				  arreglo[j+1] = arreglo[j];
			  }
			  tamArreglo = tamArreglo + 1;
			  arreglo[i] = nuevo;
			  break;
		  }
	  }
	  if (i == tamArreglo) {
		  tamArreglo = tamArreglo + 1;
		  arreglo[tamArreglo - 1] = nuevo; 
	  }
    }
    

	//	ordenar el arreglo por el campo nombre.
	private void ordenar(){
		  String menor = "";
		  for (int i = 0; i < tamArreglo - 1; i++) {
			  for (int j = i; j < tamArreglo; j++) {
				  if (arreglo[i].getNombre().compareTo(arreglo[j].getNombre()) > 0) {
					  Num86_Est aux = arreglo[i];
					  arreglo[i] = arreglo[j];
					  arreglo[j] = aux;
				  }
			  }
		  } 
		  mostrarVector();   
	}
    
    //Imprimir el vector
    private void mostrarVector() {
        System.out.println("Cedula\t\t nombres \t\t\t pago");
        System.out.println("-----------------------------------------------------------");
        for (int i = 0; i < tamArreglo; i++) {
            System.out.println(arreglo[i].getCedula() + " \t\t " + arreglo[i].getNombre() + " \t\t\t " + arreglo[i].getPago());
        }
        System.out.println("");
    }
    

    public static void main(String[] args) throws IOException {
        new Num87();
    }
    
    
    
}
