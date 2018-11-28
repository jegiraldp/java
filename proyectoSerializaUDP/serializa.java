import java.io.*;

public class serializa {
    
    public static byte[] accion() throws FileNotFoundException, IOException, ClassNotFoundException{
    
        persona p = new persona(123, "jorge");
   
   
     ByteArrayOutputStream baos = new ByteArrayOutputStream();
    ObjectOutputStream oos = new ObjectOutputStream(baos);
    oos.writeObject(p);
    oos.flush();
    byte[] arr= baos.toByteArray();
    return arr;
       
    }//cargar
    
}
