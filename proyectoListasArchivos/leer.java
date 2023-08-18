import java.io.*;

public class leer {


    public static String readFile() throws IOException {

           FileReader fr = new FileReader("productos.txt");
           BufferedReader br = new BufferedReader(fr);
           String linea = br.readLine();
            return linea;

    }


}
