package figuras1;

public abstract class Figura {
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
    public Circulo(int x, int y, double radio){
        super(x,y);
        this.radio=radio;
    }
    public double area(){
        return Math.PI*radio*radio;
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

class Cuadrado extends Rectangulo{
    public Cuadrado(int x, int y, double dimension){
        super(x, y, dimension, dimension);
    }
}

class Triangulo extends Figura{
    protected double base, altura;
    public Triangulo(int x, int y, double base, double altura){
        super(x, y);
        this.base=base;
        this.altura=altura;
    }
    public double area(){
        return base*altura/2;
    }
}

