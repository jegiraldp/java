public class importado extends producto{
    private int codigoImportacion;

    public importado(int codigo, int valor, String nombre, int codigoImportacion) {
        super(codigo, valor, nombre);
        this.codigoImportacion = codigoImportacion;
        System.out.println("hola desde constructor de importado");
    }
}
