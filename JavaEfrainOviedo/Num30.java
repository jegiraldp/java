/**
* EJERCICIO RESUELTO No. 30
* @autor	Efrain Oviedo
* @libro	Logica de Programación
* 
*/
  
import java.io.*;//LIBRERIA NECESARIA PARA EL BUFFERED READER

public class Num30 extends Num24
{
	public static void main(String ar[]) 
			throws IOException//MANEJA LAS EXEPCIONES DEL READLINE
    {
	
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		String temporal;
		
	    Num30 objeto= new Num30();
		int la,an,sw; String lac,anc;
	    long nsp=0,nsaf=0,sd1510=300,sd2015=0;
	    do
	    {
	      System.out.println("ENTRE EL LARGO DEL SOBRE: ");lac=lector.readLine();
	      if(objeto.valint(lac)==false)
	       { System.out.println("        "); }
	    }while(objeto.valint(lac)==false);
	    la=Integer.parseInt(lac);
	    while(la!=0)
	      {
	       do
			{
			  System.out.println("ENTRE  EL  ANCHO  DEL SOBRE: ");
			  anc=lector.readLine();
			  if(objeto.valint(anc)==false)
			    { System.out.println("            ");}
			}while(objeto.valint(anc)==false);
	       an=Integer.parseInt(anc);
	       nsp++;
	       if((la<=15) && (an<=10))
		 {
		  if(sd1510>0)
		     sd1510--;
		   else
		     {
		       if(sd2015 > 0)
			 sd2015--;
			else
			 nsaf++;
		     }
		 }
		else
		 {
		   if((la<=20) && (an<=15))
		     {
		       if(sd2015 > 0)
			 sd2015--;
			else
			 nsaf--;
		     }
		    else
		     nsaf++;
		 }
	       do
		{
		  System.out.println("ENTRE EL LARGO, FINALIZAR 0: ");
		  lac=lector.readLine();
		  if(objeto.valint(lac)==false)
		    { System.out.println("             "); }
		}while(objeto.valint(lac)==false);
	       la=Integer.parseInt(lac);
	     }
	     System.out.println("SOBRES  A   PEDIR: "+nsp);
	     System.out.println("SOBRES A FABRICAR: "+nsaf);
	     System.out.println("PRESIONE TECLA PARA TERMINAR");
	  

	}
}

