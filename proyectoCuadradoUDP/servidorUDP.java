import java.net.*;
import java.io.*;

public class servidorUDP{
    static DatagramPacket packet, packetEnviar;
    static DatagramSocket s;
    static byte[] msg, msgEnviar;
    static int tam, cua;
    static String dato, datoEnviar;

public static void iniciar() throws IOException {
    s = new DatagramSocket(12345);
    msg=new byte[1024];
    packet = new DatagramPacket(msg,1024);
    System.out.println("Ok");
       
    while(true){
    recibirDatagramas();
    }
}//iniciar



public static void recibirDatagramas() throws IOException{
        s.receive(packet);
        tam=packet.getLength();
        dato = new String(packet.getData());
        dato=limpiar(dato,tam);
        System.out.println("S:Recibo -> "+dato);
        cua = Integer.parseInt(dato);
        cua=cua*cua;
        enviar(String.valueOf(cua));
        
        ////
}//recibir

public static void enviar(String datoEnviar) throws SocketException, IOException{
///Enviar
       
        msgEnviar=new byte[datoEnviar.length()];
        msgEnviar=datoEnviar.getBytes();
        packetEnviar = new DatagramPacket(msgEnviar, msgEnviar.length,new InetSocketAddress(packet.getAddress(), 12346));
        s.send(packetEnviar);
}///

public static String limpiar(String dato, int tam){
    dato= dato.substring(0,tam);
    dato=dato.trim();
    return dato;
}//limpiar

}//clase