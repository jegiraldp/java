public class vehiculo {
    protected String placa;
    public String marca;
    public String modelo;
    public propietario propietario;

    public vehiculo(String placa, String marca, String modelo, propietario propietario) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.propietario = propietario;
    }
}
