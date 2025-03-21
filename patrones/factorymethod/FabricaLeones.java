public class FabricaLeones extends Fabrica{

    public iFelino crearFelino(){
        return new Leon();
    }    

}
