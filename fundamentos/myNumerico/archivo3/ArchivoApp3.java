

package archivo3;

import java.io.*;

public class ArchivoApp3 {
    public static void main(String[] args) {
        FileReader entrada=null;
        FileWriter salida=null;
        //FileInputStream entrada=null;
        //FileOutputStream salida=null;

        try  {
            entrada=new FileReader("ArchivoApp3.java");
            salida=new FileWriter("copia.java");
            //entrada=new FileInputStream("ArchivoApp3.java");
            //salida=new FileOutputStream("copia.java");
            int c;
            while((c=entrada.read())!=-1){
                salida.write(c);
            }
       }catch (IOException ex) {
            System.out.println(ex);
       }finally{
//cerrar los flujos de datos
            if(entrada!=null){
                try{
                    entrada.close();
                }catch(IOException ex){}
            }
            if(salida!=null){
                try{
                    salida.close();
                }catch(IOException ex){}
            }
            System.out.println("el bloque finally siempre se ejecuta");
       }

       try  {
//espera la pulsación de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {
        }
    }
}

