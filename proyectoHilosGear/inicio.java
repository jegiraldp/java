package pqtGear;

import java.net.MalformedURLException;
import java.util.*;

public class inicio {
	
	static int mvg1,mvg2,mvg3;
	static Random rnd;
	static int muertes,bajas,ayudas;
	static jugador[] gears;
	
	
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		mvg1=mvg2=mvg3=muertes=bajas=ayudas=0;		
		gears= new jugador[3];
		rnd = new Random();
		
		jugador tablero = new jugador("board");
		
		gears[0]= new jugador("gear-1", 0, 0, 0,50);
		gears[1]= new jugador("gear-2", 0, 0, 0,50);
		gears[2]= new jugador("gear-3", 0, 0, 0,50);
		
		audioGear.iniciar();
		jugador sonido = new jugador("sonido");
		
		gears[0].join();
		gears[1].join();
		gears[2].join();
		tablero.join();
		sonido.join();
		

	}//
	
	//Base:50 Baja(1):30  Muerte(2):-10 Ayuda(3):5  Nada(4,5,0)	
	static void jugar() throws InterruptedException{
		for (int i = 0; i < 60; i++) {
		Thread.sleep(1000);
			
		if(Thread.currentThread().getName().equals("gear-1")){
			mvg1=getMove();
			//System.out.println(Thread.currentThread().getName()+":"+mvg1);
			if(mvg1==1)gears[0].setBajas(1);
			if(mvg1==2)gears[0].setMuertes(1);
			if(mvg1==3)gears[0].setAyudas(1);
			gears[0].calculoPuntaje();
			//System.out.println(gears[0].getBajas()+":"+gears[0].getMuertes()+":"+gears[0].getAyudas());			
		}//
		
		if(Thread.currentThread().getName().equals("gear-2")){
			mvg2=getMove();
			//System.out.println(Thread.currentThread().getName()+":"+mvg2);
			if(mvg2==1)gears[1].setBajas(1);
			if(mvg2==2)gears[1].setMuertes(1);
			if(mvg2==3)gears[1].setAyudas(1);
			gears[0].calculoPuntaje();
			//System.out.println(gears[1].getBajas()+":"+gears[1].getMuertes()+":"+gears[1].getAyudas());
						
		}//
		
		if(Thread.currentThread().getName().equals("gear-3")){
			mvg3=getMove();
			//System.out.println(Thread.currentThread().getName()+":"+mvg3);
			if(mvg3==1)gears[2].setBajas(1);
			if(mvg3==2)gears[2].setMuertes(1);
			if(mvg3==3)gears[2].setAyudas(1);
			gears[0].calculoPuntaje();
			//System.out.println(gears[2].getBajas()+":"+gears[2].getMuertes()+":"+gears[2].getAyudas());
						
		}//
		
		}//for
	}///
	
	// Base:50 Baja(1):30  Muerte(2):-10 Ayuda(3):5  Nada(4,5,0)
	//El movimiento captura un aleatorio entre 0-5
	static int getMove(){
		return rnd.nextInt(6);
	}//getMove
	
	static void tablero() throws InterruptedException{
		for (int i = 0; i < 121; i++) {
		Thread.sleep(500);
		ordenarGear();
		System.out.println("\n\t\t---------------------------------------------");
		System.out.println("\t\t\tBajas\tMuertes\tAyudas");
		System.out.println("\t"+gears[0].getName().toUpperCase()+":\t\t"+gears[0].getBajas()+"\t"+gears[0].getMuertes()+"\t"+gears[0].getAyudas());
		System.out.println("\t"+gears[1].getName().toUpperCase()+":\t\t"+gears[1].getBajas()+"\t"+gears[1].getMuertes()+"\t"+gears[1].getAyudas());
		System.out.println("\t"+gears[2].getName().toUpperCase()+":\t\t"+gears[2].getBajas()+"\t"+gears[2].getMuertes()+"\t"+gears[2].getAyudas());
		
		}//for
		
		Thread.sleep(2000);
		System.out.print("\n\n\n\t\tCalculando puntaje ..");
		for (int i = 0; i < 15; i++) {
			Thread.sleep(250);
			System.out.print("...");
		}
		puntajeTotal();
		System.out.println("\n.");
		
	}//tablero
	
	static void puntajeTotal(){
		ordenarGear();
		System.out.println("\n\n \t\t\tBajas\tMuertes\tAyudas\t\tPuntaje Total");
		System.out.println("\t\t"+gears[0].getName().toUpperCase()+":\t"+gears[0].getBajas()+"\t"+gears[0].getMuertes()+"\t"+gears[0].getAyudas()+"\t\t"+gears[0].calculoPuntaje());
		System.out.println("\t\t"+gears[1].getName().toUpperCase()+":\t"+gears[1].getBajas()+"\t"+gears[1].getMuertes()+"\t"+gears[1].getAyudas()+"\t\t"+gears[1].calculoPuntaje());
		System.out.println("\t\t"+gears[2].getName().toUpperCase()+":\t"+gears[2].getBajas()+"\t"+gears[2].getMuertes()+"\t"+gears[2].getAyudas()+"\t\t"+gears[2].calculoPuntaje());
		System.out.println("\n\n \t\t\tGanador: ¡¡¡¡¡ "+gears[0].getName().toUpperCase()+" !!!!!");
	}//
	
	static void ordenarGear(){
		jugador aux;
	
		  for (int j = 0; j<gears.length-1; j++) {
		        
		      	for (int i = 0; i<gears.length-1; i++) {
		      				
		      		if(gears[i].calculoPuntaje()<gears[i+1].calculoPuntaje()){
		      	
		      		aux=gears[i];
		      		gears[i]=gears[i+1];
		      		gears[i+1]=aux;
		      	      	
		      		}// if	
		      	     	
		      	}// for
	}//for
	} //ordenar

}
