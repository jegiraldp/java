public class InicioFelinos {

   public static void main(String[] args) {
    
    Fabrica laFabricaGatos = new FabricaGatos();
    Fabrica laFabricaLeones = new FabricaLeones();

    Gato g = (Gato) laFabricaGatos.crearFelino();
    g.comer();

    Leon l = (Leon) laFabricaLeones.crearFelino();
    l.comer();

   }
    
}
