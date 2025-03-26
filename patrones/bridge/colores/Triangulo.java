package bridge.colores;

public class Triangulo extends Figura{

    public Triangulo(iColor color, int code, String name) {
            super(color, code, name);
  
        }

        @Override
        public String pintandoFigura() {
            String retorno="";
            retorno +=super.getColor().pintar();
            return retorno;
        }
    
}
