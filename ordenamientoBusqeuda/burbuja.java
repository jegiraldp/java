package pqtOrdenamiento;

public class burbuja {
	static long tDelta;
	
	static void ordenarBurbuja(int[] vec){
		long tInicio=0;
		int aux;
		boolean bnd;
		
		tInicio=System.nanoTime(); //captura nanotimeInicio
		while(true){
			bnd=false;
		for (int i = 0; i < vec.length-1; i++) {
			
			if(vec[i]>vec[i+1]){
				aux=vec[i];
				vec[i]=vec[i+1];
				vec[i+1]=aux;
				bnd=true;
			}
		}//for
		
		if(bnd==false) break;
		}//while
		tDelta=System.nanoTime()-tInicio;
	}//ordenarBurbuja
	
	
	
	
	
	
	

}//clase
