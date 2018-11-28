
package clonico;

public class Punto implements Cloneable{
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
    public Object clone(){
        Object obj=null;
        try{
            obj=super.clone();
        }catch(CloneNotSupportedException ex){
            System.out.println(" no se puede duplicar");
        }
        return obj;
    }
    public void trasladar(int dx, int dy){
        x+=dx;
        y+=dy;
    }
    public String toString(){
        String texto="origen: ("+x+", "+y+")";
        return texto;
    }
}