import java.io.*;

public class escribir {

    public static void writeFile(String linea) {
        try {
            FileWriter fileWriter = new FileWriter("productos.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(linea);


            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
