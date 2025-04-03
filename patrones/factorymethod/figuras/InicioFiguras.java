package factorymethod.figuras;

public class InicioFiguras {

    public static void main(String[] args) {
        FabricaCirculos Fcirculos = new FabricaCirculos();
        Circulo cir = (Circulo) Fcirculos.crearFigura();
        cir.pintar();

        FabricaCuadrados Fcuadrados = new FabricaCuadrados();
        Cuadrado cua = (Cuadrado) Fcuadrados.crearFigura();
        cua.pintar();
    }
    
}
