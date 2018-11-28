

import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class hilo extends Thread{
	
	public hilo(String name){
		setName(name);
		start();
		
	}//hilo
	
	public void run(){
				
		if(getName().equals("h1")){
			try {
				metodoUno();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(getName().equals("h2")){
			try {
				metodoDos();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(getName().equals("h3")){
			try {
				metodoTres();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(getName().equals("board")){
			try {
				tablero();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(getName().equals("sound")){
			
                    try {
                        audio.iniciar();
                    } catch (MalformedURLException ex) {
                        Logger.getLogger(hilo.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(hilo.class.getName()).log(Level.SEVERE, null, ex);
                    }
				
			
		}
		
	}//run

	public static void metodoUno() throws InterruptedException{
		inicio.c1=0;
		inicio.c1t=0;
		for (int i = 0; i < 120; i++) {
			Thread.sleep(500);
			inicio.c1=inicio.r.nextInt(3);
			inicio.c1t+=inicio.c1;
		}
		
	}//m1
	
	public static void metodoDos() throws InterruptedException{
		inicio.c2=0;
		inicio.c2t=0;
		for (int i = 0; i < 120; i++) {
			Thread.sleep(500);
			inicio.c2=inicio.r.nextInt(3);
			inicio.c2t+=inicio.c2;
		}
		
	}//m2
	
	public static void metodoTres() throws InterruptedException{
		inicio.c3=0;
		inicio.c3t=0;
		for (int i = 0; i < 120; i++) {
			Thread.sleep(500);
			inicio.c3=inicio.r.nextInt(3);
			inicio.c3t+=inicio.c3;
		}
		
	}//m3
	
	public static void tablero() throws InterruptedException{
		String c11="";
		String c22="";
		String c33="";
		for (int i = 0; i < 121; i++) {
			Thread.sleep(500);
			System.out.println("\n");
			for (int j = 0; j < inicio.c1; j++) {
				c11+=".";
			}
			for (int j = 0; j < inicio.c2; j++) {
				c22+=".";
			}
			for (int j = 0; j < inicio.c3; j++) {
				c33+=".";
			}
			System.out.println("h1:"+c11);
			System.out.println("h2:"+c22);
			System.out.println("h3:"+c33);
					
		}
		
		
	}//tablero

}//
