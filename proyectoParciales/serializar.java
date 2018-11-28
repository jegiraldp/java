
import java.io.*;


public class serializar {
    
    public static void iniciar() throws IOException{
        
    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("estudiantes.out"));
    out.writeObject(test.listaEs);
    out.close();
        
        
    
    }
}