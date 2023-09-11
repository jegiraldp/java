public class contacto {

    private String documento;
    public String telefono;
    public String nombre;
    public String foto;

    public contacto(String codigo,  String nombre, String telefono, String foto) {
        this.documento = codigo;
        this.telefono = telefono;
        this.nombre = nombre;
        this.foto=foto;
    }

    public String getDocumento() {
        return documento;
    }
}
