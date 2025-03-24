package factorymethod.figuras;

public class Circulo implements iFigura{

    @Override
    public void pintar() {
       System.out.println("Pintando un circulo");
    }
}
