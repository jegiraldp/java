

package ventana;

public class Ventana {
    protected int x;
    protected int y;
    protected int ancho;
    protected int alto;
    public Ventana(int x, int y, int ancho, int alto) {
        this.x=x;
        this.y=y;
        this.ancho=ancho;
        this.alto=alto;
    }
    public void mostrar(){
        System.out.println("posición    : x="+x+", y="+y);
        System.out.println("dimensiones : w="+ancho+", h="+alto);
    }
    public void cambiarDimensiones(int dw, int dh){
        ancho+=dw;
        alto+=dh;
    }
}
