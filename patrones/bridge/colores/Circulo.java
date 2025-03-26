package bridge.colores;

public class Circulo extends Figura{

    public Circulo(iColor color, int code, String name) {
            super(color, code, name);
            
    }

    @Override
    public String pintandoFigura() {
        String retorno="";
        retorno +=super.getColor().pintar();
        return retorno;
    }
}
    
   
