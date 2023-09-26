package geometrical.entities;

public class Circle extends Shape{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    public double calculatePerimeter(){
        this.perimeter = 2 * Math.PI * this.radius;
        return this.perimeter;
    }
    public double calculateArea(){
        this.area = Math.PI * this.radius * this.radius;
        return this.area;
    }
}
