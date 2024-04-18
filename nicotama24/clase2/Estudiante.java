public class Estudiante extends Persona{

    private int carnet;

    public Estudiante(int codigo, String nombreCompleto, int carnet) {
        super(codigo, nombreCompleto);
        this.carnet = carnet;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }
}
