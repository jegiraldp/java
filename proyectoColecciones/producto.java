public class producto {
    private int codigo;
    public String nombre;
    public categoria categoria;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public producto(int codigo, String nombre, categoria categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
    }
}
