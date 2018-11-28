import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class clienteTCP {
	
	static Socket s;
	
        public static boolean conectar(){
            boolean confirm=false;
            try {
                s = new Socket("127.0.0.1",12345); //se crea con: la IP y el puerto
                confirm=true;
                System.out.println("Conectado a: "+s.getInetAddress());
            
            } catch (IOException ex) {
                System.out.println("No hay conexión");
            }
          return confirm;
        }        
        public static void enviar(String dato) throws IOException{
        DataOutputStream salida = new DataOutputStream(s.getOutputStream());
        salida.writeUTF(dato);
        }//enviar
        public static void cerrar() throws IOException{
        s.close();        
        }//cerrar
        
 }//clase
  
  

