package factorymethod.figuras;

public class FabricaCuadrados {
    public iFigura crearFigura(){
        return new Cuadrado();
    }    
    
}
