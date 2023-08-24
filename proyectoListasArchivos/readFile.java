import java.io.*;

public class readFile {

    static public String leer(String archivo) throws IOException {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea=br.readLine();
            return linea;
    }
}
