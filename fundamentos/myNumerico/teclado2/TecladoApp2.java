

package teclado2;
import java.io.*;

public class TecladoApp2 {
  public static void main(String[] args) {
    StringBuffer str=new StringBuffer();
    char c;
    try{
        Reader entrada=new InputStreamReader(System.in);
//        while ((c=(char)System.in.read())!='\n'){
        while ((c=(char)entrada.read())!='\n'){
            str.append(c);
        }
    }catch(IOException ex){}
    System.out.println(str);

    try  {
//espera la pulsación de una tecla y luego RETORNO
        System.in.read();
    }catch (Exception e) {  }
  }
}
