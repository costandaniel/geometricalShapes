package geometrical;

import geometrical.entities.Circle;
import geometrical.entities.Rectangle;
import geometrical.entities.Square;
import geometrical.entities.Triangle;

public class Shapes {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Square square = new Square(5);
        Triangle triangle = new Triangle(6);
        Rectangle rectangle = new Rectangle(6, 10);
        System.out.println("Which is the area of the circle?");
        System.out.println(circle.calculateArea());
        System.out.println("Which is the perimeter of the circle?");
        System.out.println(circle.calculatePerimeter());
    }
}
