package todo;

import java.io.IOException;
import java.util.*;

public class barco {
	
	public int nombre;
	public int tamano;
	public int tamanoAux;
	public int estado;
	
	static barco[] arregloBarcos;
	public int pif;
	public int pic;
	public int pff;
	public int pfc;
	static int juego;
	
	static Random r = new Random();
	
	//crea los barcos y los ubica
	static  void crearBarcos(){
		
		arregloBarcos= new barco[5];
		int[] tamanos={2,3,3,4,5};
		int okAlineacion=0;
		int okTamano=0;
		int okCruce=0;
		
		for (int i = 0; i < arregloBarcos.length; i++) {
			arregloBarcos[i]= new barco();
			arregloBarcos[i].nombre=(i+1);
			arregloBarcos[i].tamano=tamanos[i];
			arregloBarcos[i].tamanoAux=arregloBarcos[i].tamano;
			arregloBarcos[i].estado=1;
			
			while(okAlineacion==0){
			verificarUbicacion.asignarTodas();
			arregloBarcos[i].pif=verificarUbicacion.pifA;
			arregloBarcos[i].pic=verificarUbicacion.picA;
			arregloBarcos[i].pff=verificarUbicacion.pffA;
			arregloBarcos[i].pfc=verificarUbicacion.pfcA;
			okAlineacion=verificarUbicacion.verificarAlineacion(arregloBarcos[i].pif,arregloBarcos[i].pic,arregloBarcos[i].pff,arregloBarcos[i].pfc);
			}
			
			while(okTamano==0 || okCruce==1){
				verificarUbicacion.asignarTodas();
				okTamano=verificarUbicacion.verificarTamano(arregloBarcos[i].tamano, arregloBarcos[i].nombre);
			 	//System.out.println("tam "+okTamano);
			 	
				arregloBarcos[i].pif=verificarUbicacion.pifA;
				arregloBarcos[i].pic=verificarUbicacion.picA;
				arregloBarcos[i].pff=verificarUbicacion.pffA;
				arregloBarcos[i].pfc=verificarUbicacion.pfcA;
				
				okCruce=tablero.verificaCruces(arregloBarcos[i].pif,arregloBarcos[i].pic,arregloBarcos[i].pff,arregloBarcos[i].pfc);
				//System.out.println("cruce "+okCruce);
				//if(okCruce==1)System.out.println("aqui debe pintar"); 
							
			}
			
			tablero.ubicar(arregloBarcos[i].pif,arregloBarcos[i].pic,arregloBarcos[i].pff,arregloBarcos[i].pfc,arregloBarcos[i].nombre);
			
			okCruce=0;
			okAlineacion=0;
			okTamano=0;
		}//for
		
	}//metodo
	
	//marca los impactos en cada barco
	static void impactar(String nombre)throws IOException{
		int pos = Integer.parseInt(nombre);
		int bnd= 0;
		arregloBarcos[(pos-1)].tamanoAux--;
		if(arregloBarcos[(pos-1)].tamanoAux==0){
			System.out.println("El barco "+arregloBarcos[(pos-1)].nombre+" esta fuera de combate !!!\n");
			juego=gane();
			if(juego==1){
				System.out.println("******* CONGRATULATIONS --- GANASTE --- Fin del juego!!!  ********\n");
				principal.main(null);
			}
			
			
		}
		
	}
	
	//determina si gane o no el juego
	static int gane(){
		//System.out.println("Verificando si gano.....");
		int bnd=0;
	int rta=0;
	
		for (int i = 0; i < arregloBarcos.length; i++) {
			//System.out.println("tamAux "+arregloBarcos[i].tamanoAux);
			if(arregloBarcos[i].tamanoAux==0){
				bnd++;
			}
			
		}//for
	if(bnd==5){		
	rta=1;
	}
	
	return rta;
}
	
	
} //clase
