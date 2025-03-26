package bridge.colores;

public abstract class Figura {
    private iColor color;
    private int code;
    private String nombre;

    public Figura(iColor color, int code, String n) {
        this.color = color;
        this.code = code;
        this.nombre=n;
    }

    


    public abstract String pintandoFigura();
  

    public iColor getColor() {
        return color;
    }

    public int getCode() {
        return code;
    }




    public String getNombre() {
        return nombre;
    }

    
}
