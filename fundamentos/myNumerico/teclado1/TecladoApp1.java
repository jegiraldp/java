

package teclado1;
import java.io.*;

public class TecladoApp1 {
  public static void main(String[] args) {
    char[] buffer=new char[255];
    System.out.println("Introduce una línea de texto y pulsa RETORNO ");
    try{
        Reader entrada=new InputStreamReader(System.in);
        int numBytes=entrada.read(buffer);
        System.out.println("Número de bytes leídos "+numBytes);
    }catch(IOException ex){
        System.out.println("Error entrada/salida");
    }
    System.out.println("La línea de texto que has escrito es ");
    String str=new String(buffer);
    System.out.println(str);

    try  {
//espera la pulsación de una tecla y luego RETORNO
        System.in.read();
    }catch (Exception e) {  }
  }
}
