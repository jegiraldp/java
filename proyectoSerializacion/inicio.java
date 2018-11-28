

package pqt;

import java.io.*;

public class inicio {
    
    static persona p1;
    
    public static void main(String[] arg) throws FileNotFoundException, IOException, ClassNotFoundException{
    persona p = new persona(123, "jorge");
    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("persona.ser"));
    out.writeObject(p);
    out.close();
    
    
    //////
    FileInputStream fis = new FileInputStream("persona.ser");
    ObjectInputStream ois = new ObjectInputStream(fis);
    p1 = (persona) ois.readObject();//El método readObject() recupera el objeto
    ois.close();
    
    System.out.print(p1.getCedula()+":"+p1.getNombre());
    
    }
    
}
