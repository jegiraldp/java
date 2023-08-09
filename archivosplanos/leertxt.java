import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class leertxt {

    public static void main(String[] args) {
        String nombreArchivo = "archivo.txt";

        try {
            FileReader fileReader = new FileReader(nombreArchivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

