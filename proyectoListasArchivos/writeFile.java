import java.io.*;

public class writeFile {
    static public void escribir(String texto, String archivo) throws IOException{
        FileWriter fileWriter = new FileWriter(archivo);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(texto);
        bufferedWriter.close();

    }
}
