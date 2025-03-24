package adapter.distancia;

public class Iniciodistancia {

    public static void main(String[] args) {
        SistemaMillas sMiles = new SistemaMillas();
        Itarget adaptador = new Adaptador(sMiles);

        System.out.println("Millas: "+sMiles.getDistanciaMillas());
        System.out.println("Kilometros: "+adaptador.getDistanciaKilometros());

    }
    
}
