package todo;

import java.util.Random;

public class verificarUbicacion {
	static Random r= new Random();
	
	static int pifA, picA, pffA, pfcA;
	
	//verifica que no se pongana en L o en diagonal los barcos
	static int verificarAlineacion(int pif, int pic, int pff, int pfc){
		int bnd=0;
		//caso no horizontal o no diagonal
		if(pif==pff || pic==pfc){
			//System.out.println(":)");
			bnd=1;
		}
		return bnd;
	}//metodo
	
	//verifica que el barco de 5 ocupe 5 celdas, y asi cada barco
	static int verificarTamano(int tam, int nom){
		int bnd2=0;
		//System.out.println("nom "+nom+":"+pifA+","+picA+"--"+pffA+","+pfcA + "--tam="+tam);
		
		if(pifA==pffA){
			if(picA>pfcA){
			picA=pfcA+(tam-1);
			if(picA>9)picA=pfcA-(tam-1);
			}else{
				picA=pfcA+(tam-1);
				if(picA>9)picA=pfcA-(tam-1); 
			}
		bnd2=1;	
		}//if
		if(picA==pfcA){
			
			if(pifA>pffA){
				pifA=pffA+(tam-1);	
				if(pifA>9)pifA=pffA-(tam-1);
				}else{
					pifA=pffA+(tam-1);
					if(pifA>9)pifA=pffA-(tam-1); 
				}
			
			bnd2=1;
		}//if
		
		
		return bnd2;
	}//metodo
	
	//asigna las coordenadas de ubicacion aleatoriamente
	static void asignarTodas(){
		pifA=r.nextInt(10);
		picA=r.nextInt(10);
		pffA=r.nextInt(10);
		pfcA=r.nextInt(10);
	}
}
