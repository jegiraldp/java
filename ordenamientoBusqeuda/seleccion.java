package pqtOrdenamiento;

public class seleccion {
	static long tDelta;
	
	
	
	static void ordenarSeleccion(int[] vec){
	
		long tInicio=0;
		int menor;
		int aux;
		
		tInicio=System.nanoTime(); //captura nanotimeInicio
		for (int i = 0; i < vec.length-1; i++) {
			menor=i;
			for (int j = i+1; j < vec.length; j++) {
				if(vec[j]<vec[menor]){
					menor=j;
				}
			}//for
			
			if(i!=menor){
				aux=vec[i];
				vec[i]=vec[menor];
				vec[menor]=aux;
			}//if
			
		}//for
		tDelta=System.nanoTime()-tInicio;
	}//ordenarSeleccion
	
}//clase
