
import java.util.logging.Level;
import java.util.logging.Logger;


public class hiloReporte extends Thread{
    static casa[] lasC;
    static String report;
    public void run(){
                
        while(true){
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(hiloReporte.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            lasC = casa.getCasas();
            report="";
            for (int ii = 0; ii < lasC.length; ii++) {
                report+="Luz("+lasC[ii].getCod()+"):"+lasC[ii].getConsumoLuz()+"\n";
            }
            inicioServidor.writeAreaReporte(report);
            
        }          
       }//run
    
}//
