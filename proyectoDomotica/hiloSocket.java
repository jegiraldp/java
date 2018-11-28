
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;



public class hiloSocket extends Thread{
    hiloUno hSonido;
    hiloConsumoLuz hLuz;
    Socket sHilo;
    
    public void run(){
        try {
            inicioServidor.writeAreaReporte("Servidor-> Cliente conectado - "+sHilo.getInetAddress());
            recibir(sHilo);
        } catch (IOException ex) {}
    }
    
    public hiloSocket(Socket s){
        sHilo=s;
    }
    
    public void recibir(Socket s) throws IOException{
        
    String cadena;
    String[] datos;
    try{
    DataInputStream entrada = new DataInputStream(s.getInputStream());
    while(true){
    cadena = entrada.readUTF();
    datos=cadena.split(",");
    
    if(datos[0].equals("sonido_on")){
        hSonido = new hiloUno("1");
        hSonido.start();
    }
    if(datos[0].equals("sonido_off")){
        hSonido.stop();
    }
    
    if(datos[0].equals("luz_on")){
        hLuz= new hiloConsumoLuz(datos[1]);
        hLuz.start();
    }
    
    if(datos[0].equals("luz_off")){
        hLuz.stop();
    }
    
    }//while
    }catch(Exception ioe){
        inicioServidor.writeAreaReporte("Servidor-> Cliente desconectado");
        this.stop();
    }
  
}//recibir
    
}//class
