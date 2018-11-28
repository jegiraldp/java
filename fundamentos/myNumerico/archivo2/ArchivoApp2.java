package archivo2;

import java.io.*;

public class ArchivoApp2 {
    public static void main(String[] args) {
        FileReader entrada=null;
         StringBuffer str=new StringBuffer();
         try  {
            entrada=new FileReader("ArchivoApp2.java");
            int c;
            while((c=entrada.read())!=-1){
                str.append((char)c);
            }
            System.out.println(str);
            System.out.println("--------------------------------------");
       }catch (IOException ex) {
            System.out.println(ex);
       }finally{
//cerrar los flujos de datos
            if(entrada!=null){
                try{
                    entrada.close();
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

