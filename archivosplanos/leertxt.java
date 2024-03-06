import java.io.*;

public class leertxt {

    public static void main(String[] args) {
        String nombreArchivo = "C:\\Users\\jorge\\Documents\\cienciaDatos\\archivo.txt";

        try {
            FileReader fileReader = new FileReader(nombreArchivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linea = bufferedReader.readLine();
            while(linea!=null) {
                System.out.println(linea);
                linea = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error en lectura");
        }
    }
}