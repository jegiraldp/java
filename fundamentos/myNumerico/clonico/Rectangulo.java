

package clonico;

public class Rectangulo implements Cloneable{
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
    public Object clone(){
        Rectangulo obj=null;
        try{
            obj=(Rectangulo)super.clone();
        }catch(CloneNotSupportedException ex){
            System.out.println(" no se puede duplicar");
        }
        obj.origen=(Punto)obj.origen.clone();
        return obj;
    }
    public void mover(int dx, int dy) {
	    origen.trasladar(dx, dy);
    }
    public int area() {
	    return ancho * alto;
    }
    public String toString(){
        String texto=origen+" ancho: "+ancho+" alto: "+alto;
        return texto;
    }
}

