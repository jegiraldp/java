
import java.util.logging.Level;
import java.util.logging.Logger;





public class grua extends Thread{
    
    public String id;
    private camion[] camiones;
    private int bnd;
    
    public void cargar() throws InterruptedException {
        
        for (int i = 0; i < camiones.length; i++) {
             System.out.println(this.id+"-cargado-"+camiones[i].id+":("+camiones[i].tDescarga+")");
             Thread.sleep(camiones[i].tDescarga*1000);
            
        }
       
    }//cargar

    public grua(String id, camion[] c) {
        this.id = id;
        this.camiones=c;        
    }

   
    
    public void run(){
        try {
            cargar();
        } catch (InterruptedException ex) {
            Logger.getLogger(grua.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}//
