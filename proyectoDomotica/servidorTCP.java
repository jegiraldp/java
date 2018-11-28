
import java.net.*;
import java.io.*;

public class servidorTCP {
static ServerSocket ss;
static hiloUno hSonido;
static hiloConsumoLuz hLuz;

public static void iniciar() throws IOException, InterruptedException{
    casa.iniciarDatos();
    inicioServidor.writeAreaReporte("Servidor-> Casas generadas...");
    Thread.sleep(2000);
    ss = new ServerSocket(12345,30000);
     escuchar();
}//iniciar

public static void escuchar() throws IOException{
    Socket s;
    while(true){
        inicioServidor.writeAreaReporte("Servidor Iniciado...");
        s=ss.accept();
        new hiloSocket(s).start();
    }//while    
   }//inicio
   

        
  
}//clase