import java.net.*;
import java.io.*;

public class servidorUDP{
    static DatagramPacket packet, packetEnviar;
    static DatagramSocket s;
    static byte[] msg, msgEnviar;
    static int tam, cua;
    static String dato, datoEnviar;

public static void iniciar() throws IOException, FileNotFoundException, ClassNotFoundException {
    s = new DatagramSocket(12345);
    msg=new byte[1024];
    packet = new DatagramPacket(msg,1024);
    System.out.println("Ok");
    
    //
    serializa.accion();
    System.out.println("Serialización OK");
       
    while(true){
    recibirDatagramas();
    }
}//iniciar



public static void recibirDatagramas() throws IOException, FileNotFoundException, ClassNotFoundException{
        s.receive(packet);
        tam=packet.getLength();
        dato = new String(packet.getData());
        dato=limpiar(dato,tam);
        System.out.println("S:Recibo -> "+dato);
        if(dato.equals("serializa")){
            System.out.println("object");
            msgEnviar=serializa.accion();
            enviar();
        }
        
        
        
        
        ////
}//recibir

public static void enviar() throws SocketException, IOException{
///Enviar
        packetEnviar = new DatagramPacket(msgEnviar, msgEnviar.length,new InetSocketAddress(packet.getAddress(), 12346));
        s.send(packetEnviar);
}///

public static String limpiar(String dato, int tam){
    dato= dato.substring(0,tam);
    dato=dato.trim();
    return dato;
}//limpiar

}//clase