public class atencion {
    private int codigo;
    public vehiculo vehiculo;
    public profesional profesional;
    public servicio servicio;

    public atencion(int codigo, servicio servicio, vehiculo vehiculo, profesional profesional) {
        this.codigo = codigo;
        this.vehiculo = vehiculo;
        this.servicio = servicio;
        this.profesional = profesional;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
