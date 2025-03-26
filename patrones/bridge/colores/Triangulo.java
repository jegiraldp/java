package bridge.colores;

public class Triangulo extends Figura{

    public Triangulo(iColor color, int code, String name) {
            super(color, code, name);
  
        }

        @Override
        public void pintandoFigura() {
            super.getColor().pintar();
            
        }
    
}
