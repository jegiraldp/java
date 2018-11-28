/**
* EJERCICIO RESUELTO No. 29
* @autor	Efrain Oviedo
* @libro	Logica de Programación
* 
*/

import java.io.*;//LIBRERIA NECESARIA PARA EL BUFFERED READER

public class Num29 extends Num24
{
	public static void main(String ar[]) 
			throws IOException//MANEJA LAS EXEPCIONES DEL READLINE
	{
	
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		String temporal;
		Num29 objeto=new Num29();
     	long nvpe=0,nvpa=0,nvvi=0,nvbl=0,ntv;
     	int op; String pc,v;boolean sw=false;
     	do
     	{
			System.out.println("ENTRE PIEDRACEDULA: ") ; pc=lector.readLine();
		 	sw=objeto.valint(pc);
		 	if(sw==false)
		  	{
		    		System.out.println("ENTRE SOLO DIGITOS,PRESIONE TECLA");
		    		temporal=lector.readLine();
		    		System.out.println("                  ");
		    		System.out.println("                                 ");
		  	}
       }while(sw==false);
     	
     	while(!pc.equals("0")){
     	
		System.out.println(" 1: PEDRO");
		System.out.println(" 2: PABLO");
		System.out.println(" 3: VILMA"); 
		System.out.println(" 4: EN BLANCO");
     	
	  do
	  {
	    	sw=true;
	    	System.out.println("SELECCIONE SU VOTO ENTRE 1 Y 4 ");
	    	v=lector.readLine();
	    	if((v.charAt(0)==0) ||((v.charAt(0))<'1') || (v.charAt(0) >'4'))
	      	{
				sw=false;
				System.out.println(' ');
	      	}
	  }while(sw==false);
		  op=Integer.parseInt(v);
	  switch (op)
	  {
	    	case 1: nvpe++; break;
	    	case 2: nvpa++; break;
	    	case 3: nvvi++; break;
	    	case 4: nvbl++; break;
	  }
	  do
	  {
	  	System.out.println("ENTRE PIEDRACEDULA O ");
	   	System.out.println("CERO PARA TERMINAR: " ); pc=lector.readLine();
	  	sw=objeto.valint(pc);
	  	if(sw==false)
	   	{
	    		System.out.println("ENTRE SOLO DIGITOS,PRESIONE TECLA");
	    		temporal=lector.readLine();
	    		System.out.println("                  ");
	    		System.out.println("                                 ");
	   	}
       }while(sw==false);
      }
      ntv=nvpe+nvpa+nvvi+nvbl;
      System.out.println("RESULTADO DE LAS ELECCIONES");
      System.out.println("VOTOS TOTALES:   "+ntv);
      System.out.println("VOTOS POR PABLO: "+nvpa);
      System.out.println("VOTOS POR PEDRO: "+nvpe);
      System.out.println("VOTOS POR VILMA: "+nvvi);
      System.out.println("VOTOS EN BLANCO: "+nvbl);
      System.out.println("PRESIONE TECLA PARA TERMINAR");
	}
}

