package bridge.colores;

public class Circulo extends Figura{

    public Circulo(iColor color, int code, String name) {
            super(color, code, name);
            
    }

    @Override
    public void pintandoFigura() {
        super.getColor().pintar();
        
    }
}
    
   
