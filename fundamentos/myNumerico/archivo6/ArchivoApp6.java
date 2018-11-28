

package archivo6;

import java.io.*;

public class ArchivoApp6{
    public static void main(String[] args) {
        Cliente cliente=new Cliente("Angel", "xyz");

        try{
            ObjectOutputStream salida=new ObjectOutputStream(new FileOutputStream("cliente.obj"));
            salida.writeObject("Datos del cliente\n");
            salida.writeObject(cliente);
            salida.close();

            ObjectInputStream entrada=new ObjectInputStream(new FileInputStream("cliente.obj"));
            String str=(String)entrada.readObject();
            Cliente obj1=(Cliente)entrada.readObject();
            System.out.println("------------------------------");
            System.out.println(str+obj1);
            System.out.println("------------------------------");
            entrada.close();
//se puede fundir en una catch Exception
        }catch (IOException ex) {
            System.out.println(ex);
         }catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }

       try  {
//espera la pulsación de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {  }
   }
}

