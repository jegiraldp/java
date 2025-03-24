package prototype.figuras;

public class Circle extends Shape{
    public int radius;

    public Circle(){
        super(null);

    }

    public Circle(Circle target) {
            super(target);
            if(target != null ){
                this.radius= target.radius;
            }
        }
    
    @Override
    public Shape clone() {
      return new Circle(this);
    }

    @Override
    public String toString() {
        return "Circle [x=" + x + ", radius=" + radius + ", y=" + y + ", color=" + color + "]";
    }

    
    
    
}
