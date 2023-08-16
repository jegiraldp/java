import java.io.*;

public class escribirtxt {

    public static void main(String[] args) {
        String nombreArchivo = "archivo.txt";

        try {
            //PrintWriter pw = new PrintWriter("archivo.txt","UTF-8");

            FileWriter fileWriter = new FileWriter(nombreArchivo, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("43,jorge,9;");
            bufferedWriter.newLine();

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

