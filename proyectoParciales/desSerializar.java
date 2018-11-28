
import java.io.*;

public class desSerializar {
    
    public static void main(String[] a) throws FileNotFoundException, IOException, ClassNotFoundException{
    
        FileInputStream fis = new FileInputStream("estudiantes.out");
        ObjectInputStream ois = new ObjectInputStream(fis);
        listaEstudiantes lista = (listaEstudiantes) ois.readObject();
        System.out.println(lista.printList());
        
    }
}
