public class nacional extends producto{
    private int codigoDIAN;


    public nacional(int codigo, int valor, String nombre, int codigoDIAN) {
        super(codigo, valor, nombre);
        this.codigoDIAN = codigoDIAN;
        System.out.println("hola desde constructor de nacional");
    }
}
