import java.*;


public class matrizAD { 


  
  public static void main (String[] args)  throws Exception
    {
	
   	int [][] Matriz = new int [4][4];
   	Matriz[0][0]=2;
   	Matriz[0][1]=2;
   	Matriz[0][2]=2;
   	Matriz[1][0]=3;
   	Matriz[1][1]=3;
   	Matriz[1][2]=3;
   	Matriz[2][0]=4;
   	Matriz[2][1]=4;
   	Matriz[2][2]=4;
   	Matriz[2][0]=5;
   	Matriz[2][1]=5;
   	Matriz[2][2]=5;
   	
	
    for (int i=0; i < 4; i++) {
     for (int j=0; j < 4; j++) {	
  	
  		System.out.print(Matriz [i][j] + "\t");
  		
  		
  	
  	  	}
  	  	System.out.println("");  
  	
  	} 
  	
  	
  	} 
    
    
  
 }