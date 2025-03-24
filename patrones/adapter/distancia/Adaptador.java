package adapter.distancia;

public class Adaptador implements Itarget{
    private SistemaMillas sMiles;
    

    public Adaptador(SistemaMillas sMiles) {
        this.sMiles = sMiles;
    }

    @Override
    public double getDistanciaKilometros() {
       return convertirMillasKilometros(sMiles.getDistanciaMillas());
    }

    private double convertirMillasKilometros(double millas){
        return millas*1.60934;
    }
    
}
