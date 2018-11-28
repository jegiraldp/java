package pqtCelular;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class hiloCelular extends Thread{
    
    private String estado;
    private int numero;
    private int saldo;
    private int lap;
    private String evento;
    static Random rnd;
    
    

    public hiloCelular(String nombre, int numero, 
            int saldo, int lap, String estado, String evento) {
        rnd= new Random();
        this.numero=numero;
        this.saldo=saldo;
        this.lap=lap;
        this.estado=estado;
        this.evento=evento;
        setName(nombre);
        start();
    }//constructor
    
    public void run(){
        
        for (int i = 0; i < 60; i++) {
            
            
            if(rnd.nextInt(20)==2 || rnd.nextInt(20)==10){
            
                try {
                    simulacion.llamar(rnd.nextInt(20), this);
                } catch (InterruptedException ex) {
                    Logger.getLogger(hiloCelular.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            }//if
                       
            try {
                sleep(this.lap);
            } catch (InterruptedException ex) {
                Logger.getLogger(hiloCelular.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        }//for
    
   // }//if
        
        
    }//run

    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado=estado;
    }

    public int getNumero() {
        return numero;
    }

    public int getSaldo() {
        return saldo;
    }
    
    public void setSaldo(int saldo) {
        this.saldo=saldo;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }
    
    
}//thread
