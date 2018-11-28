package pqtGear;

import java.net.MalformedURLException;



public class jugador extends Thread{
	
	private int muertes;
	private int bajas;
	private int ayudas;
	private int puntaje;
	
	public jugador(String iden, int muertes, int bajas, int ayudas, int puntaje) {
		this.muertes = muertes;
		this.bajas = bajas;
		this.puntaje=puntaje;
		this.ayudas=ayudas;
		setName(iden);
		start();
		
	}//
	
	public jugador(String iden) {
		setName(iden);
		start();
		
	}//
	
	public void run(){
		if(getName().equals("gear-1")){
			try {
			inicio.jugar();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(getName().equals("gear-2")){
			
			
			try {
			inicio.jugar();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(getName().equals("gear-3")){
			
			
			try {
			inicio.jugar();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/////
		if(getName().equals("board")){
			try {
			inicio.tablero();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(getName().equals("sonido")){
			try {
			audioGear.play();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
	}//run

	
	public int getMuertes() {
		return muertes;
	}

	public void setMuertes(int muertes) {
		this.muertes += muertes;
	}

	public int getBajas() {
		return bajas;
	}

	public void setBajas(int bajas) {
		this.bajas += bajas;
	}
	
	public int getAyudas() {
		return ayudas;
	}

	public void setAyudas(int ayudas) {
		this.ayudas += ayudas;
	}
	
	public int calculoPuntaje(){
		int t= this.bajas*30-this.muertes*10+this.muertes*5;
		return t;
	}
	

}
