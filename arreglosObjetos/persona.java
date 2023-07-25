public class persona {
    protected int cedula;
    public String nombreCompleto;
    public long telefonoContacto;

    public persona(int cedula, String nombreCompleto, long telefonoContacto) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.telefonoContacto = telefonoContacto;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
}
