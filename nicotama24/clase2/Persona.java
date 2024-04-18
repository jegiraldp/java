public class Persona {
    private int codigo;
    public String nombreCompleto;

    public Persona(int codigo, String nombreCompleto) {
        this.codigo = codigo;
        this.nombreCompleto = nombreCompleto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
