

package archivo1;
import java.io.*;

public class ArchivoApp1 {
  public static void main(String[] args) {
    File fichero=new File("ArchivoApp1.java");
    if(fichero.exists()){
        System.out.println("Nombre del archivo "+fichero.getName());
        System.out.println("Camino             "+fichero.getPath());
        System.out.println("Camino absoluto    "+fichero.getAbsolutePath());
        System.out.println("Se puede escribir  "+fichero.canRead());
        System.out.println("Se puede leer      "+fichero.canWrite());
        System.out.println("Tamaño             "+fichero.length());
//para calcular el tamaño del archivo en KB se divide entre 1024
        System.out.println(" ******* lista de los archivos de este directorio *******");
        fichero=new File(".");
        String[] listaArchivos=fichero.list();
        for(int i=0; i<listaArchivos.length; i++){
            System.out.println(listaArchivos[i]);
        }
        System.out.println(" ******* lista de los archivos con filtro *******");
        listaArchivos=fichero.list(new Filtro(".java"));
        for(int i=0; i<listaArchivos.length; i++){
            System.out.println(listaArchivos[i]);
        }

    }
    try  {
//espera la pulsación de una tecla y luego RETORNO
        System.in.read();
    }catch (Exception e) {  }
  }
}


