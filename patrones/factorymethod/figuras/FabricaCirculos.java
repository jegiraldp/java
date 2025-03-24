package factorymethod.figuras;

public class FabricaCirculos extends Fabrica{

    public iFigura crearFigura(){
        return new Circulo();
    }    
    
}
