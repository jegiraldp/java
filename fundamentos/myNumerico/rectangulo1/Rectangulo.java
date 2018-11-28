 
package rectangulo1;

public class Rectangulo {
    int x;
    int y;
    int ancho;
    int alto;
    public Rectangulo() {
        x=0;
        y=0;
        ancho=0;
        alto=0;
    }
    public Rectangulo(int x1, int y1, int w, int h) {
        x=x1;
        y=y1;
        ancho=w;
        alto=h;
    }
    public Rectangulo(int w, int h) {
        x=0;
        y=0;
        ancho=w;
        alto=h;
    }
    int calcularArea(){
	    return (ancho*alto);
   }
   void desplazar(int dx, int dy){
	    x+=dx;
	    y+=dy;
   }
   boolean estaDentro(int x1, int y1){
	    if((x1>x)&&(x1<x+ancho)&&(y1>y)&&(y1<y+ancho)){
		    return true;
	    }
	    return false;
   }
}
