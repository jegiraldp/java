package facade.figuras;

public class ShapeMaker {

    private iShape circle;
    private iShape rectangle;
    private iShape square;

    public ShapeMaker(){
        circle= new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawSquare(){
        square.draw();
    }

    
}
