public class propietario extends persona{
    public String correoElectronico;

    public propietario(int cedula, String nombreCompleto, long telefonoContacto,
                       String correoElectronico) {
        super(cedula, nombreCompleto, telefonoContacto);
        this.correoElectronico=correoElectronico;
    }
}
