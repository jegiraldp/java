
import java.util.logging.Level;
import java.util.logging.Logger;

public class hiloConsumoLuz extends Thread{
    int indice;
    
    public hiloConsumoLuz(String indice){
        this.indice=Integer.parseInt(indice);
    }
    
    public void run(){
        int consumo=casa.getCasas()[this.indice].getConsumoLuz();
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(hiloConsumoLuz.class.getName()).log(Level.SEVERE, null, ex);
            }
            consumo++;
            casa.getCasas()[this.indice].setConsumoLuz(consumo);
        }
    
    }//run
    
}
