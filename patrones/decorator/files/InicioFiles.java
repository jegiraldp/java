package decorator.files;

public class InicioFiles {
    public static void main(String[] args) {
    String texto="text to write";
    System.out.println("Text: "+texto);
    System.out.println("--- Normal ---");
    iDataSource normal = new FileDataSource("file.txt");
    normal.writeData(texto);
    System.out.println(normal.readData());
    
    System.out.println("--- Codificado ---");
    DataSourceDecorator codificado = new NoSpacesDecorator(
        new UpperDecorator(new FileDataSource("file.txt")));
    
            codificado.writeData(texto);
            System.out.println(codificado.readData());
    }
   
    
}
