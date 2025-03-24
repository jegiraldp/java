public class FabricaGatos extends Fabrica{

    public iFelino crearFelino(){
        return new Gato();
    }

}