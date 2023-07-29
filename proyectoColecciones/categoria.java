public class categoria {
    private int codigo;
    public String nombre;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public categoria(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
}
