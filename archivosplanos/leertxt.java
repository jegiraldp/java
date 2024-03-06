import java.io.*;

public class leertxt {

    public static void main(String[] args) {
        String nombreArchivo = "archivo.txt";

        try {
            FileReader fileReader = new FileReader(nombreArchivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linea;

            linea = bufferedReader.readLine();

            System.out.println(linea);


            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error tipo IO");
        }
    }
}