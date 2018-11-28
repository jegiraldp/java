

package archivo5;

public class Punto implements java.io.Serializable {
    private int x;
    private int y;
   public Punto(int x, int y) {
        this.x = x;
	    this.y = y;
    }
  public Punto() {
    x=0;
    y=0;
  }
  public void desplazar(int dx, int dy){
    x+=dx;
    y+=dy;
  }
  public String toString(){
    return new String("("+x+", "+y+")");
  }
} 