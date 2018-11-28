package pqtCelular;

public class simulacion {
    
       
    
    public static void llamar(int duracion, hiloCelular h) throws InterruptedException{
        for (int i = duracion; i > 0; i--) {
            Thread.sleep(1000);
            h.setEvento("Llamando "+i+"s");
            h.setEstado("Ocupado");
        }
        h.setEstado("libre");
        h.setEvento("Trabajando");
        h.setSaldo(h.getSaldo()- duracion*10);
        Thread.sleep(1000);
        
       
            
        }//
        
       
    
        
    
    }//
    
