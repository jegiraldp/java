/**
* EJERCICIO RESUELTO No. 8
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*/


public class Num08
{
	public static void main(String ar[]) 
    {
      
	  boolean A=false,B=false,C=false,D=true,E=true; 
      if(A)
       {
			if(B)
	    		System.out.println("SECUENCIA 1");
	 		else
	   			if(C)
	      			System.out.println("SECUENCIA 2");
	    		else
	      			System.out.println("SECUENCIA 3");
       }
       else
       {
			System.out.println("SECUENCIA 4");
			if(D)
	   			if(E)
	     			System.out.println("SECUENCIA 5");
	     		else
	      			System.out.println("SECUENCIA 6");
	 		else
	   			System.out.println("SECUENCIA 7");
       }
       System.out.println("PRESIONE TECLA PARA TERMINAR");
      
	}
}

      
    



