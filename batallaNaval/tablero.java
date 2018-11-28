package todo;

import java.io.IOException;

public class tablero {
	
	static String[][] tablero;
	static String barcoImpactado; 
	
	//crea la matriz de 10 *10
	static void crear(){
		
		tablero = new String[10][10];
		
		for (int i = 0; i < tablero.length; i++) {
			
			for (int j = 0; j < tablero.length; j++) {
				//tablero[i][j]=i+","+j;	
				tablero[i][j]=".";
			}
			
						
		}
		
	}//metodo
	
	static void ver(){
		System.out.println("\t0\t1\t2\t3\t4\t5\t6\t7\t8\t9");
		System.out.println("\t-------------------------------------------------------------------------");
		
		for (int i = 0; i < tablero.length; i++) {
			System.out.print(i+"|"+"\t");
			for (int j = 0; j < tablero.length; j++) {
				System.out.print(tablero[i][j]+"\t");	
			}
			System.out.print("\n");
			
		}
		
	}
	
	//ubica los barcos en la matriz
	static void ubicar(int pif, int pic, int pff, int pfc, int B){
		//System.out.println("nom "+B+":"+pif+","+pic+"--"+pff+","+pfc);
			
		
		if(pif==pff && pic>pfc){
			for (int j = pic; j > (pfc-1); j--) {
				tablero[pif][j]=String.valueOf(B);
			}
		}//
		if(pif==pff && pic<pfc){
			for (int j = pic; j < (pfc+1); j++) {
				tablero[pif][j]=String.valueOf(B);
			}
		}//if
		if(pic==pfc && pif>pff){
			for (int jj = pif; jj > (pff-1); jj--) {
				tablero[jj][pic]=String.valueOf(B);
			}
		}//
		if(pic==pfc && pif<pff){
			for (int jk = pif; jk < (pff+1); jk++) {
				tablero[jk][pic]=String.valueOf(B);
			}
		}//
		//tablero[pif][pic]=String.valueOf(B);
		//tablero[pff][pfc]=String.valueOf(B);
		
						
	}//ubicar metodo
	
	//verificar si se cruzan las posiciones de los barcos
	static int verificaCruces(int pif, int pic, int pff, int pfc){
		int bnd=0;
		int bnd1=0;
		int bnd2=0;
		int bnd3=0;
		int bnd4=0;
		
		if(pif==pff && pic>pfc){
			for (int j = pic; j > (pfc-1); j--) {
				if(tablero[pif][j]=="."){
					 
				}else{
					 bnd1++;
				}
			}
		}//
		if(pif==pff && pic<pfc){
			for (int j = pic; j < (pfc+1); j++) {
				if(tablero[pif][j]=="."){
					 
				}else{
					 bnd2++;
				}
			}
		}//if
		
		///////////////////////
		
		if(pic==pfc && pif>pff){
			for (int jj = pif; jj > (pff-1); jj--) {
				if(tablero[jj][pic]=="."){
				}else{
					bnd3++;
				}
			}
		}//
		if(pic==pfc && pif<pff){
			for (int jk = pif; jk < (pff+1); jk++) {
				if(tablero[jk][pic]=="."){
				}else{
					bnd4++;
				}
			}
		}//
		
		if(bnd1>0 || bnd2>0 || bnd3>0 || bnd4>0){
			bnd=1;
		}
		return bnd;
		
	}
		
	//escribe el dato en la matriz
	static void escribir(int f, int c)throws IOException{
		
		if(tablero[f][c].equals(".")){
			tablero[f][c]="#";	
		}
		if(!tablero[f][c].equals(".") && !tablero[f][c].equals("#")){
			barcoImpactado=tablero[f][c];
			//System.out.println("barco "+barcoImpactado);
			barco.impactar(barcoImpactado);
			tablero[f][c]="X";
			
		}
							
		}//escribir
		
	


}//clase
