
import java.io.*;

public class inicioCliente {
      
    public static void main(String[] arg) throws IOException{
        String dat;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean rta=clienteTCP.conectar();
        
        if(rta){
            while(true){
            System.out.print("\nCliente-> ");
            dat = br.readLine();
            if(dat.equals("salir")){
                clienteTCP.cerrar();
                break;
            }else{
                clienteTCP.enviar(dat);        
            }
            
            }//while
            
        }// if rta
          
          System.out.println("Cliente cerrado");
             
    }//main
    
    
}
