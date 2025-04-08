package prototype.figuras;

import java.util.ArrayList;
import java.util.List;

public class Iniciofiguras {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapeCopies = new ArrayList<>();

        Circle circle = new Circle();
        circle.x=10;
        circle.y=20;
        circle.color="red";
        circle.radius=15;
        shapes.add(circle);

        Rectangle rectangle = new Rectangle();
        rectangle.x=10;
        rectangle.y=20;
        rectangle.color="blue";
        rectangle.width=50;
        rectangle.height=100;
        shapes.add(rectangle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);
        
        Rectangle anotherRectangle = (Rectangle) rectangle.clone();
        shapes.add(anotherRectangle);

        System.out.println("Shape List");
        shapes.forEach(System.out::println);
/*
        for (Shape theShape : shapes) {
            shapeCopies.add(theShape.clone());
        }

        System.out.println("ShapeCopies List");
        shapeCopies.forEach(System.out::println);
       */
        

    }
    
}
