package pqtCelular;

import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class hiloEcabezado extends Thread{
 
    static Calendar c;
    
    public hiloEcabezado(String n){
        setName(n);
        start();
    
    }
    
    public void run(){
        String h;
        
        for (int i = 0; i < 3600; i++) {
               
        c = Calendar.getInstance();
            
        
        h="-"+String.valueOf(c.get(Calendar.HOUR_OF_DAY));
        h+=":"+String.valueOf(c.get(Calendar.MINUTE));
        h+=":"+String.valueOf(c.get(Calendar.SECOND));
        
        
        inicio.writeArea(h);
            try {    
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(hiloEcabezado.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }               
    }//main
}//hilo