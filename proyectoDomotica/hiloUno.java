
import java.net.*;

public class hiloUno extends Thread{
    
    public hiloUno(String n){
        setName(n);
    }
    
    public void run(){
        //inicioServidor.writeAreaReporte("Iniciando Hilo Sonido");
        
            try {
                sonido.iniciar();
                sonido.play();  
            } catch (MalformedURLException ex) {
                System.out.println("URL Error");
            } catch (InterruptedException ex) {
                System.out.println("Hilo Error");
            }
               
        
        
    }//run
    
}//class