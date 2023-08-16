import java.io.*;

public class leertxt {

    public static void main(String[] args) {
        String nombreArchivo = "archivo.txt";

        try {
            FileReader fileReader = new FileReader(nombreArchivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linea;
            String[] n = new String[10];
            linea = bufferedReader.readLine();
            String[] plantas = linea.split(";");
            String[] planta=null;
            for (int i = 0; i <plantas.length ; i++) {
                planta=plantas[i].split(",");
                System.out.println(planta[1]);
                //planta p = new planta(planta[0],planta[1])
                //lista.add(p)
            }


            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error tipo IO");
        }
    }
}

