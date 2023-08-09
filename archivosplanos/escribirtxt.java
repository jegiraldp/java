import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class escribirtxt {

    public static void main(String[] args) {
        String nombreArchivo = "archivo.txt";

        try {
            FileWriter fileWriter = new FileWriter(nombreArchivo, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("hola escribo");
            bufferedWriter.newLine();

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

