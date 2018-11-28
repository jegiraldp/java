

package archivo7;
import java.io.*;

public class ArchivoApp7 {
    public static void main(String[] args) throws IOException {
// escribe los datos
        DataOutputStream salida=new DataOutputStream(new FileOutputStream("pedido.txt"));
        double[] precios={1350, 400, 890, 6200, 8730};
        int[] unidades={5, 7, 12, 8, 30};
        String[] descripciones={"paquetes de papel", "lápices", "bolígrafos", "carteras", "mesas"};

        for (int i=0; i<precios.length; i ++) {
            salida.writeChars(descripciones[i]);
            salida.writeChar('\n');
            salida.writeInt(unidades[i]);
            salida.writeChar('\t');
            salida.writeDouble(precios[i]);
        }
        salida.close();

//leer los datos del archivo
        DataInputStream entrada=new DataInputStream(new FileInputStream("pedido.txt"));
        double precio;
        int unidad;
        String descripcion;
        double total=0.0;

        try {
            //while(true){
            while ((descripcion=entrada.readLine())!=null) {
                //descripcion=entrada.readLine();
                unidad=entrada.readInt();
                entrada.readChar();       //lee el carácter tabulador
                precio=entrada.readDouble();
                System.out.println("has pedido "+unidad+" "+descripcion+" a "+precio+" pts.");
                total=total+unidad*precio;
            }
            System.out.println("Final del archivo");
        }catch (EOFException e) {
            System.out.println("Excepción cuando se alcanza el final del archivo");
        }
        System.out.println("por un TOTAL de: "+total+" pts.");
        entrada.close();

        try  {
//espera la pulsación de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {  }
    }

}
