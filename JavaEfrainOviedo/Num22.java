/**
* EJERCICIO RESUELTO No. 22
* @autor	Efrain Oviedo
* @libro	Logica de Programación
* 
*/


 import java.io.*;//LIBRERIA NECESARIA PARA EL BUFFERED READER

public class Num22
{
	
	public static void main(String ar[]) 
		throws IOException//MANEJA LAS EXEPCIONES DEL READLINE
   {
	
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		String temporal;
	  	int valn=0, val0=0, valp=0, num=0,totaln,nc,i,sw,prueba;
	    String siga,numc;  long suma=0;
	    siga="SI";
	    while((siga.equals("SI"))||(siga.equals("Si"))||(siga.equals("si")))
	    {
			do
		 	{
		   	   System.out.println("ENTRE NUMERO ENTERO:      ");
			   numc=lector.readLine();
			   nc=numc.length();
			   sw=0;
			   for(i=0;i<nc;i++)
			     
			     	try
					{
						prueba=Integer.parseInt(numc);
						 
					}
					catch(NumberFormatException ex)
					{
						System.out.println("DIGITE SOLO NUMEROS Y EL SIGNO -");
				      	System.out.println("PRESIONE UNA TECLA");
				      	temporal = lector.readLine();
				      	sw=1;
				      	break;
				   	}
			}
		 	while(sw==1);
			num=Integer.parseInt(numc);//CONVIERTE UNA HILERA DE CARACTERES A NUMERO
			suma+=num;
			if(num > 0)
			  valp++;
			 else
			     if(num==0)
			    	 val0++;
			  	 else
			     	 valn++;
			
			 
			 System.out.println("HAY MAS NUMEROS SI/NO     ");
			 siga=lector.readLine();
		}
		     totaln=valp+valn+val0;
		     
		     System.out.println("RESULTADOS");
		     System.out.println("SUMA DE LOS NUMEROS:  "+suma);
		     System.out.println("NUMEROS NEGATIVOS:      "+valn);
		     System.out.println("NUMEROS IGUALES A CERO: "+val0);
		     System.out.println("NUMEROS POSITIVOS:      "+valp);
		     System.out.println("TOTAL DE NUMEROS:       "+totaln);
		     System.out.println("PRESIONE TECLA PARA TERMINAR");
		     
	 
	}
}

  
