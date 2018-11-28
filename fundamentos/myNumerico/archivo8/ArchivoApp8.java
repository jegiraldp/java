
package archivo8;
import java.io.*;

public class ArchivoApp8 {

    public static void main(String[] args) {
        Figura fig1=new Rectangulo(10,15, 30, 60);
        Figura fig2=new Circulo(12,19, 60);

        try  {
            ObjectOutputStream salida=new ObjectOutputStream(new FileOutputStream("figura.obj"));
            salida.writeObject("guardar un objeto de una clase derivada\n");
            salida.writeObject(fig1);
            salida.writeObject(fig2);
            salida.close();

            ObjectInputStream entrada=new ObjectInputStream(new FileInputStream("figura.obj"));
            String str=(String)entrada.readObject();
            Figura obj1=(Figura)entrada.readObject();
            Figura obj2=(Figura)entrada.readObject();
            System.out.println("------------------------------");
            System.out.println(obj1.getClass().getName()+" origen ("+obj1.x+", "+obj1.y+")"+" area="+obj1.area());
            System.out.println(obj2.getClass().getName()+" origen ("+obj2.x+", "+obj2.y+")"+" area="+obj2.area());
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

