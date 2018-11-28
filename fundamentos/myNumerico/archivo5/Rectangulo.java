

package archivo5;

public class Rectangulo implements java.io.Serializable{
    private int ancho ;
    private int alto ;
    private Punto origen;

    public Rectangulo() {
	    origen = new Punto(0, 0);
	    ancho=0;
	    alto=0;
    }
    public Rectangulo(Punto p) {
	    this(p, 0, 0);
    }
    public Rectangulo(int w, int h) {
	    this(new Punto(0, 0), w, h);
    }
    public Rectangulo(Punto p, int w, int h) {
	    origen = p;
	    ancho = w;
	    alto = h;
    }
    public void desplazar(int dx, int dy) {
	    origen.desplazar(dx, dy);
    }
    public int calcularArea() {
	    return ancho * alto;
    }
    public String toString(){
        String texto=origen+" w:"+ancho+" h:"+alto;
        return texto;
    }
}

