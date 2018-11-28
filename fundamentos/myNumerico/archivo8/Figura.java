package archivo8;

public abstract class Figura implements java.io.Serializable{
    protected int x;
    protected int y;
    public Figura(int x, int y) {
        this.x=x;
        this.y=y;
    }
    public abstract double area();
}

class Circulo extends Figura{
    protected double radio;
    private static final double PI=3.1416;
    public Circulo(int x, int y, double radio){
        super(x,y);
        this.radio=radio;
    }
    public double area(){
        return PI*radio*radio;
    }
}

class Rectangulo extends Figura{
    protected double ancho, alto;
    public Rectangulo(int x, int y, double ancho, double alto){
        super(x,y);
        this.ancho=ancho;
        this.alto=alto;
    }
    public double area(){
        return ancho*alto;
    }
}
