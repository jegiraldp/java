public class Nacional extends Producto{
    public String registroDIAN;
    public Nacional(String nombre, int codigo, String registroDIAN) {
        super(nombre, codigo);
        this.registroDIAN=registroDIAN;
    }
}
