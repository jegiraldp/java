/**
* EJERCICIO RESUELTO No. 9
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*/

public class Num09
{
	public static void main(String ar[]) 
	{

		int y=20,a=10,b=5,c=2,x;
		if((y<a) && ((a<b) && (b<c)))
			x=0;
		else
			if((a<=y) && (y<b))
				x=1;
	 		else
				if((b<=y) && (y<c))
					x=2;
		 		else
			 		if(c<=y)
	       				x=3;
	      			else
	       				x=4;
      System.out.println("EL VALOR DE X ES: ");
      System.out.println(x);
      System.out.println("PRESIONE TECLA");


	}
}


















