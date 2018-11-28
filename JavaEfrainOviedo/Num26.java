/**
* EJERCICIO RESUELTO No. 26
* @autor	Efrain Oviedo
* @libro	Logica de Programación
* 
*/ 


import java.io.*;//LIBRERIA NECESARIA PARA EL BUFFERED READER

public class Num26
{
    public static void main(String ar[]) 
    		throws IOException//MANEJA LAS EXEPCIONES DEL READLINE
    {
	
    BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
    String temporal;
    
    float proan, peso, proac, dp, sumap;
    Number f;
    int cona=1, conp;
    while(cona <=4) //Cuatro atletas
     {
       System.out.println("ENTRE EL PESO PROMEDIO ANTERIOR: "); 
       temporal=lector.readLine();
       f=Float.valueOf(temporal); 
       proan= f.floatValue();
       conp=0; sumap=0;
       while(conp < 5) //Cinco pesos
		{
		  System.out.println(" ");	
		  conp++;
		  System.out.println("ENTRE EL PESO "+conp+" DEL ATLETA "+cona+' ');
		  temporal=lector.readLine();  
		  peso=Integer.parseInt(temporal);
		  sumap=sumap+peso;
		  
		}
       proac=sumap/5;
       dp=proac-proan;
       if(dp > 0)
	 		System.out.println("EL ATLETA "+cona+" SUBIO "+dp+' '+"KILOS");
		else{
			  if(dp==0)
			    System.out.println("EL ATLETA "+cona+" ESTA ESTABLE");
			   else
			     System.out.println("EL ATLETA "+cona+" BAJO "+dp+" KILOS");
		}
		
		
		cona++;
		if(cona>4)
			System.out.println("\n\nPRESIONE TECLA PARA TERMINAR... ");
		else
			System.out.println("\n\nPRESIONE TECLA PARA CONTINUAR ");
		temporal=lector.readLine();
     }
     

 }
}



