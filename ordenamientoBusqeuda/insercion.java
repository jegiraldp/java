package pqtOrdenamiento;

public class insercion {
	static long tDelta;
	
	static void ordenarInsercion(int[] vec){
		long tInicio=0;
		int aux;
		int cont1;
		int cont2;
		tInicio=System.nanoTime(); //captura nanotimeInicio
		
		for (cont1=1; cont1 < vec.length; cont1++) {
			aux=vec[cont1];
			for(cont2=cont1-1;cont2>=0;cont2--){
				if(vec[cont2]>aux){
				vec[cont2+1]=vec[cont2];
				vec[cont2]=aux;
				}//if
						
			}//for cont2
			
		}//for cont1
		tDelta=System.nanoTime()-tInicio;
	}//ordenarInsercion 

}//clase
