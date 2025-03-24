package prototype.figuras;

public class Rectangle extends Shape {
    public int width;
    public int height;


    
    public Rectangle() {
        super(null);
    }

    public Rectangle(Rectangle target) {
            super(target);
            if(target != null ){
               this.width= target.width;
               this.height=target.height;
            }
        }
    
        @Override
    public Shape clone() {
       return new Rectangle(this);
    }

        @Override
        public String toString() {
            return "Rectangle [x=" + x + ", width=" + width + ", y=" + y + ", height=" + height + ", color=" + color
                    + "]";
        }

    
    
}
