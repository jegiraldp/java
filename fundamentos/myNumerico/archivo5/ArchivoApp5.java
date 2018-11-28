package archivo5;

import java.io.*;

public class ArchivoApp5 {
    public static void main(String[] args) {
        Rectangulo rect=new Rectangulo(new Punto(10,10), 30, 60);

        try  {
            ObjectOutputStream salida=new ObjectOutputStream(new FileOutputStream("figura.obj"));
            salida.writeObject("guardar un objeto compuesto\n");
            salida.writeObject(rect);
            salida.close();

            ObjectInputStream entrada=new ObjectInputStream(new FileInputStream("figura.obj"));
            String str=(String)entrada.readObject();
            Rectangulo obj1=(Rectangulo)entrada.readObject();
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

