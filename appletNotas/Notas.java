

import java.io.*;


public class Notas 
{
	
  	static double[] not ={3.0,4.0,4.5,5.0,5.0,5.0,5.0,3.0,4.0,3.0,2.5,2.0,0.5,0.5,1.0,1.5,2.0,2.5,3.0,5.0};
	static int[] frec = new int[11];
	static String linea;
        
    						// LEE EL ARCHIVO.
    public Notas() throws IOException
    {
	
		frecuencia();
    }
    
    							// CALCULA FRECUENCIA.
    static void frecuencia()
    {	  	 
    	
    	
    	float nota=0;
    		  	
    	for (int i=0; i<11; i++)
    	{    	
   
    		cont(nota,i);
    		nota += 0.5; 	
    	}
    }
    
    										// CUENTA LAS OCURRENCIAS.
    static void cont(float val, int pos)
    {
    	
    	System.out.println("cont");
    	for (int i=0; i<20; i++)
    	{ 	
    		 if (val == not[i]){
    		 
    		 	frec[pos]++;
    		 	System.out.println(frec[pos]);
    		 	}
    		 	
    	}
    	//System.out.println(frec[pos]);  // Ocurrencias.
    }
    
} //clase