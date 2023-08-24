public class contacto {

    private String codigo;
    public String telefono;
    public String nombre;

    public contacto(String codigo, String telefono, String nombre) {
        this.codigo = codigo;
        this.telefono = telefono;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }
}
