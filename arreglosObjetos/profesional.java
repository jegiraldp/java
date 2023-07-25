public class profesional extends persona{
    private int codigoEmpleado;
    public int extension;

    public profesional(int cedula, String nombreCompleto, long telefonoContacto, int extension) {
        super(cedula, nombreCompleto, telefonoContacto);
        this.extension=extension;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }
}
