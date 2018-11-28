

package ventana;

public class VentanaTitulo extends Ventana{
    protected String titulo;
    public VentanaTitulo(int x, int y, int w, int h, String nombre) {
        super(x, y, w, h);
        titulo=nombre;
    }
    public void mostrar(){
        System.out.println("titulo     : "+titulo);
        super.mostrar();
    }
    public void desplazar(int dx, int dy){
        x+=dx;
        y+=dy;
    }
}