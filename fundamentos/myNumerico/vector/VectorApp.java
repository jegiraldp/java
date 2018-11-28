package vector;

import java.util.*;

public class VectorApp {
   public static void main(String[] args) {
        Vector v=new Vector();
        v.addElement("uno");
        v.addElement("dos");
        v.addElement("cuatro");
        v.addElement("cinco");
        v.addElement("seis");
        v.addElement("siete");
        v.addElement("ocho");
        v.addElement("nueve");
        v.addElement("diez");
        v.addElement("once");
        v.addElement("doce");
        v.insertElementAt("tres", 2);
        System.out.println("nº de elementos "+v.size());
        System.out.println("dimensión "+v.capacity());

        Enumeration enum=v.elements();
        while(enum.hasMoreElements()){
            System.out.print(enum.nextElement()+"\t");
        }
        System.out.println();
        if(v.contains("tres")){
            System.out.println("Encontrado tres");
        }
        v.removeElement("tres");
        for(int i=0; i<v.size(); i++){
            System.out.print(v.elementAt(i)+"\t");
        }
        System.out.println();

        try  {
//espera la pulsación de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {  }
     }
}

 